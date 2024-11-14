package compiler_package;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



public class SemanticHandler {
	
	// ****** codici per i messaggi d'errore
	public static int LEXICAL_ERROR 					= 0;
	public static int SYNTAX_ERROR 						= 1;
	public static int ALREADY_DEF_ERROR 				= 110;
	public static int ALREADY_DEF_OP_ERROR 				= 111;
	public static int ALREADY_DEF_REL_ERROR 			= 112;
	public static int NO_DECLARATION_ERROR 				= 12;
	public static int INCORRECT_VALUE 					= 13;
	public static int INVALID_CONSTRUCTOR_ERROR 		= 14;
	
	// ??
	public static int FIRST_WARNING 		= 100;
	public static int NO_REF_WARNING 		= 101;
	
	// ****** attributi semantici globali
	ArrayList<String> classTable;
	ArrayList<String> attTable;
	ArrayList<String> relTable;
	ArrayList<String> opTable;
	ArrayList<String> errors;
	ArrayList<String> warnings;
	
	String currentClass;
		
	public SemanticHandler () {
		classTable = new ArrayList<String>();
		attTable = new ArrayList<String>();
		opTable = new ArrayList<String>();
		relTable = new ArrayList<String>();
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
	}
	
	
	// *********************** metodi di pubblico interesse
		public boolean hasErrors () {
			return (errors.size()!=0);
		}
		public ArrayList<String> getErrors () {
			return errors;
		}
		public int getNErrors () {
			return errors.size();
		}

		public boolean hasWarnings () {
			return (warnings.size()!=0);
		}
		public ArrayList<String> getWarnings () {
			return warnings;
		}
		public int getNWarnings () {
			return warnings.size();
		}
	// ----------------------- fine metodi di pubblico interesse
	
	public void setClass(Token className) {
		currentClass = className.getText();
		attTable.clear();
		opTable.clear();
	}
		
	public boolean isClassDeclared (String name) {
		return classTable.contains(name);
	}
	
	public boolean isAttDeclared (String name) {
		return attTable.contains(name);
	}
	
	public boolean isOpDeclared (String name) {
		return opTable.contains(name);
	}
	
	public boolean isRelDeclared (String name) {
		return relTable.contains(name);
	}
	
	public void manageClassName(Token className) {
		String name = className.getText();
		if (isClassDeclared(name))
			addError (ALREADY_DEF_ERROR, className);
		else {
			classTable.add(name);
		}
	}
	
	public boolean isDefaultValueCorrect(String type, String value) {
	    try {
	        switch (type.toLowerCase()) {
	            case "int":
	                Integer.parseInt(value);  
	                return true;
	            case "float":
	                Float.parseFloat(value);
	                return true;
	            case "double":
	                Double.parseDouble(value);
	                return true;
	            case "boolean":
	                if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
	                    return true;
	                } else {
	                    return false;
	                }
	            case "string":
	                if (value.startsWith("\"") && value.endsWith("\"")) {
	                    return true;
	                }
	            default:
	                return false;
	        }
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	public boolean isConstructor(String methodName, String returnType) {
	    return !currentClass.equals(methodName) && returnType == null;
	}

	public void attDeclaration(String visibility, String arrayType, String type, Token attName, Token defaultValue) {
		String name = attName.getText();
		if (isAttDeclared(name)) {
			addError (ALREADY_DEF_ERROR, attName);
		}
		else if(defaultValue != null && !isDefaultValueCorrect(type, defaultValue.getText())) {
			addError (INCORRECT_VALUE, defaultValue);
		}
		else {
			attTable.add(name);
		}
	}
	
	public String getOpKey(String methodName, String returnType, List<String> paramTypes, List<String> paramNames) {
	    StringBuilder keyBuilder = new StringBuilder(methodName);
	    keyBuilder.append(":").append(returnType);
	    int i = 0;
	    for (String paramType : paramTypes) {
	        keyBuilder.append(":").append(paramTypes.get(i)).append(paramNames.get(i));
	        i++;
	    }
	    return keyBuilder.toString();
	}
	
	public void opDeclaration(String visibility, String returnType, Token opName, List<UmlParser.TypeRuleContext> paramsType, List<Token> paramsName) {
	    String name = opName.getText();
	    
	    List<String> paramTypes = new ArrayList<>();
        for (UmlParser.TypeRuleContext param : paramsType) {
            String paramType = param.getText(); 
            paramTypes.add(paramType);
        }
        
        List<String> paramNames = new ArrayList<>();
        for (Token param : paramsName) {
            String paramName = param.getText(); 
            paramNames.add(paramName);
        }

        String opKey = getOpKey(name, returnType, paramTypes, paramNames);

	    if (isConstructor(name, returnType)) {
	        addError(INVALID_CONSTRUCTOR_ERROR, opName);
	    }
	    if(isOpDeclared(opKey)) {
			addError (ALREADY_DEF_OP_ERROR, opName);
		}
		else {
			opTable.add(opKey);
		}
	}
	
	public void relDeclaration(Token nameRelation, Token nameClass1, String relationType, Token nameClass2) {
		
		if (!isClassDeclared(nameClass1.getText())) {
            addError(NO_DECLARATION_ERROR, nameClass1);
        }
        if (!isClassDeclared(nameClass2.getText())) {
            addError(NO_DECLARATION_ERROR, nameClass2);
        }

        String relKey = nameRelation.getText() + ":" + relationType + ":" + nameClass1.getText() + "->" + nameClass2.getText();

        if (isRelDeclared(relKey))
			addError (ALREADY_DEF_REL_ERROR, nameRelation);
		else {
			relTable.add(relKey);
		}
    }
	
	// *********************** gestione degli errori
	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {
		// TODO Auto-generated method stub
		// caso banale		
					//errors.add("ERRORE SINTATTICO \t *" + hdr + " *\t* " + msg );

					
		/*	distinzione tra errori lessicali e sintattici	
		if (tk.getType() == SimpleJava2023Lexer.ERROR_TOKEN)
			errors.add("ERRORE LESSICALE \t" + hdr + "\t" + msg );
		else
			errors.add("ERRORE SINTATTICO \t" + hdr + "\t" + msg );
		 */	
		
		// Cominciamo a gestire noi gli errori...
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		if (tk.getType() == UmlLexer.ERROR_TOKEN) 
			errors.add("Errore Lessicale in " + coors + ":\t" +msg+"\t"+tk.getText());
		else
			errors.add("Errore Sintattico in " + coors + ":\t" +msg+"\t"+tk.getText());
	}
	
	// gestore gli errori semantici
	void addError (int errCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		
		String msg = "Errore Semantico in " + coors + ":\t";
		if (errCode == ALREADY_DEF_ERROR)
 			msg += "La variabile '" + str + "' e' gia stata dichiarata";
		else if (errCode == ALREADY_DEF_OP_ERROR)
 			msg += "Il metodo '" + str + "' e' gia stato dichiarato";
		else if (errCode == ALREADY_DEF_REL_ERROR)
 			msg += "La relazione '" + str + "' e' gia stata dichiarat";
 		else if (errCode == NO_DECLARATION_ERROR)
 			msg += "La variabile '" + str + "' non e' stata dichiarata";
 		else if (errCode == INCORRECT_VALUE)
 			msg += "Il valore di default " + str + " e' incompatibile con il tipo";
 		else if (errCode == INVALID_CONSTRUCTOR_ERROR)
            msg += "Il costruttore '" + str + "' non è valido. Deve avere lo stesso nome della classe e un tipo di ritorno 'void'.";

		
 		errors.add(msg);
	}


	
}

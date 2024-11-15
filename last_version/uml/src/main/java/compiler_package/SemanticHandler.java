package compiler_package;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler_package.UmlParser.TypeRuleContext;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;



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
	// key -> nome classe, value -> tutti tipi degli attributi / tipi ritorno funzioni / tipi parametri 
	// che fanno parte di tipi primitivi (int, bool etc).
	Dictionary<String, List<String>> classRelTable;
	// key -> nome classe, value -> lista di classi con cui la classe key ha relazioni.
	Dictionary<String, List<String>> relationsTable;
	ArrayList<String> enumTable;
	ArrayList<String> warnings;    
	ArrayList<String> attTable;
	ArrayList<String> relTable;
	ArrayList<String> enumAttributeTable;    
	ArrayList<String> opTable;
	ArrayList<String> constrTable;
	ArrayList<String> errors;
	
	String currentClass;
	String currentEnum;
		
	public SemanticHandler () {
		classTable = new ArrayList<String>();
		classRelTable = new Hashtable<>();
		relationsTable = new Hashtable<>();
		enumTable = new ArrayList<String>();
		attTable = new ArrayList<String>();
		opTable = new ArrayList<String>();
		constrTable = new ArrayList<String>();
		relTable = new ArrayList<String>();
		enumAttributeTable = new ArrayList<String>();
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
		List<String> listAtt = new ArrayList<>();
		List<String> listRel = new ArrayList<>();
		classRelTable.put(currentClass, listAtt);	
		relationsTable.put(currentClass, listRel);	
		attTable.clear();
		opTable.clear();
		constrTable.clear();
	}
	
	public void setEnum(Token enumName) {
		currentEnum = enumName.getText();
		enumAttributeTable.clear();
	}
		
	public boolean isClassDeclared (String name) {
		return classTable.contains(name);
	}
	
	public boolean isAttDeclared (String name) {
		return attTable.contains(name);
	}

	public boolean isEnumDeclared (String name) {
		return enumAttributeTable.contains(name);
	}
	
	public boolean isOpDeclared (String name) {
		return opTable.contains(name);
	}
	
	public boolean isConstrDeclared (String name) {
		return constrTable.contains(name);
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
	
	public void manageEnum(Token nameE) {
		String name = nameE.getText();
		
		if (isClassDeclared(name))
			addError (ALREADY_DEF_ERROR, nameE);
		else {
			classTable.add(name);
			enumTable.add(name);
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
	
	public boolean isConstructor(String methodName) {
	    return !currentClass.equals(methodName);
	}
	
	public boolean isType(String type) {
	    switch (type.toLowerCase()) {
	        case "int":
	        case "float":
	        case "long":
	        case "double":
	        case "boolean":
	        case "char":
	        case "string":
	        case "void":
	            return false;
	        default:
	            return true;
	    }
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
			if(isType(type)) {
				List<String> listAtt = classRelTable.get(currentClass);
				listAtt.add(type);
				classRelTable.put(currentClass, listAtt);
			}
		}
	}
	
	public void enumDeclaration(List<Token> tEnums) {
		for(Token tEnum : tEnums) {
			String name = tEnum.getText();
			if (isEnumDeclared(name)) {
				addError (ALREADY_DEF_ERROR, tEnum);
			}else {
				enumAttributeTable.add(name);
			}
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
	
	public String getConstrKey(String methodName, List<String> paramTypes, List<String> paramNames) {
	    StringBuilder keyBuilder = new StringBuilder(methodName);
	    int i = 0;
	    for (String paramType : paramTypes) {
	        keyBuilder.append(":").append(paramTypes.get(i)).append(paramNames.get(i));
	        i++;
	    }
	    return keyBuilder.toString();
	}
	
	//cancrata -- passo sia il Token sia le Regole ? 
	/*public void opDeclaration(String visibility, Object returnType, Token opName, List<TypeRuleContext> paramsType, List<Token> paramsName) {
		Token retType;
		if (returnType instanceof Token) {
			retType = (Token) returnType;
		}
		
	}*/
	
	public void opDeclaration(String visibility, String returnType, Token opName, List<UmlParser.TypeRuleContext> paramsType, List<Token> paramsName) {
	    String name = opName.getText();
		List<String> listAtt = classRelTable.get(currentClass);
	    	    
	    if(returnType != null && isType(returnType)) {
			listAtt.add(returnType);
		}
	    
	    List<String> paramTypes = new ArrayList<>();
        for (UmlParser.TypeRuleContext param : paramsType) {
        	String paramType = param.getText(); 
            paramTypes.add(paramType);
            
            if(isType(paramType)) {
    			listAtt.add(paramType);
    		}
        }
        
        List<String> paramNames = new ArrayList<>();
        for (Token param : paramsName) {
            String paramName = param.getText(); 
            paramNames.add(paramName);
        }

        String opKey = getOpKey(name, returnType, paramTypes, paramNames);

	    if(isOpDeclared(opKey)) {
			addError (ALREADY_DEF_OP_ERROR, opName);
		}
		else {
			opTable.add(opKey);
		}
		classRelTable.put(currentClass, listAtt);
	}
	
	public void constrDeclaration(Token opName, List<UmlParser.TypeRuleContext> paramsType, List<Token> paramsName) {
	    String name = opName.getText();
		List<String> listAtt = classRelTable.get(currentClass);
	    	    
	    
	    List<String> paramTypes = new ArrayList<>();
        for (UmlParser.TypeRuleContext param : paramsType) {
        	String paramType = param.getText(); 
            paramTypes.add(paramType);
            
            if(isType(paramType)) {
    			listAtt.add(paramType);
    		}
        }
        
        List<String> paramNames = new ArrayList<>();
        for (Token param : paramsName) {
            String paramName = param.getText(); 
            paramNames.add(paramName);
        }

        String opKey = getConstrKey(name, paramTypes, paramNames);

	    if(!isConstructor(opKey)) {
	        addError(INVALID_CONSTRUCTOR_ERROR, opName);
	    }        
        
	    if(isConstrDeclared(opKey)) {
			addError (ALREADY_DEF_OP_ERROR, opName);
		}
		else {
			constrTable.add(opKey);
		}
		classRelTable.put(currentClass, listAtt);
	}
	
	
	public void relDeclaration(Token nameRelation, Token nameClass1, String relationType, Token nameClass2) {
		
		if (!isClassDeclared(nameClass1.getText())) {
            addError(NO_DECLARATION_ERROR, nameClass1);
        }
        if (!isClassDeclared(nameClass2.getText())) {
            addError(NO_DECLARATION_ERROR, nameClass2);
        }
        
        //check for shared or composition if correct
        if(relationType != "<") {
    		List<String> listRel = relationsTable.get(nameClass1.getText());
    		listRel.add(nameClass2.getText());
    		relationsTable.put(nameClass1.getText(), listRel);
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
            msg += "Il costruttore '" + str + "' non � valido. Deve avere lo stesso nome della classe e un tipo di ritorno 'void'.";

		
 		errors.add(msg);
	}
	
	public void relationsCoherent() {
		
		Enumeration<String> keys = classRelTable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            List<String> lista1 = classRelTable.get(key);
            List<String> lista2 = relationsTable.get(key);
            
            List<String> leftJoinResult = new ArrayList<>(lista1);
            
            // Add matching elements from lista2 to the result
            for (String element : lista1) {
                if (lista2.contains(element)) {
                    leftJoinResult.add(element);  // Adding matched elements
                }
            }
                        
            leftJoinResult.removeAll(lista2);
            
            // Remove elements that exist in enumTable from the result list
            leftJoinResult.removeAll(enumTable);

            // Remove duplicates from the result list
            leftJoinResult = new ArrayList<>(new HashSet<>(leftJoinResult));
            
            /*for(String error : leftJoinResult) {
            	Token t = new Token(error);
            }*/
            //addError (NO_DECLARATION_ERROR, nameRelation);
            System.out.println("Classe " + key + "  unione senza intersezione: " + leftJoinResult);
        }
    }
}

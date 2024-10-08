package myCompilerPackage;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;


public class SemanticHandler {
	
	// ****** codici per i messaggi d'errore
	public static int LEXICAL_ERROR 		= 0;
	public static int SYNTAX_ERROR 			= 1;
	public static int ALREADY_DEF_ERROR 	= 11;
	public static int NO_DECLARATION_ERROR 	= 12;
	
	// ??
	public static int FIRST_WARNING 		= 100;
	public static int NO_REF_WARNING 		= 101;
	
	// ****** attributi semantici globali
	ArrayList<String> classTable;
	ArrayList<String> attTable;
	ArrayList<String> errors;
	ArrayList<String> warnings;
	
	String currentClass;
		
	public SemanticHandler () {
		classTable = new ArrayList<String>();
		attTable = new ArrayList<String>();
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
	
	public boolean isClassDeclared (String name) {
		return classTable.contains(name);
	}
	
	public void manageClassName(Token className) {
		String name = className.getText();
		if (isClassDeclared(name))
			addError (ALREADY_DEF_ERROR, className);
		else {
			classTable.add(name);
		}
	}
	
	public void setClass(Token className) {
		currentClass = className.getText();
		attTable.clear();
	}
	
	public boolean isAttDeclared (String name) {
		return attTable.contains(name);
	}

	// CI SONO PROBLEMI A PASSARE IL MULTIPLICITY PERCHE NON E' UNA STRING
	public void attDeclaration(String visibility, String arrayType, String type, Token attName, Token defaultValue) {
		String name = attName.getText();
		if (isAttDeclared(name))
			addError (ALREADY_DEF_ERROR, attName);
		else {
			attTable.add(name);
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
 			msg += "La variabile '" + str + "' � gi� stata dichiarata";
 		else if (errCode == NO_DECLARATION_ERROR)
 			msg += "La variabile '" + str + "' non � stata dichiarata";
 		errors.add(msg);
	}


	
}

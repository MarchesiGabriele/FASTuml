package myCompilerPackage;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.Token;

import myCompilerPackage.util.Variable;


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
	Hashtable<String, String> classTable;
	ArrayList<String> errors;
	ArrayList<String> warnings;
	String currentClass;
		
	public SemanticHandler () {
		
	}
	
	public boolean isClassDeclared (String name) {
		return classTable.containsKey(name);
	}
	
	public void manageClassName(Token className) {
		String name = className.getText();
		if (isClassDeclared(name))
			addError (ALREADY_DEF_ERROR, className);
		else {
			classTable.put(name, name);
		}
	}
	
	public void setClass(Token className) {
		currentClass = className.getText();
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

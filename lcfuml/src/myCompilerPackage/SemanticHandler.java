package myCompilerPackage;

import java.util.ArrayList;
import java.util.Hashtable;

import myCompilerPackage.util.Variable;

public class SemanticHandler {
	
	// ****** codici per i messaggi d'errore
	public static int LEXICAL_ERROR 		= 0;
	public static int SYNTAX_ERROR 			= 1;
	
	// ??
	public static int FIRST_WARNING 		= 100;
	public static int NO_REF_WARNING 		= 101;
	
	// ****** attributi semantici globali
	Hashtable<String, Variable> symbolTable;
	ArrayList<String> errors;
	ArrayList<String> warnings;
		
	public SemanticHandler () {
		
	}
}

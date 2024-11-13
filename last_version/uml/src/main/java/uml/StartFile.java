package uml;
import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler_package.SemanticHandler;
import compiler_package.UmlJavaVisitor;
// Importa la classe generata automaticamente da ANTLR
import compiler_package.UmlLexer;
import compiler_package.UmlParser;
import compiler_package.UmlPythonVisitor;

/**
 * 
 * @author march
 * 
 * TODO: controllare che il tipo default sia coerente con tupo variabile OK FATTO
 * TODO: aggiungere / togliere puunto e virgola a fine riga (operations)
 * TODO: quando faccio una relazione, si deve tradurre in un extends nel codice java/python
 * TODO: quando ho le relazioni, controllare che le classi già esistano
 * TODO: gestire un costruttore/distruttore Ci sono problemi sul numero di returnType e ID presenti.
 * TODO: costruttore o funzione private in python non corretta
 */

public class StartFile {
    public static void main(String[] args) throws Exception {
                
       //         System.out.println(javaCodep);
        try {
        	String fileIn = ".\\resources\\input.file";
        	String sourceCode = "class Employee{\r\n"
    				+ "        attribute: public int employeeId 15;\r\n"
    				+ "        attribute: public String department paolo6;\r\n"
    				+ "        operation: public String work(int paolo)\r\n"
    				+ "        operation: public String attendMeeting()\r\n"
    				+ "}"
    				+ "class Employee{\r\n"
    				+ "        attribute: public int employeeId 15;\r\n"
    				+ "        attribute: public String department paolo6;\r\n"
    				+ "        operation: public String work(int paolo)\r\n"
    				+ "        operation: public String attendMeeting()\r\n"
    				+ "}";
            
            // Inizializza il lexer e il parser
        	CharStream charStream = CharStreams.fromFileName(fileIn);
            UmlLexer lexer = new UmlLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UmlParser parser = new UmlParser(tokens);
            ParseTree tree = parser.start();

            	    
    	    // 5. mi faccio restituire l'handler semantico per analizzare i risultati
    	    SemanticHandler h = parser.getHandler();
    	    if (!h.hasErrors()) {
    	    	System.out.println ("*** Parsing completato ***\n\n");
    	    	
	            System.out.println("////////////////////// Codice Java //////////////////");
	    	    
	    	    // Crea un visitor e avvia la visita
	            UmlJavaVisitor javaVisitor = new UmlJavaVisitor();
	            String javaCode = javaVisitor.visit(tree);
	            System.out.println(javaCode);
	            
	            System.out.println("////////////////////// Codice Python //////////////////");
	            
	            UmlPythonVisitor pythonVisitor = new UmlPythonVisitor();
	            String pythonCode = pythonVisitor.visit(tree);
	            System.out.println(pythonCode);
	        }
    	    else {
    	    	System.out.println ("*** Errore");
    	    	System.out.println ("--- Ci sono stati " + h.getNErrors() + " errori:" );
    	    	for (int n = 0; n<h.getNErrors(); n++)	    	
    	    		System.out.println ((n+1) + " - " + h.getErrors().get(n));		    	
    	    }

    	    if (h.hasWarnings()) {
    		    System.out.println ("--- Ci sono stati " + h.getNWarnings() + " warning:" );
    	    	for (int n = 0; n<h.getNWarnings(); n++)	    	
    	    		System.out.println ((n+1) + " - " + h.getWarnings().get(n));		    		    	
    	    }
    	    
      	
      	} catch (Exception e) {
    			System.out.println ("Parsing con ANTLR abortito\n\n");
    			e.printStackTrace();
      	} 
    }
}

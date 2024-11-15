package uml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler_package.SemanticHandler;
import compiler_package.UmlJavaVisitor;
import compiler_package.UmlParser;
import compiler_package.UmlPythonVisitor;
import converter.UMLDiagram;
import compiler_package.UmlLexer;

/**
 * 
 * 
 * --------------- P1 --------------------
 * TODO: sistemare sintassi relazioni
 * TODO: aggiungere / togliere punto e virgola a fine riga (operations)
 * TODO: ENUM da gestire (controllo del valore di default)
 * TODO: gestire un costruttore/distruttore Ci sono problemi sul numero di returnType e ID presenti.
 * TODO: capire come posizionare le classi nel tool che disegna
 * ---------------------------------------
 * 
 * --------------- P2 --------------------
 * TODO: aggiungere una rule apposita per i costruttori
 * TODO: non dover scrivere sempre operation e attribute
 * TODO: quando c'è un errore di relazione mostrare numero riga e carattere (e non solo nome classe)
 * TODO: aggiungere visibilità classi
 * ---------------------------------------
 * 
 * 
 * 
 * TODO: quando faccio una relazione, si deve tradurre in un extends nel codice java/python 
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
        	    
        	    //UMLDiagram convert = new UMLDiagram(fileIn);
	            UmlJavaVisitor javaVisitor = new UmlJavaVisitor();
	            String javaCode = javaVisitor.visit(tree);
	            generateJavaFile("generated.java", javaCode);
    	    	
	            System.out.println("////////////////////// Codice Java //////////////////");
	    	    
	    	    // Crea un visitor e avvia la visita

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
    
    public static void generateJavaFile(String fileName, String codeContent) {
        // Crea un oggetto File per il file Java
        File file = new File(fileName);

        // Scrivi il contenuto nel file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(codeContent);
            System.out.println("File Java generato con successo: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
}

package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import myCompilerPackage.SemanticHandler;
import myCompilerPackage.UmlLexer;
import myCompilerPackage.UmlParser;

/* 
 * Questa � una classe di esempio
 * che simula un'applicazione 
 * che vuole usare un parser
 */
public class ParserLauncher {
	public static void main(String[] args) {
		UmlParser parser;
		String fileIn = ".\\resources\\input.file";
  	
  	try {
  		// Inizializzazione del parser (antlr docet):
  		//		1. Si inizializza il lexer
  		//		2. Si crea uno stream di token
  		//		3. si istanzia il parser passandogli lo stream di token

  		// 1. 
  		UmlLexer lexer = new UmlLexer (
  										new ANTLRReaderStream(
  											new FileReader(fileIn))); 

  		// 2. 
  		CommonTokenStream tokens = new CommonTokenStream (lexer);	

  		// 3. 
		parser = new UmlParser (tokens);

			
	    // 4. si lancia il parser dallo start simbol (prima produzione specificata)
	    parser.start();
	    
	    // 5. mi faccio restituire l'handler semantico per analizzare i risultati
	    SemanticHandler h = parser.getHandler();
	    if (!h.hasErrors())
	    	System.out.println ("*** OTTIMO! Parsing con ANTLR terminato con successo ***\n\n");
	    else {
	    	System.out.println ("*** ACCIDENTI! Qualcosa � andato storto!");
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

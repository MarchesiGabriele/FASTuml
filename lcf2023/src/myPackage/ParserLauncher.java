package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import myCompilerPackage.SemanticHandler;
import myCompilerPackage.SimpleJava2023Lexer;
import myCompilerPackage.SimpleJava2023Parser;

/* 
 * Questa è una classe di esempio
 * che simula un'applicazione 
 * che vuole usare un parser
 */
public class ParserLauncher {
	public static void main(String[] args) {
		SimpleJava2023Parser parser;
		String fileIn = ".\\resources\\input.file";
  	
  	try {
  		// Inizializzazione del parser (antlr docet):
  		//		1. Si inizializza il lexer
  		//		2. Si crea uno stream di token
  		//		3. si istanzia il parser passandogli lo stream di token

  		// 1. 
  		SimpleJava2023Lexer lexer = new SimpleJava2023Lexer (
  										new ANTLRReaderStream(
  											new FileReader(fileIn))); 

  		// 2. 
  		CommonTokenStream tokens = new CommonTokenStream (lexer);	

  		// 3. 
		parser = new SimpleJava2023Parser (tokens);

			
	    // 4. si lancia il parser dallo start simbol (prima produzione specificata)
	    parser.javaStart();
	    
	    // 5. mi faccio restituire l'handler semantico per analizzare i risultati
	    SemanticHandler h = parser.getHandler();
	    if (!h.hasErrors())
	    	System.out.println ("*** OTTIMO! Parsing con ANTLR terminato con successo ***\n\n");
	    else {
	    	System.out.println ("*** ACCIDENTI! Qualcosa è andato storto!");
	    	System.out.println ("--- Ci sono stati " + h.getNErrors() + " errori:" );
	    	for (int n = 0; n<h.getNErrors(); n++)	    	
	    		System.out.println ((n+1) + " - " + h.getErrors().get(n));		    	
	    }

	    if (h.hasWarnings()) {
		    System.out.println ("--- Ci sono stati " + h.getNWarnings() + " warning:" );
	    	for (int n = 0; n<h.getNWarnings(); n++)	    	
	    		System.out.println ((n+1) + " - " + h.getWarnings().get(n));		    		    	
	    }
	    
	    System.out.println ("--- Questa è la traduzione che ho calcolato e che mostra la notazione polacca postfissa" );
	    System.out.println (h.getTranslation());
	    

  	
  	} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }

}

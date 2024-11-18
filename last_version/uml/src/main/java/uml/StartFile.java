package uml;	

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler_package.SemanticHandler;
import compiler_package.UmlJavaVisitor;
import compiler_package.UmlParser;
import compiler_package.UmlPythonVisitor;
import converter.UMLDiagram;
import compiler_package.UmlLexer;

/**
 * 
 * --------------- P1 --------------------
 * TODO: OK sistemare sintassi relazioni
 * TODO: OK non dover scrivere sempre operation e attribute
 * TODO: OK aggiungere / togliere punto e virgola a fine riga (operations)
 * TODO: OK gestire un costruttore/distruttore Ci sono problemi sul numero di returnType e ID presenti.
 * TODO: OK capire come posizionare le classi nel tool che disegna
 * TODO: OK generazione codice python per enum
 * ---------------------------------------
 * 
 * --------------- P2 --------------------
 * TODO: OK aggiungere una rule apposita per i costruttori
 * TODO: IMPOSSIBILE quando c'� un errore di relazione mostrare numero riga e carattere (e non solo nome classe)
 * TODO: NO aggiungere visibilit� classi
 * ---------------------------------------
 * 
 * 
 * TODO: quando faccio una relazione, si deve tradurre in un extends nel codice java/python
 * TODO: implementare i costruttori in Python
 * TODO: sistemare la posizione delle classi nei diagrammi
 * 
 */

public class StartFile {
	
	File generatedDir;
	
    public static void main(String[] args) throws Exception {
        try {
        	
        	if (args.length < 1) {
                System.out.println("Please provide a file.");
                return;
            }

            String filePath = args[0];  // Get the file path from the command-line argument

            // Check if the file exists
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File doesn't exist: " + filePath);
                return;
            }
            
            
            String fileIn = ".\\resources\\input.file";
            
            final List<String> errorMessages = new ArrayList<>();

            // Inizializza il lexer e il parser
            //CharStream charStream = CharStreams.fromFileName(fileIn);            
            CharStream charStream = CharStreams.fromFileName(file.getName());            
            UmlLexer lexer = new UmlLexer(charStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
	             @Override
	             public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
	                 // Errori sintattici sono legati a un errore nella struttura grammaticale del codice
	                 String coors = "[" + line + ", " + (charPositionInLine + 1) + "]";
	                 errorMessages.add("Lexical error at " + coors + ": " + msg);
	             }
	         });
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UmlParser parser = new UmlParser(tokens);   
            parser.removeErrorListeners();

         // Aggiungi un listener personalizzato per gli errori sintattici
	         parser.addErrorListener(new BaseErrorListener() {
	             @Override
	             public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
	                 // Errori sintattici sono legati a un errore nella struttura grammaticale del codice
	                 String coors = "[" + line + ", " + (charPositionInLine + 1) + "]";
	                 errorMessages.add("Sintax error at " + coors + ": " + msg);
	             }
	         });
            ParseTree tree = parser.start();

            // 5. mi faccio restituire l'handler semantico per analizzare i risultati
            SemanticHandler h = parser.getHandler();
            if (!h.hasErrors() && errorMessages.size()==0) {
                System.out.println("*** Parsing completed ***\n\n");
                
                // Crea la directory 'generated' se non esiste
                File generatedDir = new File("generated");
                if (!generatedDir.exists()) {
                    if (generatedDir.mkdir()) {
                        System.out.println("Folder 'generated' created.");
                    } else {
                        System.err.println("Error during folder creation 'generated'.");
                    }
                }
                
                UMLDiagram convert = new UMLDiagram();
                convert.visit(tree);

                UmlJavaVisitor javaVisitor = new UmlJavaVisitor();
                String javaCode = javaVisitor.visit(tree);
                generateFile("javaGenerated.java", javaCode);

                System.out.println("\n");

                UmlPythonVisitor pythonVisitor = new UmlPythonVisitor();
                String pythonCode = pythonVisitor.visit(tree);
                generateFile("pythonGenerated.py", pythonCode);
            } 
            
            if(errorMessages.size()!=0){
                System.out.println("*** Error ");
                for(String error : errorMessages) {
                    System.out.println(error);
                }
            }
            
            if(h.hasErrors()) {
                System.out.println("*** Error");
                for (int n = 0; n < h.getNErrors(); n++)
                    System.out.println(h.getErrors().get(n));
            }

            if (h.hasWarnings()) {
                for (int n = 0; n < h.getNWarnings(); n++)
                    System.out.println(h.getWarnings().get(n));
            }

        } catch (Exception e) {
            System.out.println("Parsing with ANTLR aborted\n\n");
            e.printStackTrace();
        }
    }

    public static void generateFile(String fileName, String codeContent) {
        // Crea un oggetto File per il file nella cartella 'generated'
        File file = new File("generated", fileName);

        // Determina il linguaggio del file
        String language = fileName.contains("py") ? "Python" : "Java";
        System.out.println("Generation of " + language + " file.");

        // Scrivi il contenuto nel file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(codeContent);
            System.out.println(language + " file succesfully generated: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error during writing file: " + e.getMessage());
        }
    }
}

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
 * TODO: IMPOSSIBILE quando c'è un errore di relazione mostrare numero riga e carattere (e non solo nome classe)
 * TODO: NO aggiungere visibilità classi
 * ---------------------------------------
 * 
 * 
 * TODO: quando faccio una relazione, si deve tradurre in un extends nel codice java/python
 * TODO: implementare i costruttori in Python
 * TODO: sistemare la posizione delle classi nei diagrammi
 * 
 */

public class StartFile {
    public static void main(String[] args) throws Exception {
        try {
            String fileIn = ".\\resources\\input.file";

            // Inizializza il lexer e il parser
            CharStream charStream = CharStreams.fromFileName(fileIn);
            UmlLexer lexer = new UmlLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UmlParser parser = new UmlParser(tokens);
            ParseTree tree = parser.start();

            // 5. mi faccio restituire l'handler semantico per analizzare i risultati
            SemanticHandler h = parser.getHandler();
            if (!h.hasErrors()) {
                System.out.println("*** Parsing completato ***\n\n");

                UMLDiagram convert = new UMLDiagram();
                convert.visit(tree);

                UmlJavaVisitor javaVisitor = new UmlJavaVisitor();
                String javaCode = javaVisitor.visit(tree);
                generateFile("javaGenerated.java", javaCode);

                System.out.println("\n");

                UmlPythonVisitor pythonVisitor = new UmlPythonVisitor();
                String pythonCode = pythonVisitor.visit(tree);
                generateFile("pythonGenerated.py", pythonCode);
            } else {
                System.out.println("*** Errore");
                System.out.println("--- Ci sono stati " + h.getNErrors() + " errori:");
                for (int n = 0; n < h.getNErrors(); n++)
                    System.out.println((n + 1) + " - " + h.getErrors().get(n));
            }

            if (h.hasWarnings()) {
                System.out.println("--- Ci sono stati " + h.getNWarnings() + " warning:");
                for (int n = 0; n < h.getNWarnings(); n++)
                    System.out.println((n + 1) + " - " + h.getWarnings().get(n));
            }

        } catch (Exception e) {
            System.out.println("Parsing con ANTLR abortito\n\n");
            e.printStackTrace();
        }
    }

    public static void generateFile(String fileName, String codeContent) {
        // Crea la directory 'generated' se non esiste
        File generatedDir = new File("generated");
        if (!generatedDir.exists()) {
            if (generatedDir.mkdir()) {
                System.out.println("Cartella 'generated' creata.");
            } else {
                System.err.println("Errore nella creazione della cartella 'generated'.");
            }
        }

        // Crea un oggetto File per il file nella cartella 'generated'
        File file = new File(generatedDir, fileName);

        // Determina il linguaggio del file
        String language = fileName.contains("py") ? "Python" : "Java";
        System.out.println("Generazione del file " + language);

        // Scrivi il contenuto nel file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(codeContent);
            System.out.println(language + " file generato con successo: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
}

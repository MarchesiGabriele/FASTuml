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
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler_package.SemanticHandler;
import compiler_package.UmlJavaVisitor;
import compiler_package.UmlParser;
import compiler_package.UmlPythonVisitor;
import converter.UMLDiagram;
import compiler_package.UmlLexer;

public class StartFile {

    public static void main(String[] args) throws Exception {
        String fileIn = ".\\resources\\input.file"; // Default input file
        String language = "none"; // Default language to generate
        String outputFolder = "generated"; // Default output folder
        String javaFileName = "javaGenerated.java"; // Default Java file name
        String pythonFileName = "pythonGenerated.py"; // Default Python file name
        

        // Parse command-line arguments
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--input-file":
                    fileIn = args[++i];
                    break;
                case "--language":
                    language = args[++i].toLowerCase();
                    break;
                case "--output-folder":
                    outputFolder = args[++i];
                    break;
                case "--java-file":
                    javaFileName = args[++i];
                    break;
                case "--python-file":
                    pythonFileName = args[++i];
                    break;
                default:
                    System.err.println("Unknown argument: " + args[i]);
                    return;
            }
        }

        // Ensure output folder exists
        File generatedDir = new File(outputFolder);
        if (!generatedDir.exists()) {
            if (generatedDir.mkdir()) {
                System.out.println("Folder '" + outputFolder + "' created.");
            } else {
                System.err.println("Error creating folder '" + outputFolder + "'.");
                return;
            }
        }

        try {
            final List<String> errorMessages = new ArrayList<>();

            // Initialize lexer and parser
            CharStream charStream = CharStreams.fromFileName(fileIn);
            UmlLexer lexer = new UmlLexer(charStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    String coors = "[" + line + ", " + (charPositionInLine + 1) + "]";
                    errorMessages.add("Lexical error at " + coors + ": " + msg);
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UmlParser parser = new UmlParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    String coors = "[" + line + ", " + (charPositionInLine + 1) + "]";
                    errorMessages.add("Syntax error at " + coors + ": " + msg);
                }
            });
            ParseTree tree = parser.start();

            // Semantic handler
            SemanticHandler h = parser.getHandler();
            if (!h.hasErrors() && errorMessages.isEmpty()) {
                System.out.println("*** Parsing completed ***");

                UMLDiagram convert = new UMLDiagram();
                convert.visit(tree);
                if(!language.equals("none")) {
	                if (language.equals("java") || language.equals("both")) {
	                    UmlJavaVisitor javaVisitor = new UmlJavaVisitor();
	                    String javaCode = javaVisitor.visit(tree);
	                    generateFile(outputFolder, javaFileName, javaCode, "Java");
	                }
	
	                if (language.equals("python") || language.equals("both")) {
	                    UmlPythonVisitor pythonVisitor = new UmlPythonVisitor();
	                    String pythonCode = pythonVisitor.visit(tree);
	                    generateFile(outputFolder, pythonFileName, pythonCode, "Python");
	                }
	            }
            }

            if (!errorMessages.isEmpty()) {
                System.out.println("*** Errors encountered:");
                errorMessages.forEach(System.out::println);
            }

            if (h.hasErrors()) {
                System.out.println("*** Semantic errors:");
                h.getErrors().forEach(System.out::println);
            }

            if (h.hasWarnings()) {
                System.out.println("*** Warnings:");
                h.getWarnings().forEach(System.out::println);
            }

        } catch (Exception e) {
            System.err.println("Parsing with ANTLR aborted.");
            e.printStackTrace();
        }
    }

    public static void generateFile(String folder, String fileName, String codeContent, String language) {
        File file = new File(folder, fileName);
        System.out.println("Generating " + language + " file...\n");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(codeContent);
            System.out.println(language + " file successfully generated: " + file.getAbsolutePath() + "\n");
        } catch (IOException e) {
            System.err.println("Error writing " + language + " file: " + e.getMessage());
        }
    }
}

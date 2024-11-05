import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// Importa la classe generata automaticamente da ANTLR
import MyLanguageBaseVisitor;
import MyLanguageLexer;
import MyLanguageParser;

public class Main {
    public static void main(String[] args) throws Exception {
        String sourceCode = "var x = 5; x = x + 1;";
        
        // Inizializza il lexer e il parser
        CharStream input = CharStreams.fromString(sourceCode);
        MyLanguageLexer lexer = new MyLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLanguageParser parser = new MyLanguageParser(tokens);
        ParseTree tree = parser.program();

        // Crea un visitor e avvia la visita
        MyLanguageToJavaVisitor visitor = new MyLanguageToJavaVisitor();
        String javaCode = visitor.visit(tree);

        System.out.println(javaCode);
    }
}

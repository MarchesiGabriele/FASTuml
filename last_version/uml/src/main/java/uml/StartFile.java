package uml;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler_package.UmlJavaVisitor;
// Importa la classe generata automaticamente da ANTLR
import compiler_package.UmlLexer;
import compiler_package.UmlParser;


public class StartFile {
    public static void main(String[] args) throws Exception {
        String sourceCode = "class Employee{\r\n"
				+ "        attribute: public int employeeId;\r\n"
				+ "        attribute: public String department;\r\n"
				+ "        \r\n"
				+ "        operation: public String work()\r\n"
				+ "        operation: public String attendMeeting()\r\n"
				+ "}";
        
        // Inizializza il lexer e il parser
        CharStream input = CharStreams.fromString(sourceCode);
        UmlLexer lexer = new UmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UmlParser parser = new UmlParser(tokens);
        ParseTree tree = parser.start();

        // Crea un visitor e avvia la visita
        UmlJavaVisitor visitor = new UmlJavaVisitor();
        String javaCode = visitor.visit(tree);

        System.out.println(javaCode);
    }
}

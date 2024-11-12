package uml;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler_package.UmlJavaVisitor;
// Importa la classe generata automaticamente da ANTLR
import compiler_package.UmlLexer;
import compiler_package.UmlParser;
import compiler_package.UmlPythonVisitor;


/**
 * 
 * @author march
 * 
 * TODO: controllare che il tipo default sia coerente con tupo variabile
 * TODO: aggiungere / togliere puunto e virgola a fine riga (operations)
 * TODO: quando faccio una relazione, si deve tradurre in un extends nel codice java/python
 * TODO: quando ho le relazioni, controllare che le classi già esistano
 */

public class StartFile {
    public static void main(String[] args) throws Exception {
        String sourceCode = "class Employee{\r\n"
				+ "        attribute: public int employeeId 15;\r\n"
				+ "        attribute: public String department paolo6;\r\n"
				+ "        operation: public String work(int paolo)\r\n"
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
        
        System.out.println("////////////////////// PYTONEEEEEEEEEEEEEEE //////////////////");
        
        
        // Crea un visitor e avvia la visita
        UmlPythonVisitor visitorp = new UmlPythonVisitor();
        String javaCodep = visitorp.visit(tree);

        
        System.out.println(javaCodep);
        
    }
}

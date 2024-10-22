package converter;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.mxgraph.util.mxConstants;

import javax.swing.*;
import java.util.Hashtable;

public class UMLDiagram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UML Class Diagram Example");
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        // Definisco uno stile personalizzato per le classi UML
        Hashtable<String, Object> style = new Hashtable<>();
        style.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_SWIMLANE);
        style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_TOP);
        style.put(mxConstants.STYLE_LABEL_BACKGROUNDCOLOR, "none");
        style.put(mxConstants.STYLE_FONTCOLOR, "black"); // Trasparente
        style.put(mxConstants.STYLE_STROKECOLOR, "black");
        style.put(mxConstants.STYLE_FILLCOLOR, "#e0e0e0");
        style.put(mxConstants.STYLE_STARTSIZE, 30); // Spazio per il nome della classe
        graph.getStylesheet().putCellStyle("CLASS", style);

        graph.getModel().beginUpdate();
        try {
            
            // Stile per freccia di ereditarietà (triangolo pieno o vuoto)
            Hashtable<String, Object> styleInheritance = new Hashtable<>();
            styleInheritance.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
            styleInheritance.put(mxConstants.STYLE_ENDFILL, 0);
            styleInheritance.put(mxConstants.STYLE_FILLCOLOR, "none"); // Triangolo vuoto
            styleInheritance.put(mxConstants.STYLE_STROKECOLOR, "black");
            graph.getStylesheet().putCellStyle("inheritance", styleInheritance);

            // Stile per freccia di associazione (freccia)
            Hashtable<String, Object> styleAssociation = new Hashtable<>();
            styleAssociation.put(mxConstants.STYLE_ENDARROW, mxConstants.EDGESTYLE_ENTITY_RELATION);
            styleAssociation.put(mxConstants.STYLE_ENDFILL, 0);
            styleAssociation.put(mxConstants.STYLE_FILLCOLOR, "black");
            styleAssociation.put(mxConstants.STYLE_STROKECOLOR, "black");
            graph.getStylesheet().putCellStyle("association", styleAssociation);

            // Stile per composizione (rombo pieno)
            Hashtable<String, Object> styleComposition = new Hashtable<>();
            styleComposition.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_DIAMOND);
            styleComposition.put(mxConstants.STYLE_ENDFILL, 0);
            styleComposition.put(mxConstants.STYLE_FILLCOLOR, "black");
            styleComposition.put(mxConstants.STYLE_STROKECOLOR, "black");
            graph.getStylesheet().putCellStyle("composition", styleComposition);

            // Stile per aggregazione (rombo vuoto)
            Hashtable<String, Object> styleAggregation = new Hashtable<>();
            styleAggregation.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_DIAMOND);
            styleAggregation.put(mxConstants.STYLE_ENDFILL, 1);
            styleAggregation.put(mxConstants.STYLE_FILLCOLOR, "none"); // Rombino vuoto
            styleAggregation.put(mxConstants.STYLE_STROKECOLOR, "black"); // Bordo nero
            graph.getStylesheet().putCellStyle("aggregation", styleAggregation);
            
            // Aggiungo la classe A con nome, attributi e metodi separati
            Object v1 = graph.insertVertex(parent, null, "ClasseA", 20, 20, 160, 140, "CLASS");

            // Sezione degli attributi
            Object attrA1 = graph.insertVertex(v1, null, "- attributo1", 0, 30, 140, 20, "text;strokeColor=none;fillColor=none");
            Object attrA2 = graph.insertVertex(v1, null, "- attributo2", 0, 50, 140, 20, "text;strokeColor=none;fillColor=none");

            // Linea divisoria tra attributi e metodi
            Object dividerA = graph.insertVertex(v1, null, "", 0, 70, 160, 1, "strokeColor=black;fillColor=black");

            // Sezione dei metodi
            Object methodA1 = graph.insertVertex(v1, null, "+ metodo1()", 0, 80, 140, 20, "text;strokeColor=none;fillColor=none");
            Object methodA2 = graph.insertVertex(v1, null, "+ metodo2()", 0, 100, 140, 20, "text;strokeColor=none;fillColor=none");

            // Aggiungo la classe B con nome, attributi e metodi separati
            Object v2 = graph.insertVertex(parent, null, "ClasseB", 240, 20, 160, 100, "CLASS");
            Object attrB1 = graph.insertVertex(v2, null, "- attributo1", 0, 0, 140, 20, "text;strokeColor=none;fillColor=none");

            Object dividerB = graph.insertVertex(v2, null, "", 0, 50, 160, 1, "strokeColor=black;fillColor=black");

            Object methodB1 = graph.insertVertex(v2, null, "+ metodo1()", 0, 60, 140, 20, "text;strokeColor=none;fillColor=none");

            // Aggiungo una terza classe come esempio
            Object v3 = graph.insertVertex(parent, null, "ClasseC", 240, 200, 160, 30, "CLASS");

            // Aggiungo una quarta classe per ulteriori esempi
            Object v4 = graph.insertVertex(parent, null, "ClasseD", 20, 200, 160, 30, "CLASS");

            // Aggiungo relazioni (freccia di ereditarietà)
            Object inheritanceEdge = graph.insertEdge(parent, null, "Eredità", v1, v2, "inheritance");
            Object associationEdge = graph.insertEdge(parent, null, "Associazione", v2, v3, "association");
            Object compositionEdge = graph.insertEdge(parent, null, "Composizione", v2, v4, "composition"); // Composizione
            Object aggregationEdge = graph.insertEdge(parent, null, "Aggregazione", v3, v4, "aggregation"); // Aggregazione

            // Aggiungo molteplicità accanto ai nodi (classi)
            // Posiziono le molteplicità
            graph.insertVertex(parent, null, "1", 100, 100, 30, 20, "text;strokeColor=none;fillColor=none");  // Molteplicità accanto a ClasseA
            graph.insertVertex(parent, null, "0..*", 410, 70, 40, 20, "text;strokeColor=none;fillColor=none"); // Molteplicità accanto a ClasseB
            graph.insertVertex(parent, null, "0..1", 410, 220, 40, 20, "text;strokeColor=none;fillColor=none"); // Molteplicità accanto a ClasseC
            graph.insertVertex(parent, null, "1", 10, 220, 30, 20, "text;strokeColor=none;fillColor=none"); // Molteplicità accanto a ClasseD

            // Aggiungo molteplicità sugli archi
            graph.cellLabelChanged(inheritanceEdge, "1", true); // Molteplicità su ClasseA
            graph.cellLabelChanged(associationEdge, "0..*", true); // Molteplicità su ClasseB
            graph.cellLabelChanged(compositionEdge, "0..1", true); // Molteplicità su ClasseC
            graph.cellLabelChanged(aggregationEdge, "1", true); // Molteplicità su ClasseD
            
            
        } finally {
            graph.getModel().endUpdate();
        }

        // Configura e mostra il grafico
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        frame.getContentPane().add(graphComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }
}

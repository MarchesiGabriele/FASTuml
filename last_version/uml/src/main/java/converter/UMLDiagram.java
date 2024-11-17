package converter;

import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import compiler_package.UmlBaseVisitor;
import compiler_package.UmlParser;
import compiler_package.UmlParser.ClassDefinitionRuleContext;
import compiler_package.UmlParser.EnumDefinitionRuleContext;
import compiler_package.UmlParser.RelationCodeRuleContext;

import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxConstants;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class UMLDiagram extends UmlBaseVisitor {
	
	
	int xOffset = 20; // Initial X position for the first class
    int yOffset = 20; // Initial Y position for the first class
    int verticalSpacing = 100; // Vertical spacing between rows of classes
    int horizontalSpacing = 150; // Horizontal spacing between columns of classes
    int attributeVerticalOffset = 30; // Vertical offset for attributes
    int attributeHeight = 20; // Height for each attribute
    
    int classCount = 0;
    
    mxGraph graph;
    Object parent;
    String currentClass;
    Map<String, List<String[]>> classRelations;
    Map<String, Object> classVertices;
    Map<String, List<String>> classAttributes;
    Map<String, List<String>> classOperations; // To store operations

    private static void configureStyles(mxGraph graph) {
        // Stile per la classe
        Hashtable<String, Object> style = new Hashtable<>();
        style.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_SWIMLANE);
        style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_TOP);
        style.put(mxConstants.STYLE_LABEL_BACKGROUNDCOLOR, "none");
        style.put(mxConstants.STYLE_FONTCOLOR, "black");
        style.put(mxConstants.STYLE_STROKECOLOR, "black");
        style.put(mxConstants.STYLE_FILLCOLOR, "#e0e0e0");
        style.put(mxConstants.STYLE_STARTSIZE, 30);
        graph.getStylesheet().putCellStyle("CLASS", style);

        Hashtable<String, Object> attributeStyle = new Hashtable<>();
        attributeStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
        attributeStyle.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_TOP);
        attributeStyle.put(mxConstants.STYLE_FONTCOLOR, "black");
        attributeStyle.put(mxConstants.STYLE_STROKECOLOR, "none");
        attributeStyle.put(mxConstants.STYLE_FILLCOLOR, "none");
        attributeStyle.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
        attributeStyle.put(mxConstants.STYLE_SPACING_LEFT, 4);
        graph.getStylesheet().putCellStyle("ATTRIBUTE", attributeStyle);
        
        Hashtable<String, Object> enumStyle = new Hashtable<>();
        enumStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_SWIMLANE);
        enumStyle.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_TOP);
        enumStyle.put(mxConstants.STYLE_LABEL_BACKGROUNDCOLOR, "none");
        enumStyle.put(mxConstants.STYLE_FONTCOLOR, "black");
        enumStyle.put(mxConstants.STYLE_STROKECOLOR, "black");
        enumStyle.put(mxConstants.STYLE_FILLCOLOR, "#f0f0f0");  // Light color for enums
        enumStyle.put(mxConstants.STYLE_STARTSIZE, 30);
        graph.getStylesheet().putCellStyle("ENUM", enumStyle);

        // Freccia di ereditarietà
        Hashtable<String, Object> styleInheritance = new Hashtable<>();
        styleInheritance.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
        styleInheritance.put(mxConstants.STYLE_ENDFILL, 0);
        styleInheritance.put(mxConstants.STYLE_FILLCOLOR, "none");
        styleInheritance.put(mxConstants.STYLE_STROKECOLOR, "black");
        graph.getStylesheet().putCellStyle("inheritance", styleInheritance);

        // Freccia di associazione
        Hashtable<String, Object> styleAssociation = new Hashtable<>();
        styleAssociation.put(mxConstants.STYLE_ENDARROW, mxConstants.EDGESTYLE_ENTITY_RELATION);
        styleAssociation.put(mxConstants.STYLE_ENDFILL, 0);
        styleAssociation.put(mxConstants.STYLE_FILLCOLOR, "black");
        styleAssociation.put(mxConstants.STYLE_STROKECOLOR, "black");
        graph.getStylesheet().putCellStyle("association", styleAssociation);
        
        // Freccia di associazione
        Hashtable<String, Object> styleComposition = new Hashtable<>();
        styleAssociation.put(mxConstants.STYLE_ENDARROW, mxConstants.EDGESTYLE_ENTITY_RELATION);
        styleAssociation.put(mxConstants.STYLE_ENDFILL, 0);
        styleAssociation.put(mxConstants.STYLE_FILLCOLOR, "black");
        styleAssociation.put(mxConstants.STYLE_STROKECOLOR, "black");
        graph.getStylesheet().putCellStyle("composition", styleComposition);
    }
    
    @Override
    public String visitStart(UmlParser.StartContext ctx) {
    	classRelations = new HashMap<>();
    	classVertices = new HashMap<>();
        classAttributes = new HashMap<>();
        classOperations = new HashMap<>(); // To store operations
        
        JFrame frame = new JFrame("UML Class Diagram");
        graph = new mxGraph();
        parent = graph.getDefaultParent();

        // Definisco gli stili personalizzati per le classi, le relazioni, ecc.
        configureStyles(graph);

        for (ClassDefinitionRuleContext classDef : ctx.classDefinitionRule()) {
            visit(classDef);
        }
        
        for (EnumDefinitionRuleContext enumDef : ctx.enumDefinitionRule()) {
            visit(enumDef);
        } 

        if (ctx.relationsDefinitionRule() != null) {
            visit(ctx.relationsDefinitionRule());
        }
        
        createUML();
        graph.getModel().endUpdate();
        
        // Applica un layout organico per sistemare le classi automaticamente
        mxOrganicLayout layout = new mxOrganicLayout(graph); // Regola la distanza tra le classi
        layout.setMinMoveRadius(60);
        layout.execute(graph.getDefaultParent());
        
        // Configura e mostra il grafico
        
        /*mxGraphComponent graphComponent = new mxGraphComponent(graph);
        frame.getContentPane().add(graphComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // This maximizes the frame to full screen
        frame.setVisible(true);*/
        
        try {
            // Get the image from the graph
            Image image = mxCellRenderer.createBufferedImage(graph, null, 1, Color.WHITE, true, null);
            
            // Save the image to a file
            File file = new File("generated/image.png");
            ImageIO.write((BufferedImage) image, "PNG", file);
            System.out.println("UML Diagram exported to: " + file.getAbsolutePath() + "\n");
        } catch (IOException e) {
            System.err.println("Error exporting UML diagram to PNG: " + e.getMessage() + "\n");
        }
        
        return "";
    }
    
    @Override
    public String visitClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx) {
        String className = ctx.c.getText();
        currentClass = className;

        // Handle class declarations
        className = ctx.c.getText();

        // Adjust class position dynamically
        int adjustedXOffset = xOffset  + classCount * 10 * horizontalSpacing; // Adjust horizontal position after every 3 classes

        Object classVertex = graph.insertVertex(parent, null, className, adjustedXOffset, 0, horizontalSpacing, verticalSpacing, "CLASS");

        classVertices.put(className, classVertex);
        classAttributes.put(className, new ArrayList<String>());
        classOperations.put(className, new ArrayList<String>()); // Initialize list for operations
        classCount++; // Increment class counter
        
        // Genera il codice per il corpo della classe
        visit(ctx.classCodeRule());

        return "";
    }
    
    @Override
    public String visitClassCodeRule(UmlParser.ClassCodeRuleContext ctx) {
        // Itera sugli attributi e operazioni
        for (ParseTree child : ctx.children) {
            if (child instanceof UmlParser.AttributeDeclarationRuleContext) {
                visit((UmlParser.AttributeDeclarationRuleContext) child);
            } else if (child instanceof UmlParser.OperationDeclarationRuleContext) {
                visit((UmlParser.OperationDeclarationRuleContext) child);
            }else if (child instanceof UmlParser.ConstructorDeclarationRuleContext) {
                visit((UmlParser.ConstructorDeclarationRuleContext) child);
            }
        }

        return "";
    }
    
    @Override
    public String visitAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx) {
        String visibility = (String) visit(ctx.visibilityRule());
        String type = ctx.typeRule().getText();
        String attributeName = ctx.a.getText();

        if (ctx.arrayTypeRule() != null) {
            // Se  un tipo array, aggiungiamo "List" o "Set" a seconda del tipo
            if (ctx.arrayTypeRule().getText().equals("Set")) {
                type = "Set<" + type + ">";
            } else if (ctx.arrayTypeRule().getText().equals("List")) {
                type = "List<" + type + ">";
            }
        }

        StringBuilder attrCode = new StringBuilder();
        attrCode.append("\t").append(visibility).append(" ").append(attributeName).append(":").append(type);

        if (ctx.d != null) {
        	if (type.startsWith("Set<")) {
                attrCode.append(" = [" + ctx.d.getText() + "]");
            } else if (type.startsWith("List<")) {
                attrCode.append(" = [" + ctx.d.getText() + "]");
            } else {
                attrCode.append(" = ").append(ctx.d.getText());
            }
        }

        // Add the attribute to the class
        List<String> attributes = classAttributes.getOrDefault(currentClass, new ArrayList<String>());
        attributes.add(attrCode.toString());
        classAttributes.put(currentClass, attributes);
        
        return "";
    }

    @Override
    public String visitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx) {
        String visibility = (String) visit(ctx.visibilityRule());
        String methodName = ctx.a.getText();

        StringBuilder operationCode = new StringBuilder();
        operationCode.append("\t").append(visibility);
        

        operationCode.append(" ").append(methodName).append("(");

        // Aggiungi i parametri
        for (int i = 1; i < ctx.typeRule().size(); i++) {
            if (i > 1) operationCode.append(", ");
            operationCode.append(ctx.typeRule(i).getText()).append(" ").append(ctx.ID(i).getText());
        }

        operationCode.append(")");

        if (!methodName.equals(currentClass)) {
            operationCode.append(" : ").append(ctx.typeRule(0).getText());
        }

        
        // Add the operation to the class
        List<String> operations = classOperations.getOrDefault(currentClass, new ArrayList<String>());
        operations.add(operationCode.toString());
        classOperations.put(currentClass, operations);
        
        return "";
    }
    
    @Override
    public String visitConstructorDeclarationRule(UmlParser.ConstructorDeclarationRuleContext ctx) {
        String methodName = ctx.a.getText();

        StringBuilder operationCode = new StringBuilder();

        operationCode.append("\t").append(methodName).append("(");

        // Aggiungi i parametri
        for (int i = 0; i < ctx.typeRule().size(); i++) {
            if (i > 0) operationCode.append(", ");
            operationCode.append(ctx.typeRule(i).getText()).append(" ").append(ctx.ID(i+1).getText());
        }

        operationCode.append(")");
        
        List<String> operations = classOperations.getOrDefault(currentClass, new ArrayList<String>());
        operations.add(operationCode.toString());
        classOperations.put(currentClass, operations);
        return "";
    }
    
    @Override
    public String visitRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx) {
        for (RelationCodeRuleContext relation : ctx.relationCodeRule()) {
            visit(relation);
        }
        return "";
    }

    @Override
    public String visitRelationCodeRule(UmlParser.RelationCodeRuleContext ctx) {
        String class1 = ctx.nameClass1.getText();
        String class2 = ctx.nameClass2.getText(); 
        String multiplicity1 = ctx.multiplicityRule(0).getText(); // First multiplicity
        String multiplicity2 = ctx.multiplicityRule(1).getText(); // Second multiplicity

        String relationType = ctx.relationTypeRule().getText();
        
        List<String[]> relations = classRelations.getOrDefault(currentClass, new ArrayList<String[]>());
        relations.add(new String[] {class1, multiplicity1, relationType, class2, multiplicity2});
        
        classRelations.put(currentClass, relations);

        return "";
    }
    
    @Override
    public String visitEnumDefinitionRule(UmlParser.EnumDefinitionRuleContext ctx) {
        String enumName = ctx.n.getText();
        currentClass = enumName;

        // Adjust position for enum
        int adjustedXOffset = xOffset + classCount * 2 * horizontalSpacing;
        Object enumVertex = graph.insertVertex(parent, null, "<<enum>>\n" + enumName, adjustedXOffset, 0, horizontalSpacing, verticalSpacing, "ENUM");

        classVertices.put(enumName, enumVertex);
        classAttributes.put(enumName, new ArrayList<String>());
        classOperations.put(enumName, new ArrayList<String>()); // Initialize list for operations
        classCount++; // Increment for next class or enum
        
        // Handle the values for the Enum (if any)
        for (ParseTree child : ctx.children) {
            if (child instanceof UmlParser.EnumCodeRuleContext) {
                visit((UmlParser.EnumCodeRuleContext) child);
            }
        }
        
        return "";
    }
    
    @Override
    public String visitEnumCodeRule(UmlParser.EnumCodeRuleContext ctx) {

        List<String> values = classAttributes.getOrDefault(currentClass, new ArrayList<String>());
    	for(Token token : ctx.eName) {
            values.add("\t" + token.getText());
    	} 
        classAttributes.put(currentClass, values);
        
        return "";
    }
    
    @Override
    public String visitVisibilityRule(UmlParser.VisibilityRuleContext ctx) {
        if (ctx.PUBLIC() != null) return "+";
        if (ctx.PROTECTED() != null) return "#";
        if (ctx.PRIVATE() != null) return "-";
        if (ctx.PACKAGE() != null) return ""; // Package-private in Java
        
        return "";
    }

    public void createUML() {
        
    	// Insert attributes and operations inside the class vertices
	    for (Map.Entry<String, Object> entry : classVertices.entrySet()) {
	        String classNameRetrieve = entry.getKey();
	        Object classVertex = entry.getValue();
	        List<String> attributes = classAttributes.get(classNameRetrieve);
	        List<String> operations = classOperations.get(classNameRetrieve); // Get operations
	
	        mxGeometry geometry = graph.getModel().getGeometry(classVertex);
	
	        int classWidth = classNameRetrieve.length()*10;  // Base width is based on the class name length
	
	        for (String attribute : attributes) {
	            classWidth = Math.max(classWidth, attribute.length() * 10);  // Update width based on the longest attribute
	        }
	
	        for (String operation : operations) {
	            classWidth = Math.max(classWidth, operation.length() * 10);  // Update width based on the longest operation
	        }
	        int classHeight = 60 + (attributes.size() + operations.size()) * attributeHeight; // Include both attributes and operations
	
	        geometry.setWidth(classWidth);
	        geometry.setHeight(classHeight);
	
	        // Insert attributes and operations
	        for (int i = 0; i < attributes.size(); i++) {
	            int yPosition = attributeVerticalOffset + i * attributeHeight;
	            graph.insertVertex(classVertex, null, attributes.get(i), 10, yPosition, 10, attributeHeight, "ATTRIBUTE");
	        }
	
	        // Create the horizontal line (start at x=20, y=50, width=160, height=0)
	        if(operations.size() > 0) {
	        	graph.insertVertex(classVertex, null, "", 0, attributeVerticalOffset + (attributes.size())* attributeHeight, classWidth, 1, "strokeColor=black;fillColor=black");
	        }
	
	        
	        for (int i = 0; i < operations.size(); i++) {
	            int yPosition = attributeVerticalOffset + (attributes.size() + i) * attributeHeight +10;
	            graph.insertVertex(classVertex, null, operations.get(i), 10, yPosition, 10, attributeHeight, "ATTRIBUTE");
	        }
	        
	        if(classRelations.get(classNameRetrieve) != null) {                	
	        	for(String[] relationship : classRelations.get(classNameRetrieve)) {
	        		String fromClass = relationship[0];
	        		String fromMult = relationship[1];
	        		String type = relationship[2];
	        		String toClass = relationship[3];
	        		String toMult = relationship[4];
	        		
	        		Object fromVertex = classVertices.get(fromClass);
	        		Object toVertex = classVertices.get(toClass);
	        		
	        		if (fromVertex != null && toVertex != null) {
	        			String style;
	        			String label = fromMult + " " + type + " " + toMult;
	        			
	        			if (type.equals("inherits")) {
	        				style = "inheritance";
	        			} else if (type.equals(">")) {
	        				style = "association";
	        			} else if (type.equals("composed")) {
	        				style = "composition"; // Ensure you define this style in configureStyles
	        			} else {
	        				style = ""; // Default or undefined relationship type
	        			}
	        			
	        			graph.insertEdge(parent, null, label, fromVertex, toVertex, style);
	        		}
	        	}
	        }
	     }
	 }
}

package converter;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.mxgraph.util.mxConstants;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class UMLDiagram {
    public UMLDiagram(String file) {
        JFrame frame = new JFrame("UML Class Diagram");
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        // Definisco gli stili personalizzati per le classi, le relazioni, ecc.
        configureStyles(graph);

        // Leggi il file di input e crea il diagramma UML
        try {
            File inputFile = new File(file); // Il tuo file di input
            parseFileAndCreateUML(inputFile, graph, parent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Configura e mostra il grafico
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        frame.getContentPane().add(graphComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // This maximizes the frame to full screen
        frame.setVisible(true);
    }

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

    public static void parseFileAndCreateUML(File inputFile, mxGraph graph, Object parent) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;
        Map<String, Object> classVertices = new HashMap<>();
        Map<String, List<String>> classAttributes = new HashMap<>();
        Map<String, List<String>> classOperations = new HashMap<>(); // To store operations
        Map<String, List<String[]>> classRelations = new HashMap<>(); // To store operations
        int xOffset = 20; // Initial X position for the first class
        int yOffset = 20; // Initial Y position for the first class
        int verticalSpacing = 200; // Vertical spacing between rows of classes
        int horizontalSpacing = 300; // Horizontal spacing between columns of classes
        int attributeVerticalOffset = 30; // Vertical offset for attributes
        int attributeHeight = 20; // Height for each attribute

        String className = "";
        int classCount = 0; // Counter to track how many classes we have added

        try {
            // Process the input file line by line
            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("class ")) {
                    // Handle class declarations
                    className = line.split(" ")[1].replace("{", "").trim();

                    // Adjust class position dynamically
                    int adjustedXOffset = xOffset + classCount * horizontalSpacing; // Adjust horizontal position after every 3 classes
                    int adjustedYOffset = yOffset + classCount * verticalSpacing; // Adjust vertical position after every 3 classes

                    Object classVertex = graph.insertVertex(parent, null, className, adjustedXOffset, 0, horizontalSpacing, verticalSpacing, "CLASS");

                    classVertices.put(className, classVertex);
                    classAttributes.put(className, new ArrayList<>());
                    classOperations.put(className, new ArrayList<>()); // Initialize list for operations
                    classCount++; // Increment class counter
                } else if (line.startsWith("attribute:")) {
                    // Handle attribute declarations
                    String[] parts = line.split(" ");
                    String visibility = parts[1];
                    String type = parts[2];
                    String name = parts[3];
                    String value = parts.length > 4 ? parts[4].replace("\"", "") : "";

                    // Create a map for visibility to UML symbols
                    Map<String, String> visibilityMap = new HashMap<>();
                    visibilityMap.put("public", "+");
                    visibilityMap.put("private", "-");
                    visibilityMap.put("protected", "#");
                    visibilityMap.put("package", "~");

                    // Handle attributes
                    String visibilitySymbol = visibilityMap.getOrDefault(visibility, "");
                    String attribute = visibilitySymbol + " " + type + " " + name + (value.isEmpty() ? "" : " = " + value);

                    // Add the attribute to the class
                    List<String> attributes = classAttributes.getOrDefault(className, new ArrayList<>());
                    attributes.add(attribute);
                    classAttributes.put(className, attributes);
                } else if (line.startsWith("operation:")) {
                    // Handle operation declarations
                    String[] parts = line.split(" ");
                    
                    // Ensure there is at least visibility and method name
                    if (parts.length >= 3) {
                        String visibility = parts[1];
                        String returnType = parts[2].contains("(") ? "void" : parts[2]; // If no return type, use "void"
                        String name = parts[3];
                        String parameters = parts.length > 4 ? parts[4].replace("\"", "") : "";

                        // If return type is missing (for example, "operation: public methodName()"), use "void"
                        if (parts.length == 4) {
                            returnType = "void";  // Default to "void" if no return type is provided
                        }

                        // Create operation string (visibility + return type + method name with parameters)
                        Map<String, String> visibilityMap = new HashMap<>();
                        visibilityMap.put("public", "+");
                        visibilityMap.put("private", "-");
                        visibilityMap.put("protected", "#");
                        visibilityMap.put("package", "~");

                        String visibilitySymbol = visibilityMap.getOrDefault(visibility, "");
                        String operation = visibilitySymbol + " " + returnType + " " + name + "(" + parameters + ")";

                        // Add the operation to the class
                        List<String> operations = classOperations.getOrDefault(className, new ArrayList<>());
                        operations.add(operation);
                        classOperations.put(className, operations);
                    }
                } else if (line.startsWith("relations: ")) {
                	while ((line = reader.readLine()) != null) {
                        line = line.trim();
                        // Handle relationship declarations with cardinality and type
                        String[] relationshipParts = line.split(" ");
                        if (relationshipParts.length >= 7) {
                            // Structure: rel1 ClassA min 1 max 1 type ClassB min 1 max 1
                            String name = relationshipParts[0];
                            String fromClass = relationshipParts[1];
                            String fromMin = relationshipParts[3];
                            String fromMax = relationshipParts[5];
                            String type = relationshipParts[6];
                            String toClass = relationshipParts[7];
                            String toMin = relationshipParts[9];
                            String toMax = relationshipParts[11];
                            
                            List<String[]> relations = classRelations.getOrDefault(className, new ArrayList<>());
                            relations.add(new String[] {fromClass, fromMin, fromMax, type, toClass, toMin, toMax});
                            
                            classRelations.put(className, relations);
                        }
                	}
                }
             }

            // Insert attributes and operations inside the class vertices
            for (Map.Entry<String, Object> entry : classVertices.entrySet()) {
                String classNameRetrieve = entry.getKey();
                Object classVertex = entry.getValue();
                List<String> attributes = classAttributes.get(classNameRetrieve);
                List<String> operations = classOperations.get(classNameRetrieve); // Get operations

                mxGeometry geometry = graph.getModel().getGeometry(classVertex);

                int classWidth = 1;  // Base width is based on the class name length

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
                Object dividerA = graph.insertVertex(classVertex, null, "", 0, attributeVerticalOffset + (attributes.size())* attributeHeight, classWidth, 1, "strokeColor=black;fillColor=black");

                
                for (int i = 0; i < operations.size(); i++) {
                    int yPosition = attributeVerticalOffset + (attributes.size() + i) * attributeHeight +10;
                    graph.insertVertex(classVertex, null, operations.get(i), 10, yPosition, 10, attributeHeight, "ATTRIBUTE");
                }
                
                if(classRelations.get(classNameRetrieve) != null) {                	
                	for(String[] relationship : classRelations.get(classNameRetrieve)) {
                		String fromClass = relationship[0];
                		String fromMin = relationship[1];
                		String fromMax = relationship[2];
                		String type = relationship[3];
                		String toClass = relationship[4];
                		String toMin = relationship[5];
                		String toMax = relationship[6];
                		
                		Object fromVertex = classVertices.get(fromClass);
                		Object toVertex = classVertices.get(toClass);
                		
                		if (fromVertex != null && toVertex != null) {
                			String style;
                			String label = fromMin + ".." + fromMax + " " + type + " " + toMin + ".." + toMax;
                			
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
        } finally {
            graph.getModel().endUpdate();
        }

        reader.close();
    }
}

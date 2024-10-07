package keywords;

import java.util.List;

public class Class {
	private String name;
	List<Attribute> attributes;
	List<Operation> operations;
	
	Class(String name, List<Attribute> attributes, List<Operation> operations){
		this.attributes = attributes;
		this.name = name;
		this.operations = operations;
	}
	
	
}

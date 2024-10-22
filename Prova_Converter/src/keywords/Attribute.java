package keywords;

//TODO: inserire questione del default

public class Attribute {
	String name;
	Visibility visibility;
	String type; // String perchè potrebbe essere anche definitio dall'utente
	ArrayType arrayType; // tipo dell'array
	int[] multiplicity; // min e max in una lista (min?, max?)
	boolean readOnly; // non puoi modificare la variabile

	public Attribute(String name, Visibility visibility, String type, ArrayType arrayType, int[] multiplicity,
			boolean readOnly) {
		super();
		this.name = name;
		this.visibility = visibility;
		this.type = type;
		this.arrayType = arrayType;
		this.multiplicity = multiplicity;
		this.readOnly = readOnly;
	}

	public String getName() {
		return name;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public String getType() {
		return type;
	}

	public ArrayType getArrayType() {
		return arrayType;
	}

	public int[] getMultiplicity() {
		return multiplicity;
	}

	public boolean isReadOnly() {
		return readOnly;
	}
	
	

}

package keywords;

public class Relation {
	private String nomeRelazione;
	private String nomeClasse1;
	private String nomeClasse2;
	private int[] multiplicity1;
	private int[] multiplicity2;
	private Navigability typeRelation; // inherits, oppure -, >, <
	private String type; // shared o composed

	public Relation(String nomeRelazione, String nomeClasse1, String nomeClasse2, int[] multiplicity1,
			int[] multiplicity2, Navigability typeRelation, String type) {
		super();
		this.nomeRelazione = nomeRelazione;
		this.nomeClasse1 = nomeClasse1;
		this.nomeClasse2 = nomeClasse2;
		this.multiplicity1 = multiplicity1;
		this.multiplicity2 = multiplicity2;
		this.typeRelation = typeRelation;
		this.type = type;
	}

	public String getNomeRelazione() {
		return nomeRelazione;
	}

	public String getNomeClasse1() {
		return nomeClasse1;
	}

	public String getNomeClasse2() {
		return nomeClasse2;
	}

	public int[] getMultiplicity1() {
		return multiplicity1;
	}

	public int[] getMultiplicity2() {
		return multiplicity2;
	}

	public Navigability getTypeRelation() {
		return typeRelation;
	}

	public String getType() {
		return type;
	}

}

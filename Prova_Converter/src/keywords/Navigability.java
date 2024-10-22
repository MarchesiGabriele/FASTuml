package keywords;

public enum Navigability {
	// Tipi di collezioni
    INHERITS("inherits"),
    UNDEFINED("-"),
    DXSX("<"),
    SXDX(">");

    // Proprietà per descrivere il tipo
    private String descrizione;

    // Costruttore
    Navigability(String descrizione) {
        this.descrizione = descrizione;
    }

    // Metodo getter per ottenere la descrizione
    public String getDescrizione() {
        return descrizione;
    }
}

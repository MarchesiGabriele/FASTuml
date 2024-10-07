package keywords;

public enum ArrayType {
    // Tipi di collezioni
    SET("Set"),
    MULTISET("Multiset"),
    LIST("List"),
    ORDEREDSET("OrderedSet");

    // Proprietà per descrivere il tipo
    private String descrizione;

    // Costruttore
    ArrayType(String descrizione) {
        this.descrizione = descrizione;
    }

    // Metodo getter per ottenere la descrizione
    public String getDescrizione() {
        return descrizione;
    }
}

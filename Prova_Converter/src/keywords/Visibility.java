package keywords;
public enum Visibility {
    // Livelli di visibilità
    PUBLIC("public"),
    PRIVATE("private"),
    PROTECTED("protected"),
    PACKAGE_PRIVATE("package-private"); // Visibilità di default (nessun modificatore)

    // Proprietà
    private String descrizione;

    // Costruttore
    Visibility(String descrizione) {
        this.descrizione = descrizione;
    }

    // Metodo getter per ottenere la descrizione della visibilità
    public String getDescrizione() {
        return descrizione;
    }
}

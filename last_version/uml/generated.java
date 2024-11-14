class Studente extends Libro {
	protected Set<String> matricola = new HashSet<>(Arrays.asList("12345"));
	public String corso = "Informatica";
	private Libro libro;
	public String studia(int ore, String materia) {
		// TODO: implement
	}

	private void iscriviCorso(String codiceCorso) {
		// TODO: implement
	}

	public Studente() {
		// TODO: implement
	}

}

class Libro {
	private String titolo = "Il Signore degli Anelli";
	public String autore = "Tolkien";
	public int pagine = 1000;
	public void leggi(int pagina) {
		// TODO: implement
	}

	private void aggiornaCopertina(String nuovaCopertina) {
		// TODO: implement
	}

	public Libro() {
		// TODO: implement
	}

}


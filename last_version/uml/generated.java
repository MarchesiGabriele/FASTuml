class ClasseA extends ClasseB {
	public List<int> a = new ArrayList<int>();
	private String name;
	protected List<int> numbers = new ArrayList<int>();
	public void methodA() {
		// TODO: implement
	}

	protected int methodB(int x, String y) {
		// TODO: implement
	}

}

class ClasseB {
	public boolean isActive;
	private Set<String> tags = new HashSet<String>();
	private pippo paolo;
	private void methodC() {
		// TODO: implement
	}

	public ClasseB() {
		// TODO: implement
	}

}

class ClasseC {
	public float price;
	public void methodD() {
		// TODO: implement
	}

	private ClasseB paolo;
}

// Association between ClasseB and ClasseC
// Composition between ClasseA and ClasseC

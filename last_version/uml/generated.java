class ClasseA {
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

class ClasseB extends ClasseA {
	public boolean isActive;
	private Set<String> tags = new HashSet<String>();

	private void methodC() {
		// TODO: implement
	}

	public ClasseB() {
		// TODO: implement
	}
}

class ClasseC {
	public float price;
	public DayOfWeek eventDay;

	public void methodD() {
		// TODO: implement
	}
	private ClasseB paolo;
}

public enum DayOfWeek {
	Monday,
	Tuesday,
	WEDNESDAY

}
// Association between ClasseB and ClasseC
// Composition between ClasseA and ClasseC

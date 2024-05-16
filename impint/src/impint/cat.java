package impint;

public class cat extends Animal implements swimmable,walkable {

	public cat(String name) {
		super(name);
		
	}

	@Override
	public void walk() {
		System.out.println("cat walks");
		
	}

	@Override
	public void swim() {
		System.out.println("cat swims");
		
	}

}

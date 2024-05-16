package koleksiyonlar;



import koleksiyonlar.animal;
import koleksiyonlar.swimmable;
import koleksiyonlar.walkable;

public class cat extends animal implements swimmable,walkable {

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


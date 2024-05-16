package koleksiyonlar;



import koleksiyonlar.animal;
import koleksiyonlar.flyable;
import koleksiyonlar.swimmable;
import koleksiyonlar.walkable;

public class duck extends animal implements walkable,swimmable,flyable{

	public duck(String name) {
		super(name);
		
	}

	@Override
	public void fly() {
		System.out.println("duck flys");
		
	}

	@Override
	public void swim() {
		System.out.println("duck swims");
		
	}

	@Override
	public void walk() {
		System.out.println("duck walk");
		
	}

}


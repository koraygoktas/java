package koleksiyonlar;



import koleksiyonlar.animal;
import koleksiyonlar.flyable;

public class eagle extends animal implements flyable {

	public eagle(String name) {
		super(name);
			
	}

	@Override
	public void fly() {
		System.out.println("eagle flies");
		
	}
	
}


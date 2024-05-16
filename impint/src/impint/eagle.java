package impint;

public class eagle extends Animal implements flyable {

	public eagle(String name) {
		super(name);
			
	}

	@Override
	public void fly() {
		System.out.println("eagle flies");
		
	}
	
}

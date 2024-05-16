package koleksiyonlar;



interface walkable {
	void walk();
}
interface flyable {
	void fly();
}
interface swimmable {
	void swim();
}

public abstract class animal {
	String name;
	public animal(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}

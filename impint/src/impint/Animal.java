package impint;

interface walkable {
	void walk();
}
interface flyable {
	void fly();
}
interface swimmable {
	void swim();
}

public abstract class Animal {
	String name;
	public Animal(String name) {
		this.name=name;
	}
}

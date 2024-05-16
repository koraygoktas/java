package kasim_polyh;

public class Animal {
	public void eat() {
		System.out.println("animal is eating ");
	}
}
class horse extends Animal{
	@Override
	public void eat()
	{
		System.out.println("horse is eating ");
	}
	public void walk()
	{
		System.out.println("horse is walking");
	}
}
class dog extends Animal{
	@Override
	public void eat()
	{
		System.out.println("dog is eating ");
	}
}
class cat extends Animal{
	@Override
	public void eat()
	{
		System.out.println("cat is eating ");
	}
}
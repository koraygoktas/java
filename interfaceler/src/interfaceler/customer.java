package interfaceler;

public class customer implements IDatabase{
	@Override
	public void log()
	{
		System.out.println("müşteri eklendi");
	}
}

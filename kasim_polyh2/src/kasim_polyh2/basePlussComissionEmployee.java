package kasim_polyh2;

public class basePlussComissionEmployee extends commisionEmployee{
	int baseSalary;
	public basePlussComissionEmployee(String f, String l, int ssn, int gs, float cs,int sal) {
		super(f, l, ssn, gs, cs);
		this.baseSalary=sal;
	}
	@Override
	protected double earning() {
		return super.earning() + baseSalary;
	}
	@Override
	public String toString() {
		return super.toString()+ " base salary : "+baseSalary;
	}
	
}

package kasim_polyh2;

public class SalariedEmployee extends Employee{
	protected int weeklySalary;
	public SalariedEmployee(String f,String l,int ssn,int wsalary) {
		super(f, l, ssn);
		this.weeklySalary=wsalary;
	}
	@Override
	protected double earning() {
		return weeklySalary;
	}
	@Override
	public String toString() {
		return super.toString() +"salary : "+weeklySalary;
	}
}

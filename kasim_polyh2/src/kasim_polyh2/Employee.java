package kasim_polyh2;

public abstract class Employee{
	protected String fname;
	protected String lname;
	protected int ssn;
	
	public Employee(String f,String l,int ssn) {
		this.fname=f;
		this.lname=l;
		this.ssn=ssn;		
	}
	@Override
	public String toString() {
		return "first name : "+fname+"last name : "+lname+"ssn number : "+ssn+"";
	}
	protected abstract double earning();
}



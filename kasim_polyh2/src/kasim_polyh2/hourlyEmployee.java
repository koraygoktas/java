package kasim_polyh2;

public class hourlyEmployee extends Employee{

	protected int wage;
	protected int hour;

	public hourlyEmployee(String f, String l, int ssn,int w,int h) {
		super(f, l, ssn);
		this.wage=w;
		this.hour=h;
	}

	@Override
	protected double earning() {
		if(hour<40) return wage*hour;
		else return 40*wage +(hour-40)*wage*1.5f;
	}
	@Override
	public String toString() {
		return super.toString()+" wage : "+wage+" hour : "+hour;
	}

}

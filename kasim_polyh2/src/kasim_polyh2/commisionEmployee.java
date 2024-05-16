package kasim_polyh2;

public class commisionEmployee extends Employee{
	int grossSale;
	float commissionRate;
	public commisionEmployee(String f, String l, int ssn,int gs,float cs) {
		super(f, l, ssn);
		this.grossSale=gs;
		this.commissionRate=cs;
	}

	@Override
	protected double earning() {
		return grossSale*commissionRate;
	}
	@Override
	public String toString() {
		return super.toString()+" gross : "+grossSale+" commission sale : "+commissionRate;
		
	}
}

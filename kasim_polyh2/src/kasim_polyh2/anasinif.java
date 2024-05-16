package kasim_polyh2;

public class anasinif {

	public static void main(String[] args) {
		Employee e1= new SalariedEmployee("koray", "göktaş",212122, 100);
		Employee e2= new hourlyEmployee("gul","goktas", 212121, 10, 40);
		Employee e3= new commisionEmployee("kasım", "es", 5456487, 1000, 0.1f);
		Employee e4=new basePlussComissionEmployee("enes", "kss", 45457,1000, 0.1f, 100);
		
		Employee[] emps= {e1,e2,e3,e4};
		for(Employee e: emps)
		{
			System.out.println(e);
		}
	}

}

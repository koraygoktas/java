package impint;

public class anasinif {

	public static void main(String[] args) {
		Animal d=new duck("ordek");
		Animal c= new cat("boncuk");
		Animal e= new eagle("kartal");
		
		Animal[] animals= {d,c,e};
		for(Animal a:animals)
		{
			if(a instanceof flyable)
			{
				((flyable)a).fly();
			}
		}

	}

}

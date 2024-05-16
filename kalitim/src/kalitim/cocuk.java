package kalitim;

public class cocuk extends anne{
	
	private int yas;
	
	public cocuk(String name,String field,int salary,int yas) {
		super(name, field, salary);
		this.yas=yas;
		System.out.println("korayyyyy");
		//başta alt özellikleri çağırır yani bu constructordaki kodları
		//sonra super metodunu çağırır
		//sonraki derste yası da yazdırabileceğiz 
		//cocuk anneden miras alır
		
	}
	public void raiseSalary(int amount)
	{
		System.out.println("çalışanlara "+amount+" tl zam yapıldı");
	}

}

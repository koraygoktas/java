package kalitim;

public class anne {

	private String name;
	private String field;
	private int salary;
	
	public anne(String name,String field,int salary)
	{
		this.name=name;
		this.field=field;
		this.salary=salary;
		
	}
	
	public anne(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		this.field="bilgi yok";
		
	}
	
	
	
	public void showInfos(){
		System.out.println("\nbilgiler...\n");
		System.out.println("isim : "+this.name);
		System.out.println("alanı : "+this.field);
		System.out.println("maaşı : "+this.salary);
	}

}

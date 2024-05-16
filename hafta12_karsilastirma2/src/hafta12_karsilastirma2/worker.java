package hafta12_karsilastirma2;

import java.security.PublicKey;

public class worker implements Comparable<worker>{
	String name;
	int weight;
	int age;
	public worker (String name,int weight,int age)
	{
		this.age=age;
		this.weight=weight;
		this.name=name;
	}
	

	
	@Override
	public String toString() {
		return "name : "+this.name+" age : "+this.age+" weight : "+this.weight;
	}
	@Override
	public int compareTo(worker w) {
		//return this.name.compareTo(w.name); şeklinde isimlerinin baş harfine göre sıralardık
		if(this.age>w.age) return 1;
		else if (this.age==w.age)return 0;
		else return -1;
		
	} 
	
}

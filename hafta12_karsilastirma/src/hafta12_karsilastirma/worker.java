package hafta12_karsilastirma;

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
	public boolean equals (Object o)
	{
		if(this==o) return true;
		if(o==null||this.getClass()!=o.getClass()) return false;
		worker w=(worker)o;
		return this.name.equals(w.name) && this.age==w.age && this.weight==w.weight;
		
	}
	
	@Override
	public String toString() {
		return "name : "+this.name+" age : "+this.age+" weight : "+this.weight;
	}
	@Override
	public int compareTo(worker w) {
		//return this.name.compareTo(w.name); şeklinde isimlerinin baş harfine göre sıralardık
		return this.age-w.age;
		
	} 
	
}

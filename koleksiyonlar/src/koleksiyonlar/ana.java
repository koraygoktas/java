package koleksiyonlar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ana {

	public static void main(String[] args) {
		/*
		Collection<animal> c=new ArrayList<animal>();
		
		//c.add("hi koray");
		//c.add(5);
		//eğer üstte <animal> yazmasaydık bu şekilde int veya string değerler ekleyebilirdik
		//ama <animal> yazdığımız için sadece animal türünden şeyler ekleyebiliriz
		//<integer>(int yazılmaz class adları yazılır)yazsaydık c.add(5); ekleyebilirdik mesela 
		c.add(new eagle("besiktas"));
		
		animal a1=new cat("boncuk");
		animal a2=new duck("mavi");
		animal a3=new eagle("bjk");
		
		c.add(a1);
		c.add(a2);
		c.add(a3);
		
		Iterator iter =c.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			iter.remove();
		}
		//burdan sonra yazdırmaz çünkü hepsini remove yapıp boşalttık
		System.out.println("-----------");
		
		for(animal a:c)
		{
			System.out.println(a.name);
		}
*/
		
		
		//iteratorlarda sona geldikten sonra geriye dönüş yok ama listiteratorla geriye de döneriz
		
		List<animal> animalList=new LinkedList<animal>();
		
		animal a1=new cat("boncuk");
		animal a2=new duck("myduck");
		animal a3=new eagle("bjk");
		
		animalList.add(a1);
		animalList.add(a2);
		animalList.add(a3);
		
		ListIterator liter=animalList.listIterator();
		
		while(liter.hasNext())
		{
			System.out.println(liter.next());
		}
		System.out.println("-------");
		while(liter.hasPrevious())
		{
			System.out.println(liter.previous());
		}
		//burada liter listenin başında oluyor peki biz direkt tersten okutmak istersek nasıl yaparız
		//ListIterator liter=animalList.listIterator(); bunun yerine 
		//ListIterator liter=animalList.listIterator(animalList.size());
		// diyip previouslu while ile okutursak direkt tersten başlayıp okutur
		
		//ARRAYLİSTlerde set metodu=> set(2,new String("koray") şeklinde olur
		//get metodu iste diretk get(1) şeklinde 
		//boş listeye add("white") diyince 0. indise sonra add("black") diyince 1. indise ekliyor
		//mesela bundan sonra add(1,"red") diyince redi 1. indise alıp blacki 2. indise alıyor
		//mesela bundan sonra remove(1) dersek red aradan çıkıyor 0. indis white 1. indis black olur
		
		//LİNKEDLİST de random arama yapmak zahmetli ama ekleme ve çıkarmalar kolay 
		
	}
	

}

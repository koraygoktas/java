package kodyazma2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import hafta12_karsilastirma.worker;

public class ana {

	public static void main(String[] args) {
		book b1=new book("kel",1);
		book b2=new book("besir", 3);
		book b3=new book("tugberk", 2);
		book b4=new book("ahmet", 4);
		
		List<book> list=new LinkedList<book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		for(book b:list)
		{
			System.out.println(b.totalp);
		}
		Collections.sort(list);
		Iterator iter =list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}

package hafta12_karsilastirma2;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ana {

	public static void main(String[] args) {
		worker w1=new worker("kaan",34,76);
		worker w2=new worker("gulcan",67,60);
		worker w3=new worker("canan",12,78);
		worker w4=new worker("aysel",25,85);
		
		List<worker> list=new ArrayList<worker>();
		list.add(w1);
		list.add(w2);
		list.add(w3);
		list.add(w4);
		
		System.out.println("sorted by name");
		Comparator comp=new NameComparator();
		Collections.sort(list,comp);
		
		for(worker w:list)
		{
			System.out.println(w);
		}
		System.out.println("sorted by age");
		comp=new AgeComparator();
		Collections.sort(list,comp);
		
		for(worker w:list)
		{
			System.out.println(w);
		}
		System.out.println("sorted by weight");
		comp=new WeightComparator();
		Collections.sort(list,comp);
		
		for(worker w:list)
		{
			System.out.println(w);
		}
		
		
	}

}

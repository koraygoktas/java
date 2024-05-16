package hafta12_karsilastirma;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ana {

	public static void main(String[] args) {
		worker w1=new worker("kan",34,76);
		worker w2=new worker("gulcan",67,60);
		worker w3=new worker("canan",12,78);
		worker w4=new worker("aysel",25,85);
		System.out.println(w1==w2);
		System.out.println(w1.equals(w2));
		List<worker> list=new ArrayList<worker>();
		list.add(w1);
		list.add(w2);
		list.add(w3);
		list.add(w4);
		for(worker w:list)
		{
			System.out.println(w);
		}
		System.out.println("after sorting---");
		
		Collections.sort(list);
		//mesela başharflerine göre sıraladık ama biz tam tersi şeklinde istiyorduk o zaman da
		//Collections.reverse(list) diyip sıralanmış listeyi terse çevirirdik
		for(worker w:list)
		{
			System.out.println(w);
		}
		
		
	}

}

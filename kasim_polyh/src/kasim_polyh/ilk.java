package kasim_polyh;
//overloading yaparken parametre sayısından sistem anlayacağından compile time 
//overriding yaparken ise çalıştırdığımızda anladığından run time
public class ilk {

	public static void main(String[] args) {
		Animal h = (Animal)new horse(); //UPCASTİNG
		//mesela cat m = new cat()şeklinde oluşturursam upcasting yapmak istersem
		//Animal kedi = (Animal) m; şeklinde yaparım
		((horse)h).walk();//DOWNCASTİNG 
		//hemen üstümüzde kodu h.walk yazsaydık compile edilmeyecekti
		Animal c=new cat();
		Animal d=new dog();
		c.eat();//eğer catte varsa çalışır yoksa animaldaki çalışır
		Animal[] animals = {h,d,c};
		
		for(Animal a:animals) {
			a.eat();
		}
		

}
}

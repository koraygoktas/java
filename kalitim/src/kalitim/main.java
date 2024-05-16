package kalitim;

public class main {

	public static void main(String[] args) {
		anne cocuk1=new anne("Koray","yazılım",58000);//anne sınıfının constructorı çağırıldı
		//cocuk1 sınıf nesnesi temsilcisi
		cocuk1.showInfos();
		
		cocuk cocuk2=new cocuk("Gülşah","sosyoloji", 60000,20);
		cocuk2.showInfos();
		
		anne cocuk3=new anne("beşir", 30000);
		cocuk3.showInfos();
		cocuk2.raiseSalary(1000);
		
	}

}

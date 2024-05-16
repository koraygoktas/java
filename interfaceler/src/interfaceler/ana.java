package interfaceler;
/*interfaceler içinde bulundurduğu objelerin diğer classlar tarafından
 * kullanılmasını sağlar*/
public class ana {

	public static void main(String[] args) {
	//IDatabase database =new IDatabse();
	// yukardaki kod hatalı çünkü interfaceden obje oluşturamazsın
	customer musteri=new customer();
	student ogrenci =new student();
	ogrenci.log();
	musteri.log();
	
	IDatabase musteri2=new customer();
	IDatabase ogrenci2=new student();
	//burada IDatabase musteri2 ve ogrenci2 nin türü, customer ve student ise referanslarıdır
	
	musteri2.log();
	ogrenci2.log();
	
	}

}

import java.util.Locale;
import java.util.Scanner;

public class alma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		scan.useLocale(Locale.US);
		System.out.println("bir değişken değeri giriniz:");
		double a= scan.nextDouble();
		System.out.println("a değişkeninin değeri "+a);
		scan.nextLine();//bununla scan girdisni temizledik
		System.out.println("bir kelime giriniz");
		String b=scan.nextLine();
		System.out.println("girdiğiniz kelime :"+b);
	}
}
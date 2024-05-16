package diziler;

import java.util.Scanner;

public class array {
	public static void topla(int array[]) {
		int total=0;
		for(int i=0;i<array.length;i++)
		{
			total+=array[i];
		}
		System.out.println("dizinin elemanlarının toplamı="+total);
	}
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int[] arr1= {5,2,9,7,1};
		int[] arr2 =new int[5];
		for(int i=0;i<arr1.length;i++) {
			System.out.printf("%d. eleman=%d\n",i+1,arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.printf("%d. elemanı giriniz:\n",i+1);
			arr2[i]= scanner.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.printf("%d. eleman : %d\n",i+1,arr2[i]);
		}
		topla(arr1);
		

	}

}

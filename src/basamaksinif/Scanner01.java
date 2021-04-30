package basamaksinif;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	//kullanici iki tam sayi versin 
		//program bu sayilarin toplamini ve carpimini versin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki tam sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 +sayi2);
		System.out.println(sayi1*sayi2);

	}

}

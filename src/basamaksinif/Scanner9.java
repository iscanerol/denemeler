package basamaksinif;

import java.util.Scanner;

public class Scanner9 {

	public static void main(String[] args) {
	//Saati saniyeye çeviren bir program yazýnýz. (long kullanýnýz)
	//Not 1: Saniye = Saat x 60 x 60

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen saniyeye cevirmek istediginiz saati giriniz");
		
		long saat = scan.nextLong();
		System.out.println(saat*3600);
		
	}

}

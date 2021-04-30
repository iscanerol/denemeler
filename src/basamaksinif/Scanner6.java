package basamaksinif;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		//Boyutlarý kullanýcýdan alýnan bir dikdörtgenler prizmasýnýn hacmini
		//hesaplayan bir program yazýnýz. Not: Dikdörtgenler Prizmasýnýn Hacmi:  En x Boy x Yükseklik 
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen dikdotgenin en boy ve yuksekligini giriniz ");
		
		int boy = scan.nextInt();
		int en = scan.nextInt();
		int yukseklik = scan.nextInt();
		System.out.println(en*boy*yukseklik);
	}

}

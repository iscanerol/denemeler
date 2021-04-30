package basamaksinif;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
	//Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir 
    //Program yazýnýz. (byte kullanýnýz) Not 1: Üçgenin Cevresi: a + b + c
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ucgenin uc kenarininda boyutlarini giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a+b+c);

	}

}

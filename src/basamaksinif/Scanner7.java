package basamaksinif;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
	//Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir 
    //Program yaz�n�z. (byte kullan�n�z) Not 1: ��genin Cevresi: a + b + c
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ucgenin uc kenarininda boyutlarini giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a+b+c);

	}

}

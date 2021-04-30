package basamaksinif;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen karenin bir kenar uzunlugunu giriniz");
		
		int kenarUzunlugu =scan.nextInt();
		
		System.out.println(kenarUzunlugu*4);
		System.out.println(kenarUzunlugu*kenarUzunlugu);
				

	}

}

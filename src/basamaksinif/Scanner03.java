package basamaksinif;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		
		int sayi =scan.nextInt();
		
		System.out.println(sayi*sayi*sayi);

	}

}

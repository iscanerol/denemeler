package javapractice;

import java.util.Scanner;

public class Questions01 {

	public static void main(String[] args) {
		/* Santimetreyi, metreye ve kilometreye �eviren bir program yaz�n�z.
		 ��kt� : 
		 L�tfen santimetre de�erini giriniz:
		 	212
		 212 santimetre 2.12 metre ve 0.00212 kilometreye e�ittir.
		�pucu : 100 cm = 1 mt = 0.001 kilometre
		1km = 100000cm;
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen santimetre de�erini giriniz : ");
		int santimetre = scan.nextInt();
		float metre = santimetre / 100f;
		float kilometre = santimetre / 100000f;
		System.out.println("Metre " +metre);
		System.out.println("Kilometre " +kilometre);
		/////////////////////////////
		System.out.println("\ngetMetre " + getMetre(santimetre));
		System.out.println("getKilometre " + getKilometre(santimetre));
	}
	private static float getMetre(int santimetre) {
		return santimetre / 100f;
	}
	private static float getKilometre(int santimetre) {
		return santimetre / 100000f;
	}

	}



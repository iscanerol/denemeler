package day04operators;

import java.util.Scanner;

public class Modulus2 {

	public static void main(String[] args) {
		//kullanicidan uc basamakli bir sayi aliniz ve rakamlari toplami bulun
		Scanner scan = new Scanner(System.in);
		System.out.println("uc basamakli bir sayi giriniz");

		int s = scan.nextInt();
		int birler = s % 10;
		int onlar1 = s /10;
		int onlar2 = onlar1 % 10;
		int yuz = s / 100;
		System.out.println(birler + onlar2+ yuz);
	}

}

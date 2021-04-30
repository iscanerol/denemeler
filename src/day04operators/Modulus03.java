package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
//dort basamakli sayinin binler ve birler basamaginin toplamini yaziniz
		Scanner scan = new Scanner(System.in);
		System.out.println("dort basamakli bir sayi giriniz");

		int s = scan.nextInt();
		int birler = s%10;
		int binler = s/1000;
		
		System.out.println(binler + birler);
	}

}

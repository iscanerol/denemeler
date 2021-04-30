package day04operators;

import java.util.Scanner;

public class Modulus01 {

	public static void main(String[] args) {
	//kullanicinin giridigi 4 basamakli bir sayinin birinci ve son rakamini toplayiniz
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dort basamakli bir sayi giriniz");

		int s = scan.nextInt();
		int birler = s%10; //birler basamagini bulmak icin sayiyi 10 bolersin
		int son = s / 1000;
		System.out.println(birler + son);

	}

}

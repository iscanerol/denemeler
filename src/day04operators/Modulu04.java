package day04operators;

import java.util.Scanner;

public class Modulu04 {

	public static void main(String[] args) {
		//uc basmakli sayinin rakamlarinin toplamini bulun
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen uc basamakli bir sayi giriniz");
		
		int s = scan.nextInt();
		int birler = s%10;
		int onlar1 = s / 10;
		int onlar2 = onlar1%10;
		int yuzler = s / 100;
		System.out.println(birler + onlar2 + yuzler);
		

	}

}

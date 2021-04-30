package basamaksinif;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin eniini ve boyunu giriniz");
		
		int en =scan.nextInt();
		int boy = scan.nextInt();
		System.out.println(2*(en + boy));
		System.out.println(en * boy);
	}

}

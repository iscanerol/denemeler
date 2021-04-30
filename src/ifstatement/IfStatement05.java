package ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		//kullanicidab bir dikdortgenin en ve boyunu akin en ve boy esitse karedir degilse dikdortgendir yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin en ve boyunu giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		if( en==boy) {
			System.out.println("bu bir karedir");
			
		}
		if(en!=boy) {
			System.out.println("bu bir dikdortgendir");
		}

	}

}

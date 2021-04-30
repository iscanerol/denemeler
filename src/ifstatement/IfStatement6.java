package ifstatement;

import java.util.Scanner;

public class IfStatement6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("parolayi giriniz");
		 

		String parola = scan.nextLine();
		if(parola.equals("java2020")) {
			System.out.println("parola dogru");
		
	}else {
		System.out.println("tekrar giriniz");
	}
	}
}

package operators;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
      
		Scanner scan = new Scanner (System.in);
		System.out.println("bir rakam giriniz:");
		String num1 = scan.nextLine();
		System.out.println("yapilacak islemi giriniz: ");
		String islem = scan.nextLine();
		System.out.println("diger rakami giriniz: ");
		String num2 = scan.nextLine();
		
		double num3 = Double.parseDouble(num1);
		double num4 = Double.parseDouble(num2);
		
		switch (islem) {
		case "+" :
			System.out.println("islem sonucu: " + (num3+num4) );
			break;
		case "-" :
			System.out.println("islem sonucu: " + (num3-num4) );
			break;
		case "*" :
			System.out.println("islem sonucu: " + (num3*num4) );
			break;
		case "/" :
			System.out.println("islem sonucu: " + (num3/num4) );
			break;
			default:
				System.out.println("belirsiz islem...");
		}

	}

}

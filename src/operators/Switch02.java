package operators;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir islem Seçiniz: " + "\n" + "1) Toplama"+ 
				"\n" + "2) Cikarma"+ "\n" + "3) Carpma"+ "\n" + "4) Bolme");
		int islem = scan.nextInt();
		
		System.out.print("1. Sayýyý girin: ");
		double num1 = scan.nextDouble();
		System.out.print("2. Sayýyý girin: ");
		double num2 = scan.nextDouble();
		
		switch(islem) {
			case 1 :
				System.out.println("Sonuc: " + (num1+num2));
				break;
			case 2 :
				System.out.println("Sonuc: " + (num1-num2));
				break;
			case 3 :
				System.out.println("Sonuc: " + (num1*num2));
				break;
			case 4 :
				System.out.println("Sonuc: " + (num1/num2));
				break;
			
			default:
				System.out.println("Hatalý giriþ");
				
				
		}
		
		scan.close();

	}

}

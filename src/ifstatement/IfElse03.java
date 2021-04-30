package ifstatement;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen alacaginiz urunun miktarini giriniz");
	double miktar = scan.nextDouble();
	System.out.println("lutfen urunun birim fiyatini yaziniz");
	double birim = scan.nextDouble();
	if(miktar>1000) {
		System.out.println((miktar*80)/100);
	} else{
		System.out.println((miktar*birim));
		
	}

	}

}

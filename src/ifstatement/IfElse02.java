package ifstatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen bir sayi giriniz");
	
	double s = scan.nextDouble();
	if(s>0) {
		System.out.println(s*(+1));
	}else {
		System.out.println(s*(-1));
	}
			
			

	}

}

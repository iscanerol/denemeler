package basamaksinif;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
	//Mil’i kilometreye çeviren bir program yazýnýz. (double kullanýnýz)
    //Not 1: km = mile x 1.6
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen cevirmek istediginiz  mil miktarini giriniz");
		
		double km = scan.nextDouble();
		System.out.println(km / 1.6);

	}

}

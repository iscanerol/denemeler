package basamaksinif;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		//Boyutlar� kullan�c�dan al�nan bir dikd�rtgenler prizmas�n�n hacmini
		//hesaplayan bir program yaz�n�z. Not: Dikd�rtgenler Prizmas�n�n Hacmi:  En x Boy x Y�kseklik 
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen dikdotgenin en boy ve yuksekligini giriniz ");
		
		int boy = scan.nextInt();
		int en = scan.nextInt();
		int yukseklik = scan.nextInt();
		System.out.println(en*boy*yukseklik);
	}

}

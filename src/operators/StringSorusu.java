package operators;

import java.util.Scanner;

public class StringSorusu {

	public static void main(String[] args) {
		/* 
        scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
                 Harun
                 Ekinci
        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
                 1983
                 2020        
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
           //�ifre= 37HEi56        
        */
		
		  Scanner sc= new Scanner(System.in);
	        String ad,soyAd,rapor;
	        int d_y�l,b_y�l;
	        
	        System.out.println("L�tfen Ad�n�z� Giriniz:");
	        ad= sc.nextLine();
	        System.out.println("L�tfen Soyad�n�z� Giriniz");
	        soyAd= sc.nextLine();
	        System.out.println("L�tfen Do�um y�l�n�z� giriniz");
	        d_y�l= sc.nextInt();
	        System.out.println("L�tfen �imdiki y�l� giriniz");
	        b_y�l= sc.nextInt();
	        int yas=(b_y�l-d_y�l);
	        rapor="Ad�n�z: "+ad+ " Soyad�n�z: "+soyAd+" Ya��n�z: "+yas;
	        
	        System.out.println(rapor);
	        String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
	        +soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
	        System.out.println("�ifreniz: "+sifre);

	}

}

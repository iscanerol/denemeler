package basamaksinif;

public class TypeCasting {

	public static void main(String[] args) {
		byte by = 101;
		int sayi = by;
		System.out.println(sayi);// kucuk data tipini buyuk data tipine cevirmek icin ekstra bir
		                         //kod yazmaya gerek yok java bunu bizim icin otomatik yapar
	
		int sayi2 = 53;// buyuk data titpini kucuk data tipine cevirmeyi java yapmaz.bunu biz yapariz.
		              //ornekteki gibi parantez icinde byte yazariz
		byte by2 = (byte)sayi2;
		System.out.println(by2);
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		System.out.println(by3);
		
		float sayi4 = -24.9f;
		short by4 = (short)sayi4;
		System.out.println(by4);

		double sayi5= 4.8;
		double sayi6 = 1.4;
		double sonuc=sayi5/sayi6;
		System.out.println(sonuc);
		int sonuc2 =(int) (sayi5/sayi6);
		System.out.println(sonuc2);
		
		int sayi9 = 255;
		byte by9 = (byte) sayi9;
		System.out.println(by9);
	}

}

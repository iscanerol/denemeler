package nestedifday07;

import java.util.Scanner;

public class ArtikYilSorusu {

	public static void main(String[] args) {
		//kullanicidan yil girmsenini isteyin girilen yil artik yil ise ekrana artik yil yazdirin
		//degilse artik yil degildir yazdirin
		//artik yil yil 100 e bolunurse 400 e de bolunmeli 
		//100 e bolunmezse 4 e bolunmeli
		Scanner scan = new Scanner(System.in);
		System.out.println("yil giriniz");
		int yil = scan.nextInt();
		 if (yil%100 == 0 && yil%400 == 0) {
			 System.out.println("artik yildir");
		 }else if(yil%100!=0 && yil%4 == 0) {
			 System.out.println("artik yildir");
		 }else {
			 System.out.println("artik yil degildir");
		 }
		
		

	}

}

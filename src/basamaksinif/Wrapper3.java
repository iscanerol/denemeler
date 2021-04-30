package basamaksinif;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isim ve sou isim giriniz");
		String tumIsim = scan.nextLine();
		System.out.println(tumIsim);		
				
		System.out.println("lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("lutfen adresinizi giriniz");
		 String adres = scan.nextLine();
		 System.out.println(adres);
		 
		 System.out.println("turkiyede yasiyorsun dogru/yanlis");
		 boolean bltr =scan.nextBoolean();
		 System.out.println(bltr);
		 
		 
	}
	

}

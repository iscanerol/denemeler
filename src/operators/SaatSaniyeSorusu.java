package operators;

import java.util.Scanner;

public class SaatSaniyeSorusu {

	public static void main(String[] args) {
		// Scanner kullanarak kullanýcýdan saat, dakika ve saniye bilgilerini alarak sonucu yazdýrýnz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		 
        int saat,dakika,saniye;
        String amOrPm;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Lütfen saat deðeri giriniz");
        saat= sc.nextInt();
        System.out.println("Lütfen dakika deðeri giriniz");
        dakika= sc.nextInt();
        System.out.println("Lütfen saniye deðerini giriniz");
        saniye= sc.nextInt();
        System.out.println("Lütfen AM veya PM deðerini giriniz");
        amOrPm= sc.next();
        
        System.out.println(saat+":"+dakika+":"+saniye+" "+ amOrPm);

	}

}

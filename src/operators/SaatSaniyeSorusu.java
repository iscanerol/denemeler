package operators;

import java.util.Scanner;

public class SaatSaniyeSorusu {

	public static void main(String[] args) {
		// Scanner kullanarak kullan�c�dan saat, dakika ve saniye bilgilerini alarak sonucu yazd�r�nz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // �rn: 11:25:33 PM
		
		 
        int saat,dakika,saniye;
        String amOrPm;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("L�tfen saat de�eri giriniz");
        saat= sc.nextInt();
        System.out.println("L�tfen dakika de�eri giriniz");
        dakika= sc.nextInt();
        System.out.println("L�tfen saniye de�erini giriniz");
        saniye= sc.nextInt();
        System.out.println("L�tfen AM veya PM de�erini giriniz");
        amOrPm= sc.next();
        
        System.out.println(saat+":"+dakika+":"+saniye+" "+ amOrPm);

	}

}

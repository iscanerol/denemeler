package operators;

import java.util.Scanner;

public class IfSorusu {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý girmesini isteyiniz
		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz
		System.out.println("Kontrol edilecek sayýyý giriniz");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        //x=sc.nextInt();
        
        if(x%2==0) {
            System.out.println("Sayýnýz çift sayýdýr");
        }else {
            System.out.println("Sayýnýz tek sayýdýr");
sc.close();

	}

}}

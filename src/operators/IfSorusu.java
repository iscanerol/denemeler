package operators;

import java.util.Scanner;

public class IfSorusu {

	public static void main(String[] args) {
		// Kullan�c�dan bir say� girmesini isteyiniz
		// Say� tek say� ise "Say�n�z tek say�d�r."
		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z
		System.out.println("Kontrol edilecek say�y� giriniz");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        //x=sc.nextInt();
        
        if(x%2==0) {
            System.out.println("Say�n�z �ift say�d�r");
        }else {
            System.out.println("Say�n�z tek say�d�r");
sc.close();

	}

}}

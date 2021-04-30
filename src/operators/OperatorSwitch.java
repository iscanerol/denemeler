package operators;

import java.util.Scanner;

public class OperatorSwitch {

	public static void main(String[] args) {
		  
        Scanner scan=new Scanner (System.in);
        System.out.println("Ýki sayý giriniz");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
    System.out.println("Toplama için 1, Çarpma için 2, Çýkarma için 3, Bölme için 4 giriniz" );
    int islem=scan.nextInt();
    
    switch (islem) {
    case 1: 
        System.out.print("Toplama Sonucu= "+(num1+num2));
        break;
    case 2:
        System.out.print("Çarpma Sonucu= "+(num1*num2));
        break;
    case 3:
        System.out.print("Çýkarmanýn Sonucu= "+(num1-num2));
        break;
    case 4:
        System.out.print("Bölmenin Sonucu= "+(num1/num2));
        break;
        default: 
            System.out.println("Lütfen Doðru iþlem Kodu Giriniz");
            
        
    }
    scan.close();
    }
    


	}



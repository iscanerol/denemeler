package operators;

import java.util.Scanner;

public class OperatorSwitch {

	public static void main(String[] args) {
		  
        Scanner scan=new Scanner (System.in);
        System.out.println("�ki say� giriniz");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
    System.out.println("Toplama i�in 1, �arpma i�in 2, ��karma i�in 3, B�lme i�in 4 giriniz" );
    int islem=scan.nextInt();
    
    switch (islem) {
    case 1: 
        System.out.print("Toplama Sonucu= "+(num1+num2));
        break;
    case 2:
        System.out.print("�arpma Sonucu= "+(num1*num2));
        break;
    case 3:
        System.out.print("��karman�n Sonucu= "+(num1-num2));
        break;
    case 4:
        System.out.print("B�lmenin Sonucu= "+(num1/num2));
        break;
        default: 
            System.out.println("L�tfen Do�ru i�lem Kodu Giriniz");
            
        
    }
    scan.close();
    }
    


	}



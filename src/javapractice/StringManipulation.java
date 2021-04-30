package javapractice;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		Kullanicidan bir e-mail addressi  isteyiniz eger email id de "hotmail" varsa  "gmail" 
		ile degistiriniz
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com*/
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("emailinizi giriniz");
		String email = scan.nextLine();
		 if (email.contains("hotmail")) {
	            System.out.println(email.replace("hotmail", "gmail"));
	            
	        }else {
	            System.out.println(email);
	        }

			
		}
	}



import java.util.Scanner;

public class dene {

	public static void main(String[] args) {
		//Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		//oldu�unu, de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf de�ilse
		//yada 1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen harfi b�y�k yada
		//k���kl���ne duyarl�d�r.)
		 Scanner in = new Scanner(System.in);
	     System.out.println("bir harf giriniz");
         char harf = in.next().toLowerCase().charAt(0);
         
         if((harf >65 && harf<90)||(harf>97 && harf<123)){
        	 System.out.println();
         }
	}

}

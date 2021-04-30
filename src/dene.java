import java.util.Scanner;

public class dene {

	public static void main(String[] args) {
		//Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		//olduðunu, deðilse sessiz harf olduðunu ekrana yazdýrsýn. Girdiði deðer harf deðilse
		//yada 1 karakterden fazla ise hata mesajý göstersin. (Test girilen harfi büyük yada
		//küçüklüðüne duyarlýdýr.)
		 Scanner in = new Scanner(System.in);
	     System.out.println("bir harf giriniz");
         char harf = in.next().toLowerCase().charAt(0);
         
         if((harf >65 && harf<90)||(harf>97 && harf<123)){
        	 System.out.println();
         }
	}

}

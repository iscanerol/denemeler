import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		// Kullan�c� taraf�ndan girilen bir y�l�n art�k y�l olup olmad���n� kontrol
		// etmek i�in bir Java Methodu yaz�n�z.

		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0 && year % 4 == 0) {
			System.out.println("Artik yildir");
		}else {
			System.out.println("false");
		}

	}

}

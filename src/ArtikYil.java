import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		// Kullanýcý tarafýndan girilen bir yýlýn artýk yýl olup olmadýðýný kontrol
		// etmek için bir Java Methodu yazýnýz.

		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0 && year % 4 == 0) {
			System.out.println("Artik yildir");
		}else {
			System.out.println("false");
		}

	}

}

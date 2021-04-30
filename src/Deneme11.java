import java.util.Scanner;

public class Deneme11 {

	public static void main(String[] args) {
		// Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		// oldu�unu, de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf
		// de�ilse
		// yada 1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen harfi b�y�k
		// yada
		// k���kl���ne duyarl�d�r.)

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz.");
		String harf = scan.next();
		char ilk = harf.charAt(0);
		if (harf.length() > 1) {
			System.out.println("Yanl�� karakter girdiniz.");
		} else {
			if ((ilk >= 65 && (ilk <= 90)) || ((ilk >= 97) && (ilk <= 122))) {
				if ((ilk == 65) || (ilk == 69) || (ilk == 73) || (ilk == 79) || (ilk == 85) || (ilk == 97)
						|| (ilk == 101) || (ilk == 105) || (ilk == 111) || (ilk == 117)) {
					System.out.println(harf + " harfi sesli harfdir.");
				} else {
					System.out.println(harf + " harfi sessiz harftir.");
				}
			} else {
				System.out.println("Yanl�� karakter girdiniz.");
			}
		}
		scan.close();

	}
}

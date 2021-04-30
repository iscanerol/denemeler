import java.util.Scanner;

public class Deneme11 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		// olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
		// değilse
		// yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük
		// yada
		// küçüklüğüne duyarlıdır.)

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz.");
		String harf = scan.next();
		char ilk = harf.charAt(0);
		if (harf.length() > 1) {
			System.out.println("Yanlış karakter girdiniz.");
		} else {
			if ((ilk >= 65 && (ilk <= 90)) || ((ilk >= 97) && (ilk <= 122))) {
				if ((ilk == 65) || (ilk == 69) || (ilk == 73) || (ilk == 79) || (ilk == 85) || (ilk == 97)
						|| (ilk == 101) || (ilk == 105) || (ilk == 111) || (ilk == 117)) {
					System.out.println(harf + " harfi sesli harfdir.");
				} else {
					System.out.println(harf + " harfi sessiz harftir.");
				}
			} else {
				System.out.println("Yanlış karakter girdiniz.");
			}
		}
		scan.close();

	}
}

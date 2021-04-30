import java.util.Scanner;

public class StringKarsilastirma {

	public static void main(String[] args) {
		// Girilecek iki String nesnesinin ayný verileri içerip içermediðini kontrol
		// etmek için bir Java programý yazýn.

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		if (str1.length() < str2.length()) {
			int count = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					count++;
				}
			}

			if (count == str1.length()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			int count = 0;
			for (int i = 0; i < str2.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					count++;
				}
			}

			if (count == str2.length()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

	}
}

}

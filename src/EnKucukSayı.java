import java.util.Scanner;

public class EnKucukSayý {

	public static void main(String[] args) {

		// Üç sayý arasýndaki en küçük sayýyý bulmak için bir Java METHOD yazýn.

		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		if (sayi1 < sayi2) {
			if (sayi1 < sayi3) {
				System.out.println(sayi1);
			} else {
				System.out.println(sayi3);
			}
		} else {
			if (sayi2 < sayi3) {
				System.out.println(sayi2);
			} else {
				System.out.println(sayi3);
			}
		}
	}
}

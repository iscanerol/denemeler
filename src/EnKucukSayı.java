import java.util.Scanner;

public class EnKucukSay� {

	public static void main(String[] args) {

		// �� say� aras�ndaki en k���k say�y� bulmak i�in bir Java METHOD yaz�n.

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

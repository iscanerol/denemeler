import java.util.Scanner;

public class KacinciEleman {

	public static void main(String[] args) {
		// Aranan de�erin Array i�erisinde ka��nc� eleman oldu�unu bulan Java Kodu
		// yaz�n�z.

		// Array: [12,15,43,23,56,76,78,90,77,43]
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = { 12, 15, 43, 23, 56, 76, 78, 90, 77, 43 };
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				System.out.println(a + " say�s� arrayin " + (i) + ". eleman�");
			}
		}
		
	}

}

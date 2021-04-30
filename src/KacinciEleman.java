import java.util.Scanner;

public class KacinciEleman {

	public static void main(String[] args) {
		// Aranan deðerin Array içerisinde kaçýncý eleman olduðunu bulan Java Kodu
		// yazýnýz.

		// Array: [12,15,43,23,56,76,78,90,77,43]
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = { 12, 15, 43, 23, 56, 76, 78, 90, 77, 43 };
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				System.out.println(a + " sayýsý arrayin " + (i) + ". elemaný");
			}
		}
		
	}

}

import java.util.Scanner;

public class UglySayi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz.");
		int num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("ugly say�d�r.");
		}else {
		boolean isUgly = true;
		do {
			if (num % 2 == 0)
				num = num / 2;
			else if (num % 3 == 0)
				num = num / 3;
			else if (num % 5 == 0)
				num = num / 5;
			else {
				isUgly = false;
				break;
			}
		} while (num != 1);

		if (isUgly) {
			System.out.println("ugly say�d�r");
		} else {
			System.out.println("ugly say� de�il");
		}
		scan.close();
		}
	}

}

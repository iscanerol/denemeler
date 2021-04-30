import java.util.Scanner;

public class BasamakSiniflandirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sefa = new Scanner(System.in);
		System.out.println("lutfen iki basamkli bir sayi giriniz.");

		while (sefa.hasNext()) {
			double sayi = sefa.nextDouble();
			if (sayi < 10 || sayi > 99) {
				System.out.println("yazdiginiz sayi iki basamakli bir sayi degildir");
				System.out.println("lutfen iki basamakli bir sayi giriniz");
			} else {
				System.out.println("girmis oldugunuz sayi iki basamaklidir");
			break;

			}

		}
	}

}

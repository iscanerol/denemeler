import java.util.Scanner;

public class Sayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		if(sayi1<sayi2 && sayi1<sayi3){
			System.out.println("en kucuk sayi:" + sayi1);
			
		}else if(sayi2<sayi1 && sayi2<sayi3) {
			System.out.println("en kucuk sayi:" + sayi2);
			
		}else {
			System.out.println("en kucuk sayi" + sayi3);
		}
	}

}

package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySoru {

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };
	private static final String[] numberNames = { "zero", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		numToEng(sayi);
		scan.close();

	}

	public static String numToEng(int n) {
		if (n > 20) {

			int birler = n % 10; // = 6
			n = n / 10;
			int onlar = n % 10; // = 5
			n = n / 10;
			int yuzler = n; // = 0

			switch (yuzler) {
			case 1:
				System.out.print("onehundered ");
				break;
			case 2:
				System.out.print("twohundered ");
				break;
			case 3:
				System.out.print("threehundered ");
				break;
			case 4:
				System.out.print("fourhundered ");
				break;
			case 5:
				System.out.print("fivehundered ");
				break;
			case 6:
				System.out.print("sixhundered ");
				break;
			case 7:
				System.out.print("sevenhundered ");
				break;
			case 8:
				System.out.print("eighthundered");
				break;
			case 9:
				System.out.print("ninehundered ");
				break;
			default:
				break;
			}
			switch (onlar) {
			
			case 2:
				System.out.print(tensNames[2]);
				break;
			case 3:
				System.out.print(tensNames[3]);
				break;
			case 4:
				System.out.print(tensNames[4]);
				break;
			case 5:
				System.out.print(tensNames[5]);
				break;
			case 6:
				System.out.print(tensNames[6]);
				break;
			case 7:
				System.out.print(tensNames[7]);
				break;
			case 8:
				System.out.print(tensNames[8]);
				break;
			case 9:
				System.out.print(tensNames[9]);
				break;
			default:
				break;
			}
			switch (birler) {
			case 1:
				System.out.print(numberNames[1]);
				break;
			case 2:
				System.out.print(numberNames[2]);
				break;
			case 3:
				System.out.print(numberNames[3]);
				break;
			case 4:
				System.out.print(numberNames[4]);
				break;
			case 5:
				System.out.print(numberNames[5]);
				break;
			case 6:
				System.out.print(numberNames[6]);
				break;
			case 7:
				System.out.print(numberNames[7]);
				break;
			case 8:
				System.out.print(numberNames[8]);
				break;
			case 9:
				System.out.print(numberNames[9]);
				break;
			default:
				break;
			}
			return yuzler + onlar + birler + "";
		} else {
			String a = numberNames[n] + "";
			System.out.println(a);
			return a;
		}
	}
}

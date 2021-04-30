package basamaksinif;

import java.util.Scanner;

public class Scanner5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yaricapi giriniz");
		
		double yaricap = scan.nextDouble();
		System.out.println(yaricap*yaricap*3.14565);

	}

}

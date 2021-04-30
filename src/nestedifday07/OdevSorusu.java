package nestedifday07;

import java.util.Scanner;

public class OdevSorusu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("bir character girin");
	char harf = scan.next().charAt(0);
	if((harf<=122 && harf>=97) ||( harf<=90 && harf>=65)) {
		System.out.println("nu bir harftir");
		
	}else {
		System.out.println("bu bir harf degildir");
	}
scan.close();
	}

}

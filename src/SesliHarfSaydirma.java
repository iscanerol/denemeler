import java.util.Scanner;

public class SesliHarfSaydirma {

	public static void main(String[] args) {
		//Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazýnýz.
		Scanner scan = new Scanner(System.in);
		java.lang.String str = scan.nextLine();
		int count = 0;
		for(int i=0 ; i< str.length() ; i++) {
			if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i) =='o' ||str.charAt(i) == 'u' || str.charAt(i) =='i') {
				count++;
			}
		
		}
		System.out.println(count);
	}

}

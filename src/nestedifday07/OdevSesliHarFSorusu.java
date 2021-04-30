package nestedifday07;

import java.util.Scanner;

public class OdevSesliHarFSorusu {

	public static void main(String[] args) {
		//kullanicidan alinan harf a,e,i,o,u dan biriyse sesli harf yazdirin b,c,d,f den 
		//biriyse sessiz harf yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a,e,i,o,u,b,c,d,f, harflerini  giriniz");
		char harf = scan.next().charAt(0);
	if(harf == 'a' || harf == 'e' || harf == 'i' || harf =='u'  || harf == 'o') {
		System.out.println("sesli harf");
	}else if(harf == 'b' || harf == 'c' || harf == 'd' || harf == 'f') {
		System.out.println("sessiz harf");
	}else {
		System.out.println("yanlis harf girdiniza");
	}

	}

}

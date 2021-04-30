package javapractice;

public class Quest2 {

	public static void main(String[] args) {
		/*
		 * Whilde d�ng�s� kullanarak "say� tahmin oyunu" yaz�n�z. 
		 * 
		 * 1. Ad�m : Java ile rastgele bir say� �retelim (new Random() kullanabilrsiniz)
		 * 2. Ad�m : Kullan�c�dan tahminini alal�m.
		 * 3. Ad�m : Kullan�c�n�n girdi�i tahmini, bilgisayar�n �retti�i 
		 * 			 rastgele say� ile kar��la�t�ral�m.
		 * 4. Ad�m : Cevap do�ru olana kadar 2. ve 3. ad�m� tekrarlayal�m, 
		 * 			 bunu da while d�ng�s� ile yapal�m.
		 *
		 * */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int rastgeleSayi = random.nextInt(10); // 0 - 10 .
		int tahmin = 1000000;
		//System.out.println(rastgeleSayi);
		while(tahmin != rastgeleSayi) {
			System.out.println("L�tfen tahmininizi yaz�n�z : ");
			tahmin = scan.nextInt();
			if(tahmin == rastgeleSayi)
				System.out.println("Tebrikler ! Kazand�n�z.");
			else
				System.out.println("Yanl�� cevap ! Tekrar deneyiniz.");
		}
		scan.close();
	}

	}



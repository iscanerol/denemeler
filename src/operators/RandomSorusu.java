package operators;

public class RandomSorusu {

	public static void main(String[] args) {

		//int ramdomSayi= (int)(Math.random()*1000);// 0 ile 1000 aras� say�
		//int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 aras� de�erler
		 //  Random random= new Random();
		 //int randomSayi = random.nextInt(1000);

		// 0 ile 1000 aras� say�
		//int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 aras� de�erler
		        //Random random= new Random();
		        
		    //  int randomSayi = random.nextInt(1000);
		        int randomSayi= (int)(Math.random()*1000);
		        System.out.println("Random say�="+randomSayi);
		    int birler = randomSayi%10; // birler basama��
		    
		      randomSayi= randomSayi/10;
		    
		    int onlar = randomSayi%10; // onlar basama��
		    int yuzler= randomSayi/10; // y�zler basama��
		    
		    System.out.println("Toplamlar�= "+(birler+onlar+yuzler));
		    

	}

}

package operators;

public class InterView {

	public static void main(String[] args) {
		//*** interview question***
	       // Verilen iki de�eri ���nc� bir de�er kullanmadan yerlerini de�i�tiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	       System.out.println("---De�i�iklik �ncesi---");
	        System.out.println("x de�eri= "+x);
	        System.out.println("y de�eri= "+y);
	          
	           x=x+y;
	           y=x-y;
	           x=x-y;
	           
	         System.out.println("---De�i�iklik sonras�---");
	         System.out.println("x de�eri= "+x);
	         System.out.println("y de�eri= "+y);
	           
	









	}

}

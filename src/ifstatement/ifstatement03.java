package ifstatement;

public class ifstatement03 {

	public static void main(String[] args) {
	//bir chara variableye deger atayin	.eger atanan deger haftanin gunlerinin ilk harfiyse o gunleri yazdirin
	//eger deger haftanin gunlerinden herhangi birinin ilk harfi deilse boyle bir gun yok yazdirin
		
		char A= 'S';
		if(A=='P') {
			System.out.println("PAZARTESI ,PERSEMBE, PAZAR");
		}
		if(A=='C'){
				System.out.println("CARSAMBA,CUMA,CUMARTESI");
		}
		if(A=='S') {
			System.out.println("SALI");
		}
		

	}

}

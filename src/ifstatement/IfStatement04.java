package ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
//bir tane String variable olusuturup bir gun isminideger  atayin.eger atadiginiz deger hafta ici gunlerinden birinin ilk harfiyse 
		//hafta ici yazdirin,degilse hafta sonu yazdirin
		
		String g = "pazar"; 
		if(g.equals("pazartesi") || g .equals("sali")|| g.equals("carsamba") || g .equals("persembe") || g.equals("cuma") ) {
			System.out.println("hafta ici");
			
		}
       if(g.equals("cumartesi")|| g.equals("pazar") ) {
    	   System.out.println("hafta sonu");
       }
	}

}

package javapractice;

public class CharSorus {

	public static void main(String[] args) {
		 /*
	     * Bir method olusturunuz charSayisi ve 2 parameter ekleyiniz 1- char 2- String
	     * char ch = 'p'; String str = �Ingilizce�de purple mor ve people insanlar
	     * demektir"; int count = 0; Yukaridaki String te elinizdeki char ne kadar
	     * tekrar etmisse o kadar return etsin for loop, increment ve if statements
	     * kullanabilirsiniz
	     */
	
	    
	    String ch ="p";
	    String str = "aIngilizce�de purple mor ve people insanplar demektirpa";
	    
	    String [] arr = str.split(ch);
	    System.out.println(arr.length-1);

	}

}

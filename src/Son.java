import java.util.Scanner;

public class Son {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		word = word.toLowerCase().replace(" ", "");
		String tersi ="";				
		for(int i = word.length()-1; i>=0 ; i --) {
		tersi += word.charAt(i);
		}
		if(word.equals(tersi)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class ArraySplit {

	public static void main(String[] args) {
		//Bir String de�i�keni c�mlesi verildi�inde, her s�zc��� almak i�in kod yaz�n ve 
		//tersine ters �evrilmi� String'e atay�n.

		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String reversed = "";
		    String arr[]=sentence.split(" ");
		  System.out.println("sentence ->" + Arrays.toString(arr));
		  for(int i =arr.length-1; i>=0 ; i--) {
			reversed += arr[i] + " ";  
			 
		  }
		  System.out.println("reversed ->" + reversed);
	}

}

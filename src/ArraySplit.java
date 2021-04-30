import java.util.Arrays;
import java.util.Scanner;

public class ArraySplit {

	public static void main(String[] args) {
		//Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve 
		//tersine ters çevrilmiş String'e atayın.

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

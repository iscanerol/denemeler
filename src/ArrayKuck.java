import java.util.Arrays;

public class ArrayKuck {

	public static void main(String[] args) {
		//Array listesindeki 2. en b�y�k say�y� bulan Java Kodunu yaz�n�z.

		int arr[] = {1232,2345,5467,678,3454,2312,3451};
		Arrays.sort(arr);
		
	
		System.out.println(arr[arr.length-2]);
	}


}
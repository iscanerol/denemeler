
public class ArrayToplam {

	public static void main(String[] args) {
		// Array deki say�lar� tolpayan Java kodunu yaz�n�z.

		// array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		int arr[] = { 20, 30, 25, 35, -16, 60, -100  };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double sonu� = sum /arr.length;
		System.out.println("Array Say�lar�n�n ortalamas�: " + sonu�);
	}

}

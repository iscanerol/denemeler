

public class Arrays02 {

	public static void main(String[] args) {
		// yazýlan deðerin array içerisinde arayan Java Kodu yazýnýz.
		// Array: [1551,1223,1443,1267,1789,1023,2020]
		
		int arr[] = { 1551, 1223, 1443, 1267, 1789, 1023, 2020 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (2020 == arr[i]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
		for (int i = 0; i < arr.length; i++) {
			if (2010 == arr[i]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}


public class ArrayTekCift {

	public static void main(String[] args) {
		//Array i�erisindeki tek ve �ift say�lar�n ka�ar tane oldu�unu bulan Java Kodu yaz�n�z.

          //Array: [1,2,3,4,5,6,7,8,9]
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int countCift = 0;
		int countTek =0;
		for(int i = 0; i <arr.length;i++) {
			
			if (arr[i] %2!=0) {
				countTek++;
			}else
             {
				countCift++;
			}
		}System.out.println("Tek Sayilar: "+ countTek );
		System.out.println("Cift Sayilar: "+ countCift  );


	}

}

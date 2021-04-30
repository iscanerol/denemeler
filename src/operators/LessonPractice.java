package operators;

public class LessonPractice {

	public static void main(String[] args) {

		// verilen iki sayýnýn yerlerini deðiþtiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        
        
        System.out.println("---Deðiþiklik öncesi---");
        System.out.println("1. Sayý= "+num1);
        System.out.println("2. Sayý= "+ num2);
        
        //ilk önce 1. sayý deðerini temp(Geçici deðer) içerisine atýyoruz
        int temp =num1;
        
        //2. sayý deðerini 1. sayý'ya atýyoruz
        num1= num2;
        
        // ve son olarak temp içindeki deðeri 2. sayýya eþitliyoruz
        num2= temp;
        
        System.out.println("---Deðiþiklik sonrasý---");
        System.out.println("1. Sayý= "+num1);
        System.out.println("2. Sayý= "+num2);

       

}
}
package operators;

public class LessonPractice {

	public static void main(String[] args) {

		// verilen iki say�n�n yerlerini de�i�tiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        
        
        System.out.println("---De�i�iklik �ncesi---");
        System.out.println("1. Say�= "+num1);
        System.out.println("2. Say�= "+ num2);
        
        //ilk �nce 1. say� de�erini temp(Ge�ici de�er) i�erisine at�yoruz
        int temp =num1;
        
        //2. say� de�erini 1. say�'ya at�yoruz
        num1= num2;
        
        // ve son olarak temp i�indeki de�eri 2. say�ya e�itliyoruz
        num2= temp;
        
        System.out.println("---De�i�iklik sonras�---");
        System.out.println("1. Say�= "+num1);
        System.out.println("2. Say�= "+num2);

       

}
}
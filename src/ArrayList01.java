
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ArrayList01 {

	public static void main(String[] args) {

		// Array i ARRAYLIST e çeviren Java Kodunu yazýnýz.
		// Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
		String arr1[] = { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
		
		List<String> list1 = Arrays.asList(arr1);
		System.out.println(list1);
	}

}

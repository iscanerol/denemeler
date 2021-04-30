import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deneme {

	public static void main(String[] args) {
	
		List<String>list = new ArrayList<>();	
		list.add("Ali");
		list.add("veli");
		list.add("deli");
		System.out.println(list);
		list.add(1, "han");
		list.add(2, ("dal"));
		list.add("kal");
		System.out.println(list);	
		System.out.println(list.size());
		List<Integer>list1 = new ArrayList<>();
		System.out.println( list.isEmpty());
		System.out.println(list.remove(1));
		System.out.println(list);
		list.remove("kal");
		System.out.println(list);
		list.set(0, "alican");
		System.out.println(list);
		System.out.println(list.contains("veli"));
		Collections.sort(list);
		System.out.println(list);
		
	}

}

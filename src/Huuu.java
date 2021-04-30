import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Huuu {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		System.out.println( list1.equals(list2));
		list1.add("ALI");
		list1.add("veli");
		String arr[]= list1.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		Object[] arr1= list1.toArray();
		System.out.println(Arrays.toString(arr1));
		String arr2[] = {"ali", "veli"};
		Arrays.asList(arr2);
		List<String>list3 = Arrays.asList(arr2);
		System.out.println(Arrays.asList(arr2));
		int arr4[]= {10,12,13,15};
		//for(int i =0; i<arr4.length; i++) {
			//System.out.print(arr4[i] +" ");
			for(int w :arr4) {
				System.out.print(w +" ");
				
				List<Integer>list4 = new ArrayList<>();
				list4.add(10);
				list4.add(12);
				list4.add(13);
				System.out.println(list4);
				int sum =0;
				for (int k : list4) {
					sum = sum +k;
				
				}System.out.println(sum);
				
			}
		}
	

}

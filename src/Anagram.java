import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {

	public static boolean isAnagram(String word1, String word2){
		// Anagram, bir kelimenin harflerinden ba�ka bir kelime olu�turmaya denir.

		// Kullan�c�dan al�nacak iki kelimenin Anagram durumunu belirleyen Java kodunu
		// yaz�n�z.
		Scanner scan = new Scanner(System.in);
		 word1 = scan.next();
		 word2 = scan.next();
		int saya� = 0;
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		for (int i = 0; i < ((CharSequence) word1).length(); i++) {
			list1.add(word1.charAt(i));
		}

		for (int i = 0; i < word2.length(); i++) {
			list2.add(word2.charAt(i));
		}
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					saya�++;
				}
			}
		}
		if (saya� == list1.size()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return false;
	}
}
package codingbat;

public class String01 {

	public static String main(String[] args) {
		String str ="add";
		if (str.length()<4 || (!str.substring(1,4).equals("del")) ){
			return str;
					
			  }else{
			 str = str.substring(0, 1) + str.substring(4);
			  }
		return str;
			}
}
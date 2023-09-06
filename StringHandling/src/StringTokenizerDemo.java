import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public static void main(String[] args) {
		String s2 = "Hello Hi @ How Are You";
		String[] arr = s2.split("\\ ");
		for (String string : arr) {
			System.out.println(string);
		}
		
		System.out.println("==================");
		StringTokenizer token = new StringTokenizer(s2, "\\@");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}

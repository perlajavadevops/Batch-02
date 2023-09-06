
public class StringConvertionDemo {
	
	public static void main(String[] args) {
		String s1 = "   Welcome     ";
		String s2 = "ASCII stands for American@ Standard Code for Information "
				+ "Interchange. Below is the ASCII@ character table, "
				+ "including descriptions of the first@ 32 characters.";
		
		String s3 = "Madhava_Raghuram";//0
		
		System.out.println(s1.trim());
		/*
		 * System.out.println(s1);
		 * 
		 * //s1 = "Hi"; System.out.println(s1.concat("Hi")); s1 =
		 * s1.concat("Hi");//WelcomeHi
		 * 
		 * System.out.println(s1);
		 */
		/*
		 * System.out.println(s3.length());
		 * 
		 * System.out.println(s3.substring(8, s3.length())); char[] chArry =
		 * s1.toCharArray();
		 */
		
		/*
		 * for (int i = 0; i < chArry.length; i++) { System.out.print(chArry[i]); }
		 */
		
		/*
		 * for (int i = 0; i < s1.length(); i++) { System.out.print(s1.charAt(i)); }
		 */
		
		/*
		 * byte[] byteArr = s1.getBytes(); for (int i = 0; i < byteArr.length; i++) {
		 * System.out.print((char)byteArr[i]); }
		 */
		
		/*
		 * String[] strArry = s2.split("\\@"); for (String val : strArry) {
		 * System.out.println(val); }
		 */
		
		
	}

}

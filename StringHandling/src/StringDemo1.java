
public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Hello";//
		String s2 = "Hello";
		
		String s3 = "hello";
		
		String s4 = new String("Hello");
		//s4 = s4.intern();
		
		System.out.println("Equals method");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s3.equals(s4));//false
		
		System.out.println("equalsIgnoreCase method");
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//false
		System.out.println(s1.equalsIgnoreCase(s4));//true
		System.out.println(s3.equalsIgnoreCase(s4));//false
		
		System.out.println("== operator");
		System.out.println("s1 hashCode : "+s1.hashCode());
		System.out.println("s2 hashCode : "+s2.hashCode());
		System.out.println("s3 hashCode : "+s3.hashCode());
		System.out.println("s4 hashCode : "+s4.hashCode());
		
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//false
		System.out.println(s3 == s4);//false
		
		System.out.println("compareTo operator");
		
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//-32
		System.out.println(s1.compareTo(s4));//0
		System.out.println(s3.compareTo(s4));//32
		
	}
}

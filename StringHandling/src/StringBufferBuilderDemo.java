
public class StringBufferBuilderDemo {

	public static void main(String[] args) {
		String message = "Hello";//
		//StringBuffer buffer = new StringBuffer(message);
		StringBuilder buffer = new StringBuilder(message);
		System.out.println(buffer);
		//buffer.insert(0, "Hi");
		//buffer.delete(0, 3);
		buffer.append(" Reddy");
		System.out.println(buffer.length());
		System.out.println(buffer);
	//	System.out.println(buffer.reverse());//Hello Reddy -->Reddy Hello
		
		String con = buffer.toString();
		
		for (int i = message.length()-1; i >=0; i--) {
			System.out.print(message.charAt(i));
		}
		
	}
}

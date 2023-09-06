
public class CheckExceptionDemo {

	public static void getCl() throws ClassNotFoundException {
		System.out.println("Statement 1..");

		//try {
			Class.forName("java.lang.String222");
			/*
			 * } catch (ClassNotFoundException ne) { ne.printStackTrace(); }
			 */

		System.out.println("Statement 2..");
	}
	public static void main(String[] args) {
		
		try {
			getCl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Statement 3..");
	}
}

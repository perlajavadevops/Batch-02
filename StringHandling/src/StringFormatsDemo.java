
public class StringFormatsDemo {

	public static void main(String[] args) {
	
		String email = "GangI.PerLAREddy@gmail.in";
		
		String rex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		
		boolean flag = email.matches(rex);
		System.out.println(flag);
	}
}

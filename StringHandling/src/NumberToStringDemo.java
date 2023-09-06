import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberToStringDemo {

	public static void main(String[] args) {
		String val = "1007h";
		
		int num = 120;
		
		//int convertedVal = Integer.parseInt(val);
		float convertedVal = Float.parseFloat(val);

		
		System.out.println(convertedVal);
		
		String s = String.valueOf(num);
		System.out.println(s);
		
		double d = 80.9999999;
		System.out.println(d);//80.89
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		//BigDecimal bd = new BigDecimal(d);
		//System.out.println(bd.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		System.out.println(df.format(d));
		
	}
}

package date;

import java.math.BigDecimal;

public class XiaoShuDian {

	
	public static void main(String[] args) {
		
		   Double i = 111231.5005478; ;
	        BigDecimal bg = new BigDecimal(i);
	        double j = bg.setScale(4, bg.ROUND_HALF_UP).doubleValue();
		System.out.println("j==="+j);
		
		  System.out.println( new BigDecimal(i).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		  
		  double d = 3.005001465926;
		  String result = String.format("%.2f", d);
		  System.out.println(result); 
		  
		  
	}
	
}

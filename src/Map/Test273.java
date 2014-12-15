package Map;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test273 {

	
	public static void main(String[] args) {
		
	
		Map< String, String> map=new HashMap<String, String>();
		
		map.put("", "12");
		map.put("", "122");
		long start=System.currentTimeMillis();
//		for (int i = 0; i < 200000; i++) {
//			
//			System.out.println("=="+map.get(""));
//			
//		}
		
		long end=System.currentTimeMillis();
		
		Date date=new Date(end-start);
		
		System.out.println("date==="+(end-start));
		///
		Random random=new Random(10);
		String [] ran=new String[5];
		for(int i=0;i<5;i++){
			
			ran[i]=String.format("%s", (random.nextInt()));
			System.out.println("===="+ran[i]);
		}
		
		System.out.println("444"+ran.length);
		
	}
	
}

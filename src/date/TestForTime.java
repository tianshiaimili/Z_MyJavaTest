package date;

import java.sql.Timestamp;
import java.util.Calendar;

public class TestForTime {

	public static void main(String[] args) {
		
		Timestamp vaTimestamp=new Timestamp(000);
		System.out.println("vaTimestamp=="+vaTimestamp.getDate()+"  "+vaTimestamp.getTime());
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("---"+calendar.getTime());
		System.out.println("11111-===="+(Calendar.DAY_OF_MONTH));
		System.out.println("---"+ calendar.get(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)+1);
		//calendar.set(field, value)
		
		System.out.println("---"+(Calendar.DAY_OF_WEEK)+1);
		System.out.println("---"+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("---"+calendar.getTime());
		
		calendar.set(Calendar.YEAR, 2009);
		System.out.println("-----"+calendar.getTime());
		/////
		calendar.set(Calendar.MONTH, 10);
		System.out.println("-----"+calendar.getTime());
		/////
		calendar.set(Calendar.DATE, 30);
		System.out.println("-----"+calendar.getTime());
		
		
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)+1);
		 java.sql.Timestamp value = new Timestamp(calendar.getTimeInMillis());
		
		
	}
	
	
}

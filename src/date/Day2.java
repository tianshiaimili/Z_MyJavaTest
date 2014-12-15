package date;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Day2 {

	private static int[] aDaysInMonth =
	{
		31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
	};
	
	public static void main(String[] args) {
		
		//
		Date date=new Date();
		
		///
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		System.out.println("===="+calendar.getTime());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("calendar.set(Calendar.DAY_OF_MONTH, 1)===="+calendar.getTime());
		int month = calendar.get(Calendar.MONTH) + 1;
		 //date= new Timestamp(calendar.getTimeInMillis());
		System.out.println("date=="+date+"   month= "+month);
		
		
		/**
		 * 判断是否闰年
		 */
	System.out.println("是否是闰年=="+daysInMonth(2, 2013));
	
	/**
	 * DecimalFormat使用
	 */
	String abcString=new DecimalFormat(",###").format(1234123456);
	
	System.out.println("abcString==="+abcString);
	//////////////////////////
	String p52c1="p52c112";
	
	String xxx=p52c1.substring(p52c1.indexOf("1"), p52c1.length());
	
	System.out.println("-----------"+xxx+"    "+p52c1.indexOf("2c1")+"    "+p52c1.length());
	}
	
	
	/**
	 * 判断是否闰年
	 */
	public static boolean isLeapYear(int y){
		GregorianCalendar cal = new GregorianCalendar(); 
		boolean isLeapYear = cal.isLeapYear(y); 
		return isLeapYear;
	}
	// date functions
	public static int daysInMonth(int m, int y){
		return (m) == 2 && isLeapYear(y)  ? 29  : aDaysInMonth[m-1];
	}
	
	/**
	 * 时间的转换
	 */
	public static long utlltoa(long lValue, String sAmount){
		//sAmount.setValue(new DecimalFormat(",###").format(lValue));
		return 0;
	}
	
}

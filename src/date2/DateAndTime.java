package date2;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {

	public static void main(String[] args) throws Exception {
		
		Date date=new Date();
		
		
		String time=String.format("%tc", date);
		String form=String.format("%tF", date);
		
		System.out.println("全部的时间信息："+time);
		System.out.println("年-月-日 的时间格式："+form);
		
		System.out.println("指定时间的月份简称：："+String.format("%tb", date));
		System.out.println("一个月中的第几天：："+String.format("%td", date));
		System.out.println("一年中的第几天：："+String.format("%tj", date));
		
		///////////////////
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
		//Date date2=df.parse("07/10/96");
		String format=df.format(date);
		//String format2=df.format(date, null,FieldPosition)
		System.out.println("format:"+format);
	}
	
}

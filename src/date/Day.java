package date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day {
	public static void main(String[] args) {
		Long newTime=System.currentTimeMillis();
		Timestamp timestamp=new Timestamp(newTime);
		System.out.println("timeStamp=="+timestamp);
		System.out.println("     ");
		Date d = new Date(newTime);
		System.out.println("d=="+d);
		///////////////////////////////////////////
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(calendar.DAY_OF_YEAR, 6);
		System.out.println("______"+new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
		//
		Date date11=new Date();
		
		long ll=1;
		ll++;
		System.out.println("llll====="+ll);
		
		/////
		
		
		/**
		 * 
		 */
		
		long l2=663663;////899203;
		long fen=l2/1000/60;
		long miao=l2/1000%60;
		long haomiao=l2%1000;
		Timestamp timestamp2=new Timestamp(899203);
		System.out.println("过了多少"+fen+"分"+miao+"秒"+haomiao+"毫秒      timestamp2=="+timestamp2);
		
		long l3=239016;
		long fen2=l3/1000/60;
		long miao2=l3/1000%60;
		long haomiao2=l3%1000;
		Timestamp timestamp3=new Timestamp(239016);
		System.out.println("过了多少"+fen2+"分"+miao2+"秒"+haomiao2+"毫秒      timestamp3=="+timestamp3);
		///////////////////////
		
		try {
			test("2010-05-05",30);
			day();
			
			System.out.println("=========="+utlAddYears(new Date(),-4));
			
			//
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			//SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
			
			
			Date date=new Date();
			String string=sdf.format(date);
			///
			String dateee=string.substring(string.indexOf("."), string.length());
			String dateee2=string.substring(20, string.length());
			System.out.println("dateee==="+dateee+"    "+dateee2);
			
			String string2=sdf2.format(date);
			
			String repit="ABD_106_"+string2;
			
			System.out.println("--***********--"+string+"     "+string2+"    "+repit);
			////
			Date date2=new Date();
		     String ss= ""+date2.getTime();

		      Calendar c = Calendar.getInstance(); 
		      long l = c.getTimeInMillis(); 
		      System.out.println("l==="+l);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 static void test(String d, int day) throws ParseException{
		 Date date = new Date();
		long a = date.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		long b = sdf.parse(d).getTime();
		System.out.println(""+a/(1000*60*60*24)+"+++===="+b/(1000*60*60*24));
		int success = (int) ((a-b)/(1000*60*60*24));  //1000毫秒*60分钟*60秒*24小时 = 天
		System.out.println("距离"+d+"有"+success+"天");
		if(success <= day){  //如果距离那天天数等于day
			//把值存到某个地方,或者返回回去
		}
	 }
	 
	 static void day(){
		 
		 java.sql.Date date=new java.sql.Date(System.currentTimeMillis());
		 
		 java.sql.Date date1=new java.sql.Date(2013, 10, 26);
		 
		 
		 System.out.println("date="+date +"date1=="+date1 +"   ----");
		 
		 
		 
	 }
	 ////////////////
	 public static Date utlAddYears(Date mDate, int nYears){
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(mDate);
		   int   Year  = cal.get(Calendar.YEAR);
		   int   Month = cal.get(Calendar.MONTH)+1;
		   int   Day   = cal.get(Calendar.DATE);
		   int newYear=Year+nYears;
		   if(Month==2){
				 if(Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0){
					 //   是闰年
					 if(newYear % 4 == 0 && newYear % 100 != 0 || newYear % 400 == 0){
						 
					 }else{
						 if(Day==29) {
							 Day=Day-1;
						 }
					 }
					}else{
					  //  不是闰年
						if(newYear % 4 == 0 && newYear % 100 != 0 || newYear % 400 == 0){
							if(Day==28) {
								Day=Day+1;
							 }
						 }else{
							 
						 }
					}
			 }
		   return mDate;//=CommonConstant.getSqlDate(changDateToString(Day,Month,newYear));
		   
	 }
	 
}
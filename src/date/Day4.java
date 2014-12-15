package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day4 {

	public static void main(String[] args) {
		
		
		java.util.Date date=new Date();
		System.out.println("date==="+date);
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MMM-yyyy");
		//
		String dateString=format.format(date);
		//
		System.out.println("dateString===="+dateString);
		
	}
	
}

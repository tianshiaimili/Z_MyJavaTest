package date2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		
		//Calendar cale = Calendar.getInstance();  
       // System.out.println(cale); 
        //
        Date date = new Date();  
        System.out.println(date);  
        //
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy",  
                Locale.ENGLISH);  
        System.out.println(sdf.format(date));  
        //System.out.println(sdf.format(cale.getTime())); 
		
		
	}
	
}

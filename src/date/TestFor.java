package date;

import java.util.Calendar;

public class TestFor {

	public static void  main(String[] args){
		
	int i=0;
/*	for(;;){
	 i++;
		System.out.println("a\n");
		
		try {
			Thread.sleep(1000);
			System.out.println("wait 1 second...");
			//Thread.currentThread().stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("will beark ..");
		break;
		
		
	}*/
	
	String string="DRP-DS-20110328-20110329.DAT";
	
	int index=string.indexOf("-");
	
	System.out.println(index);
	
	String filename=string.substring(index+1);
	System.out.println("fileName="+filename);
	
	int index2=filename.indexOf("-");
	System.out.println("index2="+index2);
	char [] arr={'A','B'};
	String string2=String.valueOf(arr);
	System.out.println("string2=="+string2);
	System.out.println("////////////////////////////////////////////");
	
	long x= (long)Math.ceil((double)(6) / 3);
	System.out.println("x=="+x);
	
	String string3="2.123456789";
	int c=4;
	System.out.println(String.format("%7.3s %d", string3,c));
	
	//int e="E"+"";
	System.out.println("====="+("E"+""));
	
	Calendar tm2=Calendar.getInstance();
	tm2.get((Calendar.MINUTE));
	System.out.println(tm2.getTime());
	tm2.set(Calendar.HOUR_OF_DAY,  6);
	
	System.out.println(tm2.getTime());
	
	
	int w=3;
	}
	
}



































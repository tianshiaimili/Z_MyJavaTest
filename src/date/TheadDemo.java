package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

//import org.omg.CORBA.PRIVATE_MEMBER;

public class TheadDemo {
	
	private static Timer timer;
	
	public static void main(String[] args) {
		
		timer=new Timer(true);
		timer.schedule(new java.util.TimerTask() { public void run()
		{ 
			//要操作的方法
			breakThead(); } }, 0, 5*60*1000);
		 
		
		//breakThead();
		
	}
	public static void breakThead(){
		
		//
		
		System.out.println("当前时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new  Date(System.currentTimeMillis())));
		
	}
	
	//class

}

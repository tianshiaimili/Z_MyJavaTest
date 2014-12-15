package date;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		
		Date date=new Date();
		
		System.out.println("date=="+date+"  \n "+String.format("===%tm", date));
		
		
		boolean b=false;
		
		System.out.println("=="+String.format("%s", b));
		
		File parentD = new File("\\csss\\dev\\ico\\tapefile\\abc\\aaa").getParentFile();
		
		String fileString=parentD.getPath();
		
		System.out.println("fileString=="+fileString);
		
		try {
			
			if (!parentD.exists()) {
				boolean mkD = parentD.mkdirs();
				System.out.println("-----"+mkD);
				if (!mkD) {
					throw new IOException("Unable to make parent diretory," + parentD);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("-========="+parentD.getPath());
		////////////////////////////////////////////////////////////////////////////////////
		
		
		String string=String.format("%-" +(23 - 2) + "." + (23- 2) + "s\n", "").replaceAll("\n", "\r\n");
		
		System.out.println("String===="+string);
		System.out.println("------------------------------------------------");
		
		
		//s.substring(0, s.indexOf(s.trim()) + s.trim().length());
		
		String s="A000083";
		
		s=s.substring(0,s.indexOf(s.trim()) + s.trim().length());
		
		System.out.println("++++++++++");
		System.out.println(s.indexOf(s.trim())+"\n"+s);
		
		
		System.out.println("0%100="+(0%100));
		
		/////////////////////////////
		//这意思是不够位数的话 在前面补0
		String fileName = "SWD_" + String.format("%04d%02d%02d", 2012, 8, 2);
		
		System.out.println("day======="+fileName);
		
		
	}
	
	
}




















































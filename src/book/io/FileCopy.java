package book.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		String innameString="D://pie.jpg";
		String outnString="D://pie2.jpg";
		copy(innameString,outnString);
		
	}
	///
	
	public static  void copy(String inName,String outName){
		
		FileInputStream in=null;
		FileOutputStream out=null;
		
		int t=0;
		byte[] bb=new byte[1024];
		
		try {
			
			in=new FileInputStream(inName);
			out=new FileOutputStream(outName);
			while((t=in.read(bb))!= -1){
				
				out.write(bb,0,t);
				System.out.println("....");
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}

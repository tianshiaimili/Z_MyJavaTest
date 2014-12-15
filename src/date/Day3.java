package date;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Scanner的阶段读取
 * @author Administrator
 *
 */
public class Day3 {

	
	public static void main(String[] args) {
		
		List<String> paths=sscanf("sHdr D:/CSSS_ABS001_20111231_20120105-1.dat sTal", "\\s+");
		String path;
		for(int i=0;i<paths.size();i++ ){
			
			path=paths.get(i);
			System.out.println("第"+i+"个是=="+path);
		}
		
		
		///////////////
			File file = new File("D:/CSSS_ABS001_20111231_20120105-1.dat");
			
			System.out.println("返回由此抽象路径名表示的文件的长度="+file.length());
			//201112 2181960 0
		long mu=(201112 -2181960);
		System.out.println("-----"+mu);
///////////////////////////////////////////////////////////////////
		String file22="FAT_BAT_ARAUPDX_20131116_RPT.xls";
		int index=file22.indexOf(".");
		String file33=file22.substring(index+1, file22.length());
		System.out.println("+++++==file33="+file33);
		
		/**
		 * 十六进制和二进制间的转换
		 */
		int a2=3;
		 int	UTL_ERROR_ON_DHP = (0x00000002);
		 
		String s2=Integer.toBinaryString(UTL_ERROR_ON_DHP);
		String s16=Integer.toHexString(UTL_ERROR_ON_DHP);
		String s10=Integer.toOctalString(UTL_ERROR_ON_DHP);
		
		System.out.println(s2  + "  " +s16+"   "+s10 );
		
		/**
		 * 生成特定的时间格式
		 */
		
		java.sql.Date date3=new Date(System.currentTimeMillis());
		
		System.out.println("date3=="+date3);
		
		
		/**
		 * 
		 * 
		 * 
		 */
		String  runTimeDate=new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new java.util.Date());
		
		System.out.println(String.format("REPORTID :%50s", runTimeDate));
		String totalcount="TOTAL NUMBER OF MANUAL CHEQUE PAYMENT CASES:  ,"+1200;
		System.out.println(totalcount);
		int ff=0;
		
		long dd=9;
		int cc=3;
		//ff=dd-cc;
		System.out.println(dd-cc);
	}
	//////
	
	public static Scanner getScanner(String str, String delimiter){
		Scanner sc = new Scanner(str);
		sc.useDelimiter(delimiter);		
		return sc;
	}
	public static List<String> sscanf(String str, String delimiter){
		List<String> strs = new ArrayList<String>();
		Scanner sc = getScanner(str, delimiter);
		while(sc.hasNext()){
			strs.add(sc.next());
		}
		return strs;
	}
	
}

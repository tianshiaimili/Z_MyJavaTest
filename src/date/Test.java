package date;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		

		int cc=0,dd=0;
		int ddd=cc-dd;
		System.out.println("dddddd====="+ddd);
		String dddString=String.format("%s", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
		
		System.out.println("684654656565==="+dddString);
			
			/* Calendar cal = Calendar.getInstance();
			System.out.println("===="+cal.get(Calendar.YEAR));
			System.out.println("===="+cal.get(Calendar.MONTH));
			System.out.println("===="+cal.get(Calendar.DATE));
			
			String string="ABCDEFG";
			System.out.println("String="+string);
			
			String string2=string.substring(2,4);
			System.out.println("string2="+string2);*/

/*		getDateTOString();
		//
	String string=	getFilePath("F:\\csss\\prd\\report\\ERB","20130816");
	System.out.println("ssss="+string);
	List<String> list=new ArrayList<String>();
	getUserFilePatch("F:\\csss\\prd\\report\\ERB", list);
	
	for(int i=0;i<list.size();i++){
		System.out.println("dddd==="+list.get(i));
	}*/


		String string="ABC";
		
		//Long long1=new Long(string).longValue();
	
	//System.out.println("long1"+long1);
	
		double d=2.0130816E7;
		String string2=String.format("%s",d);
		int i=(int)d;
		System.out.println(i);
		
		
	//////////////////////////
		String string3="LR&ERB&CR&HA&TD&SFAA_STUD&EDB&LD_WITS";
		
		String[] arr=string3.split("&");
		
		for(int j=0;j<arr.length;j++){
			System.out.println("arr"+j+"="+arr[j]);
		}
		
		
		
		int d3=15;
		
		int d2=Integer.parseInt("12");
		System.out.println("\n"+d2);
		
		int d4=d3-d2;
		System.out.println("d4=="+d4);
		
		
		
	}
	
	public static void getDateTOString (){
		
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
		String string=simpleDateFormat.format(date);
		System.out.println("_____"+string);
		
		
	}
	////////////
	
	public static String getFilePath(String filePath,String batchDate){
		
		String userPath=filePath;
		List<String> pList=new ArrayList<String>();
		//Util.debugLog().info("****getUserPathList****");
		pList=getUserFilePatch(userPath, pList);
		
		for(int i=0;i<pList.size();i++){
			System.out.println("======="+pList.get(i));
		}
		
		for(int i=0;i<pList.size();i++){
			String path=pList.get(i);
			int indexUP=path.length()-12;
			int indexDown=path.length()-4;
			if(path.substring(indexUP, indexDown).equals(batchDate)){
				userPath=path;
				System.out.println("userpath1=="+userPath);
				return userPath;
			}
		}

		//Util.debugLog().info("**userPath==***"+userPath);
		System.out.println("userpath2=="+userPath);
		return userPath;
	}
	
	///////////
	 public static List getUserFilePatch(String filePatch, List<String> userFilePatchList) {
		  File file = new File(filePatch);
		  
		  if(!file.exists()) file.mkdirs();
		  
		  File[] subFile = file.listFiles();
		  List<String> patchList=new ArrayList<String>();
		  patchList=userFilePatchList;
		  
		  for (int i = 0; i < subFile.length; i++) {
		   if (subFile[i].isDirectory()) {
			   getUserFilePatch(subFile[i].getAbsolutePath(), userFilePatchList);
		   } else {
		    String filename = subFile[i].getName();
		    patchList.add(filename);
		   }
		  }
		  return  patchList;
		 }
	
	
}

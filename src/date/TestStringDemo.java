package date;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestStringDemo {

	public static void main(String[] args) {
		
		String string="ABCDEFG";
		//char [] arr={"A","B","C","D"};
		char[] c={'A','B','C','D'};
		String string2=new String(c);
		
		System.out.println("c=="+c.toString());
		
		/*String sssString=" ";
		
		System.out.println("__________________"+Long.valueOf(sssString));*/
		/*String restartKey="-1";
		String[] keyResult = restartKey.split(" ");
		System.out.println("====="+keyResult[0]);*/
		
		System.out.println("=======+++"+Long.valueOf(""));
		
	}
	
	///////获取准确的路径/////
	
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
	
	/////////获取用户路径集合//
	 public static List getUserFilePatch(String filePatch, List<String> userFilePatchList) {
		  File file = new File(filePatch);
		  //路过路径不存在就创建
		  if(!file.exists()) file.mkdirs();
		  
		  File[] subFile = file.listFiles();
		  System.out.println("subFile="+subFile.length);
		  //
		  List<String> patchList=new ArrayList<String>();
		  //
		  patchList=userFilePatchList;
		  
		  for (int i = 0; i < subFile.length; i++) {
		   if (subFile[i].isDirectory()) {
			   getUserFilePatch(subFile[i].getAbsolutePath(), userFilePatchList);
		   } else {
			   //
		    String filename = subFile[i].getName();
		    //
		    patchList.add(filename);
		   }
		  }
		  return  patchList;
		 }
	
	
}

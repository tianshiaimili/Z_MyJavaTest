package date;

import java.io.File;

public class FileDemo {

	
	public static void main(String[] args) {
		
		getFilePath();
		
	}
	
	public static String getFilePath(){
		
		//F:\BUG\222
		File file=new File("F:\\BUG\\222\\222.sql");
		
		String path=file.getPath();
		System.out.println(path);
		return path;
	}
	
/*	sDirFile = String.format("%s/drp_rj_file_list.txt", sInFilePath);
	FileC fc = new FileC(sDirFile);
	String match = "DRP-DR-.+\\.DAT";
	File file = new File(sInFilePath);
	File fileList[] = file.listFiles();
	Pattern p = Pattern.compile("DRP-DR-(.+).DAT");
	for(File f : fileList){
		if(f.isFile()){
			Matcher m =  p.matcher(f.getName());
			if(m.matches()){
				fc.writeStr(f.getName() + "\n");
			}
		}
	}*/
	
}

package File;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		String name="F:\\CIS\\fromCIS//CSSS_idtype.2012";
		///CIS/fromCIS/CSSS_idtype.2012
		String nameString="F:/CIS/fromCIS/CSSS_idtype.2012";
		File file=new File(nameString);
		boolean bb=file.delete();
		
		System.out.println("bb:"+bb);
		
	}
	
	
}

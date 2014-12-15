package execl;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Function182Test {

	static FileWriter fw;
	static String h_sLine00;
	public static void main(String[] args) throws Exception {
		
	 fw= new FileWriter("F:\\csss\\ecp\\spl\\mnlcq\\182demo.csv",true);
		 
		 ////
		 long rc = 0;
			//String reportID=UtlDtBatchPropUtil.getUtlDtBatchProp().getUTL_BATCH_PID();
			String  runTimeDate=new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new java.util.Date());
			String reportName="Validation file for SIA";
			
			try {
				
			
				fw.write(String.format("REPORTID :%10s", "123456"));
				//fw.write(String.format(",Run DATE :%10s\n\n",runTimeDate));
				fw.write(String.format(",,,,,,,,,,Run DATE :%20s\n\n",runTimeDate));
				fw.write(String.format("REPORT Name:%20s\n", reportName));
				fw.write(String.format(", , , , ,%30s\n", "Validation report for cheque payment upload result"));
				initAllHeaderLines(); 
				
				//h_sLine00=String.format("", "");
				
				h_sLine00=",,,SWD PAYMENTDATE   ,CASE KEY   ,CUSTOMER KEY   ,SEQUENCE NUMBER   ," +
						"PROCESSING UNIT   ,SCHEME TYPE   ,SERLAL NUMBER   ,RESULT   "+"\n";
				
				fw.write(h_sLine00);
				fw.flush();
			} catch (Exception e) {
				
			}
		
	}
	
	public  void crreateFile() throws Exception{
		
		 fw= new FileWriter("F:\\csss\\ecp\\spl\\mnlcq\\182demo.csv",true);
		 
		 ////
		 long rc = 0;
			//String reportID=UtlDtBatchPropUtil.getUtlDtBatchProp().getUTL_BATCH_PID();
			String  runTimeDate=new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new java.util.Date());
			String reportName="Validation file for SIA";
			
			try {
				
			
				fw.write(String.format("REPORTID :%20s\n", "123456"));
				fw.write(String.format("Run DATE :%20s\n",runTimeDate));
				fw.write(String.format("REPORT Name:%20s\n", reportName));
				fw.write(String.format(", , ,%30s\n", "Validation report for cheque payment upload result"));
				initAllHeaderLines();
				
				h_sLine00="SWD PAYMENTDATE,CASE KEY,CUSTOMER KEY,SEQUENCE NUMBER," +
						"PROCESSING UNIT,SCHEME TYPE,SERLAL NUMBER,RESULT"+"\n";
				
				fw.write(h_sLine00);
			} catch (Exception e) {
				
			}
	}
	///
	static void initAllHeaderLines() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 1024; i++)
			sb.append("0");
		h_sLine00 = sb.toString();
	}
	
	
}

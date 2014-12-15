package execl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
public class Execl182Copy {
	


	public static void main(String[] args) {
		
		System.out.println("...........");
		createExeclFile();
		
	}
	
	/////
	
	
	public  static void createExeclFile(){
		
		
		// build Excel work book
		HSSFWorkbook workbook = new HSSFWorkbook();
		// create export file C:\Users\dahua\Desktop\新建文件夹
		//String fileUniqueName = "D:/MyExecl22.xls";
		String fileUniqueName = "D:\\MyExecl82copy.xls";
		File exportFile = new File(fileUniqueName);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(exportFile);
			
			HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet    
			
			//
			//sheet.createFreezePane(0, 6);//设置分页
		    // 设置列宽 
			sheet.setColumnWidth(0, 800);
		    sheet.setColumnWidth(1, 800);
		    sheet.setColumnWidth(2, 5500); 
		    sheet.setColumnWidth(3, 3300);    
		    sheet.setColumnWidth(4, 4800);    
		    sheet.setColumnWidth(5, 5500);  ////  
		    sheet.setColumnWidth(6, 5500);    
		    sheet.setColumnWidth(7, 4000);    
		    sheet.setColumnWidth(8, 4500);    
		    sheet.setColumnWidth(9, 8000);

		 // 设置内容的字体    
		    //////设置剧中的边框样式
		    HSSFFont commonFont = workbook.createFont();    
		    commonFont.setFontName("SansSerif");    
		    commonFont.setFontHeightInPoints((short) 10);// 字体大小 
		 
		    // 前面标题的的央视 
		    HSSFCellStyle headstyle = workbook.createCellStyle();    
		    headstyle.setFont(commonFont);    
		    headstyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);// 左右居中    
		    headstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    headstyle.setLocked(true);    
		    headstyle.setWrapText(true);// 自动换行    
		    headstyle.setBottomBorderColor(HSSFColor.WHITE.index);
		    //headstyle.setFillBackgroundColor(HSSFColor.WHITE.index);///////
		   // headstyle.setFillForegroundColor(HSSFColor.WHITE.index);
		   // headstyle.setFillPattern(HSSFCellStyle.FINE_DOTS); 
		    headstyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);//填充央视
		    headstyle.setFillForegroundColor(HSSFColor.WHITE.index);
		    
		    
		   // 设置中间数据的央视  
		   HSSFCellStyle headstyleCenter = workbook.createCellStyle();    
		   headstyleCenter.setFont(commonFont);    
		   headstyleCenter.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		   headstyleCenter.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		   headstyleCenter.setLocked(true);    
		   headstyleCenter.setWrapText(true);// 自动换行    
		   headstyleCenter.setBorderTop((short)1);
		   headstyleCenter.setBorderLeft((short)1);
		   headstyleCenter.setBorderRight((short) 1);
		   headstyleCenter.setBorderBottom((short)1);
		   ////设置末尾总数的央视
		   HSSFCellStyle styleEnd = workbook.createCellStyle();    
		   styleEnd.setFont(commonFont);    
		   styleEnd.setAlignment(HSSFCellStyle.ALIGN_LEFT);// 左右居中    
		   styleEnd.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		   styleEnd.setLocked(true);    
		   styleEnd.setWrapText(true);// 自动换行    
		   styleEnd.setBorderTop((short)1);
		   styleEnd.setBorderLeft((short)1);
		   styleEnd.setBorderRight((short) 1);
		   styleEnd.setBorderBottom((short)1);
		   	
		   ///最后end 标题的央视和中间标题的央视 和冒号的央视
		   HSSFCellStyle multiStyleEnd = workbook.createCellStyle();    
		   multiStyleEnd.setFont(commonFont);    
		   multiStyleEnd.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		   multiStyleEnd.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		   multiStyleEnd.setLocked(true);    
		   multiStyleEnd.setWrapText(true);// 自动换行 
		   multiStyleEnd.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);//填充央视
		   multiStyleEnd.setFillForegroundColor(HSSFColor.WHITE.index);
		   
		   /////右边runtime
		   HSSFCellStyle runTimeStyle = workbook.createCellStyle();    
		   runTimeStyle.setFont(commonFont);    
		   runTimeStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);// 左右居中    
		   runTimeStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		   runTimeStyle.setLocked(true);    
		   runTimeStyle.setWrapText(true);// 自动换行 
		   runTimeStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);//填充央视
		   runTimeStyle.setFillForegroundColor(HSSFColor.WHITE.index);
		   
		   CellRangeAddress range = new CellRangeAddress(0, 0, 1, 2); 
//		   ///
//	    
		    try {    
		      // 创建第一行    
		      HSSFRow row0 = sheet.createRow(0);    
		      // 设置行高    
		      row0.setHeight((short) 500);  
		      //row0.setRowStyle(headstyle);
		      // 创建第一列    
		      HSSFCell cell0 ;//= row0.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表")); 
		      
		      
		      for(int i=0;i<11;i++){
			    	 
			    	 if(i==1){
			    		 	cell0 = row0.createCell(1); 
			    		 	cell0.setCellValue("REPORT ID");
					        cell0.setCellStyle(headstyle); 
					        sheet.addMergedRegion(range);
			    	 }else if(i==3){
			    		 
			    		 cell0=row0.createCell(i);
					      cell0.setCellValue(":SIAB001");
					      cell0.setCellStyle(headstyle); 
					      
			    		 
			    	 }else if(i==8){
			    		 
			    		 cell0=row0.createCell(i);
					      cell0.setCellValue("RUN DATE");
					      cell0.setCellStyle(runTimeStyle); 
					    
			    		 
			    	 }else if(i==9){
					      cell0=row0.createCell(i);
					      cell0.setCellValue(":2013-11-21  12:00:00");
					      cell0.setCellStyle(headstyle);
			    		 
			    	 } else{
			    		 
			    		  cell0=row0.createCell(i);
					      cell0.setCellStyle(headstyle);
			    		 
			    	 }
			    	 
			     }
		      
		      //创建第二行 
		   
		      HSSFRow row2 = sheet.createRow(1);    
		      // 设置行高    
		      row2.setHeight((short) 500);    
		      // 创建第一列    
		      HSSFCell cell1 ;//= row2.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));  
		      
		      for(int i=0;i<11;i++){
			    	 
			    	 if(i==1){
			    		 cell1 = row2.createCell(i);
			    		 cell1.setCellValue("REPORT NAME:");
					      cell1.setCellStyle(headstyle); 
					      range = new CellRangeAddress(1, 1, 1, 2); 
					      sheet.addMergedRegion(range);
			    	 }else if(i==3){
			    		 
			    		 cell1=row2.createCell(i);
					      cell1.setCellValue("AD HOC");
					      cell1.setCellStyle(headstyle); 
					      
			    		 
			    	 }else if(i==8){
			    		 
			    		 cell1=row2.createCell(i);
					      cell1.setCellValue("PAGE:");
					      cell1.setCellStyle(runTimeStyle);  
					    
			    		 
			    	 }else if(i==9){
			    		 cell1=row2.createCell(i);
					      cell1.setCellValue("1");
					      cell1.setCellStyle(headstyle);
			    		 
			    	 } else{
			    		 cell1=row2.createCell(i);
					      cell1.setCellStyle(headstyle);
			    		 
			    	 }
			    	 
			     }
		      
		      ////// //创建第3行 
		      HSSFRow row3 = sheet.createRow(2);    
		      // 设置行高    
		      row3.setHeight((short) 500);    
		      // 创建第一列    
		      HSSFCell cell3 ;//= row3.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));   
		      //CellRangeAddress range = new CellRangeAddress(2, 2, 2, 5);  
		      
		      for(int i=0;i<11;i++){
			    	 
			    	 if(i==1){
			    		 cell3 = row3.createCell(i); 
			    		 cell3.setCellValue("PROC UNIT:");
					      cell3.setCellStyle(headstyle); 
					      range = new CellRangeAddress(2, 2, 1, 2); 
					      sheet.addMergedRegion(range);
			    	 }else if(i==3){
			    		 
			    		 cell3=row3.createCell(i);
					      cell3.setCellValue("LCK");
					      cell3.setCellStyle(headstyle);
					      
			    		 
			    	 }else if(i==4){
			    		 
			    		 cell3=row3.createCell(i);
					      cell3.setCellValue("Validation report for cheque payment upload result");
					      cell3.setCellStyle(multiStyleEnd); 
					      range = new CellRangeAddress(2, 2, 4, 6); 
					      sheet.addMergedRegion(range);
					    
			    		 
			    	 } else{
			    		 cell3=row3.createCell(i);
					      cell3.setCellStyle(headstyle);
			    		 
			    	 }
			    	 
			     }
		      

		      /////下面是创建数据部分了
		      
		////// //创建第4行 
		      HSSFRow row4 = sheet.createRow(3);    
		      // 设置行高    
		      row4.setHeight((short) 500);    
		      // 创建第一列    
		      
		      	HSSFCell cell4 = row4.createCell(0);    
			     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
			      cell4.setCellStyle(headstyle); 
			     // cell0.set
			      cell4=row4.createCell(1);
			      cell4.setCellStyle(headstyle); 
		      
		      
		      cell4 = row4.createCell(2);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
		      cell4.setCellValue("SWD PAYMENT DATE");
		      cell4.setCellStyle(headstyleCenter); 
		     // cell0.set
		      cell4=row4.createCell(3);
		      cell4.setCellValue("CASE KEY");
		      cell4.setCellStyle(headstyleCenter); 
		      //2
		      cell4=row4.createCell(4);
		      cell4.setCellValue("CUSTOMER KEY");
		      cell4.setCellStyle(headstyleCenter); 
		      //3
		      cell4=row4.createCell(5);
		      cell4.setCellValue("SEQUENCE NUMBER");
		      cell4.setCellStyle(headstyleCenter); 
		      //4
		      cell4=row4.createCell(6);
		      cell4.setCellValue("PROCESSING UNIT");
		      cell4.setCellStyle(headstyleCenter); 
		      //5
		      cell4=row4.createCell(7);
		      cell4.setCellValue("SCHEME TYPE");
		      cell4.setCellStyle(headstyleCenter); 
		      //6
		      cell4=row4.createCell(8);
		      cell4.setCellValue("SERIAL NUMBER");
		      cell4.setCellStyle(headstyleCenter); 
		      //7
		      cell4=row4.createCell(9);
		      cell4.setCellValue("RESULT");
		      cell4.setCellStyle(headstyleCenter); 
		      //
		      cell4=row4.createCell(10);
		      cell4.setCellStyle(headstyle); 
		      
		      ///这里是循环写入数据
		      
		      for(int i=0;i<2;i++){
		    	  
		    	  HSSFRow rowDB = sheet.createRow(4+i);    
			      // 设置行高    
			      rowDB.setHeight((short) 400);    
		    		  
			   // 创建第一列    
			      HSSFCell cellDB = rowDB.createCell(0); 
			      cellDB.setCellStyle(headstyle); 
			     // cell0.set
			      cellDB=rowDB.createCell(1);
			      cellDB.setCellStyle(headstyle); 
		    		// 创建第一列    
				      cellDB = rowDB.createCell(2); 
				      cellDB.setCellValue("SWwewe DATE");
				      cellDB.setCellStyle(headstyleCenter); 
				     // cell0.set
				      cellDB=rowDB.createCell(3);
				      cellDB.setCellValue("qwqE KEY");
				      cellDB.setCellStyle(headstyleCenter); 
				      //2
				      cellDB=rowDB.createCell(4);
				      cellDB.setCellValue("qweR KEY");
				      cellDB.setCellStyle(headstyleCenter); 
				      //3
				      cellDB=rowDB.createCell(5);
				      cellDB.setCellValue("SEqq NUMBER");
				      cellDB.setCellStyle(headstyleCenter); 
				      //4
				      cellDB=rowDB.createCell(6);
				      cellDB.setCellValue("PRwING UNIT");
				      cellDB.setCellStyle(headstyleCenter); 
				      //5
				      cellDB=rowDB.createCell(7);
				      cellDB.setCellValue("qwePE");
				      cellDB.setCellStyle(headstyleCenter); 
				      //6
				      cellDB=rowDB.createCell(8);
				      cellDB.setCellValue("qweqweER");
				      cellDB.setCellStyle(headstyleCenter); 
				      //7
				      cellDB=rowDB.createCell(9);
				      cellDB.setCellValue("FAIL (duplicated with DB records)");
				      cellDB.setCellStyle(headstyleCenter); 
				      
				      cellDB=rowDB.createCell(10);
				      cellDB.setCellStyle(headstyle); 
		    	  
		      }
		      
		      ////下面的是末尾部分
		      //设置计算总数
		      HSSFRow rowEndH = sheet.createRow(4+2);    
		      // 设置行高    
		      rowEndH.setHeight((short) 400); 
		      HSSFCell cellEndH ;//= rowEndH.createCell(0);
		     for(int i=0;i<11;i++){
		    	 
		    	 if(i==0 || i==1 ||i==10){
		    		 
		    		 cellEndH = rowEndH.createCell(i);
		    		 cellEndH.setCellStyle(headstyle); 
		    		 
		    	 }else if(i==2){
		    		 cellEndH = rowEndH.createCell(i);
		    		 cellEndH.setCellValue("TOTAL NUMBER OF MANUAL CHEQUE PAYMENT CASES:");
				      cellEndH.setCellStyle(styleEnd); 
				      range = new CellRangeAddress(6, 6, 2, 4);    
				      sheet.addMergedRegion(range);
		    	 }else if(i==5){
		    		 
		    		 cellEndH = rowEndH.createCell(i);
				      cellEndH.setCellValue("1111");
				      cellEndH.setCellStyle(styleEnd); 
				      range = new CellRangeAddress(6, 6, 5, 9);    
				      sheet.addMergedRegion(range);
		    		 
		    	 }else{
		    		 
		    		 cellEndH = rowEndH.createCell(i);
				      //cellEndH.setCellValue("1111");
				      cellEndH.setCellStyle(styleEnd); 
		    		 
		    	 }
		    	 
		     }
		      ///设计计算成功的数
		      HSSFRow rowEndS = sheet.createRow(4+3);    
		      // 设置行高    
		      rowEndS.setHeight((short) 400); 
		      //rowEndS.setRowStyle(headstyleCK);
		      HSSFCell cellEndS;// = rowEndS.createCell(0);
		      
		      for(int i=0;i<11;i++){
			    	 
		    	  if(i==0 || i==1 ||i==10){
			    		 
		    		  cellEndS = rowEndS.createCell(i);
					      cellEndS.setCellStyle(headstyle); 
			    		 
			    	 }else if(i==2){
			    		 cellEndS = rowEndS.createCell(i);
			    		 cellEndS.setCellValue("NUMBER OF SUCCESSFUL UPLOAD:");
					      cellEndS.setCellStyle(styleEnd); 
					      range = new CellRangeAddress(7, 7, 2, 4);    
					      sheet.addMergedRegion(range);
			    	 }else if(i==5){
			    		 
			    		  cellEndS = rowEndS.createCell(i);
			 		      cellEndS.setCellValue("13");//count fo success
			 		      cellEndS.setCellStyle(styleEnd); 
			 		      range = new CellRangeAddress(7, 7, 5, 9);    
			 		      sheet.addMergedRegion(range);
			    		 
			    	 }else{
			    		 
			    		  cellEndS = rowEndS.createCell(i);
			 		      cellEndS.setCellStyle(styleEnd);
			    		 
			    	 }
			     }
		      ///设计计算失败的总数
		      HSSFRow rowEndF = sheet.createRow(4+4);    
		      // 设置行高    
		      rowEndF.setHeight((short) 400); 
		      //rowEndF.setRowStyle(headstyleEK);
		      HSSFCell cellEndF ;//= rowEndF.createCell(0);
		      
		      
		      for(int i=0;i<11;i++){
			    	 
		    	  if(i==0 || i==1 ||i==10){
		    		  cellEndF = rowEndF.createCell(i);
				      cellEndF.setCellStyle(headstyle);  
			    		 
			    	 }else if(i==2){
			    		 cellEndF = rowEndF.createCell(i);
			    		 cellEndF.setCellValue("NUMBER OF FAILED UPLOAD:");
					      cellEndF.setCellStyle(styleEnd); 
					      range = new CellRangeAddress(8, 8, 2, 4);    
					      sheet.addMergedRegion(range);    
			    	 }else if(i==5){
			    		 
			    		 cellEndF = rowEndF.createCell(i);
					      cellEndF.setCellValue("23");//count fo success
					      cellEndF.setCellStyle(styleEnd); 
					      range = new CellRangeAddress(8, 8, 5, 9);    
					      sheet.addMergedRegion(range);
			    		 
			    	 }else{
			    		 
			    		 cellEndF = rowEndF.createCell(i);
					      cellEndF.setCellStyle(styleEnd); 
			    		 
			    	 }
			    	 
			     }
		      //		   
		      ///设计末尾
		      HSSFRow rowEnd = sheet.createRow(4+5);    
		      // 设置行高    
		      rowEnd.setHeight((short) 600); 
		      HSSFCell cellEnd = rowEnd.createCell(0);
		      cellEnd.setCellValue("* * * End of Report  * * *");
		      cellEnd.setCellStyle(multiStyleEnd); 
		      range = new CellRangeAddress(9, 9, 0, 10);    
		      sheet.addMergedRegion(range);
    
			workbook.write(fos);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			//throw new ExportException("could not create file \"" + fileUniqueName + "\"", e);
		  } 
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}

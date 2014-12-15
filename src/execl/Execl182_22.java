package execl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFRichTextString;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.util.CellRangeAddress;
//import org.apache.poi.hssf.util.HSSFColor;
public class Execl182_22 {
	


	public static void main(String[] args) {
		
		System.out.println("...........");
		createExeclFile();
		
	}
	
	/////
	
	
	public  static void createExeclFile(){
		
		
		// build Excel work book
		HSSFWorkbook workbook = new HSSFWorkbook();
		// create export file
		String fileUniqueName = "D:/MyExecl22.xls";
		File exportFile = new File(fileUniqueName);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(exportFile);
			
			HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet    
			
			//
			//sheet.createFreezePane(0, 6);//设置分页
		    // 设置列宽    
		    sheet.setColumnWidth(0, 2000);    
		    sheet.setColumnWidth(1, 3300);    
		    sheet.setColumnWidth(2, 4800);    
		    sheet.setColumnWidth(3, 5500);  ////  
		    sheet.setColumnWidth(4, 5500);    
		    sheet.setColumnWidth(5, 4000);    
		    sheet.setColumnWidth(6, 4500);    
		    sheet.setColumnWidth(7, 9000);
		    /*sheet.setColumnWidth(0, 5500);    
		    sheet.setColumnWidth(1, 3300);    
		    sheet.setColumnWidth(2, 4800);    
		    sheet.setColumnWidth(3, 5500);  ////  
		    sheet.setColumnWidth(4, 5500);    
		    sheet.setColumnWidth(5, 4000);    
		    sheet.setColumnWidth(6, 4500);    
		    sheet.setColumnWidth(7, 9000);*/
		   // sheet.setColumnWidth(8, 2500);
			
		 // Sheet样式    
		 /*   HSSFCellStyle sheetStyle = workbook.createCellStyle();    
		    // 背景色的设定    
		    sheetStyle.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);    
		    // 前景色的设定    
		    sheetStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);    
		    // 填充模式    
		    sheetStyle.setFillPattern(HSSFCellStyle.FINE_DOTS);    
		    // 设置列的样式    
		    for (int i = 0; i <= 8; i++) {    
		      sheet.setDefaultColumnStyle((short) i, sheetStyle);    
		    } */  
			
		 // 设置内容的字体    
	/*	    HSSFFont headfont = workbook.createFont();    
		    headfont.setFontName("SansSerif");    
		    headfont.setFontHeightInPoints((short) 10);// 字体大小    
		    //headfont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
    // 另一个样式    
		    HSSFCellStyle headstyle = workbook.createCellStyle();    
		    headstyle.setFont(headfont);    
		    headstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		    headstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    headstyle.setLocked(true);    
		    headstyle.setWrapText(true);// 自动换行    
		    headstyle.setFillBackgroundColor(HSSFColor.RED.index);///////
		    headstyle.setFillForegroundColor(HSSFColor.RED.index);*/
		    
		    
		    //////设置边框样式
		    HSSFFont headfontCK = workbook.createFont();    
		    headfontCK.setFontName("SansSerif");    
		    headfontCK.setFontHeightInPoints((short) 10);// 字体大小    
		    //headfont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
    // 另一个样式    
		    HSSFCellStyle headstyleCK = workbook.createCellStyle();    
		   headstyleCK.setFont(headfontCK);    
		   headstyleCK.setAlignment(HSSFCellStyle.ALIGN_FILL);// 左右居中    
		   headstyleCK.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		   headstyleCK.setLocked(true);    
		   headstyleCK.setWrapText(true);// 自动换行    
		   /*headstyleCK.setFillBackgroundColor(HSSFColor.RED.index);///////
		   headstyleCK.setFillForegroundColor(HSSFColor.RED.index);*/
		   headstyleCK.setBorderTop((short)1);
		   headstyleCK.setBorderLeft((short)1);
		   headstyleCK.setBorderRight((short) 1);
		   headstyleCK.setBorderBottom((short)1);
		   headstyleCK.setBottomBorderColor(HSSFColor.WHITE.index);
		    
		   ///设置末尾的边框
		   //////设置边框样式
		    HSSFFont headfontEK = workbook.createFont();    
		    headfontEK.setFontName("SansSerif");    
		    headfontEK.setFontHeightInPoints((short) 10);// 字体大小    
		    headfontEK.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
   // 另一个样式    
		    HSSFCellStyle headstyleEK = workbook.createCellStyle();    
		   headstyleEK.setFont(headfontEK);    
		   headstyleEK.setAlignment(HSSFCellStyle.ALIGN_FILL);// 左右居中    
		   headstyleEK.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		   headstyleEK.setLocked(true);    
		   headstyleEK.setWrapText(true);// 自动换行    
		   /*headstyleEK.setFillBackgroundColor(HSSFColor.RED.index);///////
		   headstyleEK.setFillForegroundColor(HSSFColor.RED.index);*/
		   headstyleEK.setBorderTop((short)1);
		   headstyleEK.setBorderLeft((short)1);
		   headstyleEK.setBorderRight((short) 1);
		   headstyleEK.setBorderBottom((short)1);
		   
		    
		 // 设置中间标题字体    
		    HSSFFont headfont2 = workbook.createFont();    
		    headfont2.setFontName("SansSerif");    
		    headfont2.setFontHeightInPoints((short) 10);// 字体大小    
		    headfont2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
		    // 另一个样式    
		    HSSFCellStyle headstyle2 = workbook.createCellStyle();    
		    headstyle2.setFont(headfont2);    
		    headstyle2.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		    headstyle2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    headstyle2.setLocked(true);    
		    headstyle2.setWrapText(true);// 自动换行   
		    headstyle2.setBorderTop((short)1);
		    headstyle2.setBorderLeft((short)1);
		    headstyle2.setBorderRight((short) 1);
		    headstyle2.setBorderBottom((short)1);
		    
		    // 设置中间标题字体    
		    //另一个样式    
		    HSSFCellStyle headstyle3 = workbook.createCellStyle();    
		    headstyle3.setFont(headfont2);    
		    headstyle3.setAlignment(HSSFCellStyle.ALIGN_LEFT);// 左右居zuo    ALIGN_LEFT
		    headstyle3.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    headstyle3.setLocked(true);    
		    headstyle3.setWrapText(true);// 自动换行   
	    
		    try {    
		      // 创建第一行    
		      HSSFRow row0 = sheet.createRow(0);    
		      // 设置行高    
		      row0.setHeight((short) 500);  
		      row0.setRowStyle(headstyle2);
		      // 创建第一列    
		      HSSFCell cell0 = row0.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
		      cell0.setCellValue("REPORT ID:");
		      cell0.setCellStyle(headstyle3); 
		   
		     // cell0.set
		      cell0=row0.createCell(1);
		      cell0.setCellValue("SIAB001");
		      //cell0.setCellStyle(headstyle); 
		      row0.setRowStyle(headstyle2);
		      //
		      cell0=row0.createCell(6);
		      cell0.setCellValue("RUN DATE:");
		      cell0.setCellStyle(headstyle3); 
		      //
		      cell0=row0.createCell(7);
		      cell0.setCellValue("2013-11-21  12:00:00");
		      //cell0.setCellStyle(headstyle);
		      
		      //创建第二行 
		   
		      HSSFRow row2 = sheet.createRow(1);    
		      // 设置行高    
		      row2.setHeight((short) 500);    
		      // 创建第一列    
		      HSSFCell cell1 = row2.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
		      cell1.setCellValue("REPORT NAME:");
		      cell1.setCellStyle(headstyle3); 
		     // cell0.set
		      cell1=row2.createCell(1);
		      cell1.setCellValue("AD HOC");
		      //cell1.setCellStyle(headstyle); 
		      
		      //
		      cell1=row2.createCell(6);
		      cell1.setCellValue("PAGE:");
		      cell1.setCellStyle(headstyle3); 
		      //
		      cell1=row2.createCell(7);
		      cell1.setCellValue("1");
		      //cell1.setCellStyle(headstyle);
		      
		      ////// //创建第3行 
		      HSSFRow row3 = sheet.createRow(2);    
		      // 设置行高    
		      row3.setHeight((short) 500);    
		      // 创建第一列    
		      HSSFCell cell3 = row3.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
		      cell3.setCellValue("PROC UNIT:");
		      cell3.setCellStyle(headstyle3); 
		     // cell0.set
		      cell3=row3.createCell(1);
		      cell3.setCellValue("LCK");
		     // cell3.setCellStyle(headstyle); 
		      
		      //
		      cell3=row3.createCell(2);
		      cell3.setCellValue("Validation report for cheque payment upload result");
		      cell3.setCellStyle(headstyle2); 
		     
		      CellRangeAddress range = new CellRangeAddress(2, 2, 2, 5);    
		      sheet.addMergedRegion(range);
		      
		      
		      /////下面是创建数据部分了
		      
		////// //创建第4行 
		      HSSFRow row4 = sheet.createRow(3);    
		      // 设置行高    
		      row4.setHeight((short) 500);    
		      // 创建第一列    
		      HSSFCell cell4 = row4.createCell(0);    
		     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
		      cell4.setCellValue("SWD PAYMENT DATE");
		      cell4.setCellStyle(headstyle2); 
		     // cell0.set
		      cell4=row4.createCell(1);
		      cell4.setCellValue("CASE KEY");
		      cell4.setCellStyle(headstyle2); 
		      //2
		      cell4=row4.createCell(2);
		      cell4.setCellValue("CUSTOMER KEY");
		      cell4.setCellStyle(headstyle2); 
		      //3
		      cell4=row4.createCell(3);
		      cell4.setCellValue("SEQUENCE NUMBER");
		      cell4.setCellStyle(headstyle2); 
		      //4
		      cell4=row4.createCell(4);
		      cell4.setCellValue("PROCESSING UNIT");
		      cell4.setCellStyle(headstyle2); 
		      //5
		      cell4=row4.createCell(5);
		      cell4.setCellValue("SCHEME TYPE");
		      cell4.setCellStyle(headstyle2); 
		      //6
		      cell4=row4.createCell(6);
		      cell4.setCellValue("SERIAL NUMBER");
		      cell4.setCellStyle(headstyle2); 
		      //7
		      cell4=row4.createCell(7);
		      cell4.setCellValue("RESULT");
		      cell4.setCellStyle(headstyle2); 
		      
		      ///这里是循环写入数据
		      
		      for(int i=0;i<2;i++){
		    	  
		    	  HSSFRow rowDB = sheet.createRow(4+i);    
			      // 设置行高    
			      rowDB.setHeight((short) 400);    
		    		  
		    		// 创建第一列    
				      HSSFCell cellDB = rowDB.createCell(0); 
				      cellDB.setCellValue("SWwewe DATE");
				      cellDB.setCellStyle(headstyleCK); 
				     // cell0.set
				      cellDB=rowDB.createCell(1);
				      cellDB.setCellValue("qwqE KEY");
				      cellDB.setCellStyle(headstyleCK); 
				      //2
				      cellDB=rowDB.createCell(2);
				      cellDB.setCellValue("qweR KEY");
				      cellDB.setCellStyle(headstyleCK); 
				      //3
				      cellDB=rowDB.createCell(3);
				      cellDB.setCellValue("SEqq NUMBER");
				      cellDB.setCellStyle(headstyleCK); 
				      //4
				      cellDB=rowDB.createCell(4);
				      cellDB.setCellValue("PRwING UNIT");
				      cellDB.setCellStyle(headstyleCK); 
				      //5
				      cellDB=rowDB.createCell(5);
				      cellDB.setCellValue("qwePE");
				      cellDB.setCellStyle(headstyleCK); 
				      //6
				      cellDB=rowDB.createCell(6);
				      cellDB.setCellValue("qweqweER");
				      cellDB.setCellStyle(headstyleCK); 
				      //7
				      cellDB=rowDB.createCell(7);
				      cellDB.setCellValue("FAIL (duplicated with DB records)");
				      cellDB.setCellStyle(headstyleCK); 
				      
		    	  
		    	  
		      }
		      
		      ////下面的是末尾部分
		      //设置计算总数
		      HSSFRow rowEndH = sheet.createRow(4+2);    
		      // 设置行高    
		      rowEndH.setHeight((short) 400); 
		     // rowEndH.setRowStyle(headstyleEK);
		      HSSFCell cellEndH = rowEndH.createCell(0);
		      cellEndH.setCellValue("TOTAL NUMBER OF MANUAL CHEQUE PAYMENT CASES:");
		      //cellEndH.setCellStyle(headstyleEK); 
		      range = new CellRangeAddress(6, 6, 0, 2);    
		      sheet.addMergedRegion(range);
		      //
		      cellEndH = rowEndH.createCell(3);
		      cellEndH.setCellValue("1111");
		     // cellEndH.setCellStyle(headstyleEK); 
		      range = new CellRangeAddress(6, 6, 3, 7);    
		      sheet.addMergedRegion(range);
		      
		      ///设计计算成功的数
		      HSSFRow rowEndS = sheet.createRow(4+3);    
		      // 设置行高    
		      rowEndS.setHeight((short) 400); 
		     // rowEndS.setRowStyle(headstyleEK);
		      HSSFCell cellEndS = rowEndS.createCell(0);
		      cellEndS.setCellValue("NUMBER OF SUCCESSFUL UPLOAD:");
		      cellEndS.setCellStyle(headstyleEK); 
		      range = new CellRangeAddress(7, 7, 0, 2);    
		      sheet.addMergedRegion(range);
		      //
		      cellEndS = rowEndS.createCell(3);
		      cellEndS.setCellValue("13");//count fo success
		      cellEndS.setCellStyle(headstyleEK); 
		      range = new CellRangeAddress(7, 7, 3, 7);    
		      sheet.addMergedRegion(range);
		      
		      ///设计计算失败的总数
		      HSSFRow rowEndF = sheet.createRow(4+4);    
		      // 设置行高    
		      rowEndF.setHeight((short) 400); 
		      //rowEndF.setRowStyle(headstyleEK);
		      HSSFCell cellEndF = rowEndF.createCell(0);
		      cellEndF.setCellValue("NUMBER OF FAILED UPLOAD:");
		      cellEndF.setCellStyle(headstyleEK); 
		      range = new CellRangeAddress(8, 8, 0, 2);    
		      sheet.addMergedRegion(range);
		      //
		      cellEndF = rowEndF.createCell(3);
		      cellEndF.setCellValue("23");//count fo success
		      cellEndF.setCellStyle(headstyleEK); 
		      range = new CellRangeAddress(8, 8, 3, 7);    
		      sheet.addMergedRegion(range);
		      
		      ///设计末尾
		      HSSFRow rowEnd = sheet.createRow(4+5);    
		      // 设置行高    
		      rowEnd.setHeight((short) 400); 
		      HSSFCell cellEnd = rowEnd.createCell(0);
		      cellEnd.setCellValue("* * * End of Report  * * *");
		      cellEnd.setCellStyle(headstyle2); 
		      range = new CellRangeAddress(9, 9, 0, 7);    
		      sheet.addMergedRegion(range);
		     /* //
		      cellEnd = rowEnd.createCell(4);
		      cellEnd.setCellValue("qewqweqewqe");//count fo success
		      cellEnd.setCellStyle(headstyle3); 
		      range = new CellRangeAddress(8, 8, 4, 7);    
		      sheet.addMergedRegion(range);*/
		      
		      /**  
////		       * 合并单元格  
////		       *    第一个参数：第一个单元格的行数（从0开始）  
////		       *    第二个参数：第二个单元格的行数（从0开始）  
////		       *    第三个参数：第一个单元格的列数（从0开始）  
////		       *    第四个参数：第二个单元格的列数（从0开始）  
////		       */    
//		      CellRangeAddress range = new CellRangeAddress(0, 0, 0, 15);    
//		      sheet.addMergedRegion(range);    
//		      // 创建第二行    
//		      HSSFRow row1 = sheet.createRow(1); 
//		      row1.setHeight((short)500);
//		      HSSFCell cell1 = row1.createCell(0);    
//		      cell1.setCellValue(new HSSFRichTextString("Monthly Report on Number of e-Submissions "));    
//		      cell1.setCellStyle(centerstyle);    
//		      // 合并单元格    
//		      range = new CellRangeAddress(1, 1, 0, 15);    
//		      sheet.addMergedRegion(range);    
//		     
//		      // 第三行    
//		      HSSFRow row2=sheet.createRow(2);
//		      row2.setHeight((short)500);
//		      
//		      // 创建第3列    
//		      HSSFCell cell2 = row2.createCell(0);  
//		      cell2.setCellValue(new HSSFRichTextString("[ Year covered : 1.1.2014 – 31.12.2015 ]"));    
//		      cell2.setCellStyle(centerstyle);
//		      // 合并单元格    
//		      range = new CellRangeAddress(2, 2, 0, 15);    
//		      sheet.addMergedRegion(range); 
//		      
//		      ///第4行 ( for the month of January 2014 )
//		      HSSFRow row3=sheet.createRow(2);
//		      row3.setHeight((short)500);
//		      
//		      // 创建第3列    
//		      HSSFCell cell3 = row3.createCell(0);  
//		      cell3.setCellValue(new HSSFRichTextString("[ Year covered : 1.1.2014 – 31.12.2015 ]"));    
//		      cell3.setCellStyle(centerstyle);
//		      // 合并单元格    
//		      range = new CellRangeAddress(2, 2, 0, 15);    
//		      sheet.addMergedRegion(range); 
//		      
		      
//	         HSSFRow row2 = sheet.createRow(3);    
//		      row2.setHeight((short) 750);    
//		      HSSFCell cell = row2.createCell(0);    
//		      cell.setCellValue(new HSSFRichTextString("责任者"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(1);    
//		      cell.setCellValue(new HSSFRichTextString("成熟度排序"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(2);    
//		      cell.setCellValue(new HSSFRichTextString("事项"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(3);    
//		      cell.setCellValue(new HSSFRichTextString("前次会议要求\n/新项目的项目概要"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(4);    
//		      cell.setCellValue(new HSSFRichTextString("上周工作进展"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(5);    
//		      cell.setCellValue(new HSSFRichTextString("本周工作计划"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(6);    
//		      cell.setCellValue(new HSSFRichTextString("问题和建议"));    
//		      cell.setCellStyle(columnHeadStyle);    
//		      cell = row2.createCell(7);    
//		      cell.setCellValue(new HSSFRichTextString("备 注"));    
//		      cell.setCellStyle(columnHeadStyle);  
//		    
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

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

public class ExeclDemo {

	public static void main(String[] args) {
		
		
		createExeclFile();
		
	}
	
	/////
	
	
	public  static void createExeclFile(){
		
		
		// build Excel work book
		HSSFWorkbook workbook = new HSSFWorkbook();
		// create export file
		String fileUniqueName = "D:/MyExecl.xls";
		File exportFile = new File(fileUniqueName);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(exportFile);
			
			HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet    
			
			//
			sheet.createFreezePane(1, 3);// 冻结    
		    // 设置列宽    
		    sheet.setColumnWidth(0, 1000);    
		    sheet.setColumnWidth(1, 3500);    
		    sheet.setColumnWidth(2, 3500);    
		    sheet.setColumnWidth(3, 6500);    
		    sheet.setColumnWidth(4, 6500);    
		    sheet.setColumnWidth(5, 6500);    
		    sheet.setColumnWidth(6, 6500);    
		    sheet.setColumnWidth(7, 2500);
			
		 // Sheet样式    
		    HSSFCellStyle sheetStyle = workbook.createCellStyle();    
		    // 背景色的设定    
		    sheetStyle.setFillBackgroundColor(HSSFColor.WHITE.index);    
		    // 前景色的设定    
		    sheetStyle.setFillForegroundColor(HSSFColor.WHITE.index);    
		    // 填充模式    
		    sheetStyle.setFillPattern(HSSFCellStyle.FINE_DOTS);    
		    // 设置列的样式    
		    for (int i = 0; i <= 8; i++) {    
		      sheet.setDefaultColumnStyle((short) i, sheetStyle);    
		    }   
			
		 // 设置字体    
		    HSSFFont headfont = workbook.createFont();    
		    headfont.setFontName("黑体");    
		    headfont.setFontHeightInPoints((short) 22);// 字体大小    
		    headfont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
		    // 另一个样式    
		    HSSFCellStyle headstyle = workbook.createCellStyle();    
		    headstyle.setFont(headfont);    
		    headstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		    headstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    headstyle.setLocked(true);    
		    headstyle.setWrapText(true);// 自动换行    
		    // 另一个字体样式    
		    HSSFFont columnHeadFont = workbook.createFont();    
		    columnHeadFont.setFontName("宋体");    
		    columnHeadFont.setFontHeightInPoints((short) 10);    
		    columnHeadFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);    
		    // 列头的样式    
		    HSSFCellStyle columnHeadStyle = workbook.createCellStyle();    
		    columnHeadStyle.setFont(columnHeadFont);    
		    columnHeadStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		    columnHeadStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    columnHeadStyle.setLocked(true);    
		    columnHeadStyle.setWrapText(true); // 自动换行       
		    columnHeadStyle.setLeftBorderColor(HSSFColor.BLACK.index);// 左边框的颜色    
		    columnHeadStyle.setBorderLeft((short) 1);// 边框的大小    
		    columnHeadStyle.setRightBorderColor(HSSFColor.BLACK.index);// 右边框的颜色    
		    columnHeadStyle.setBorderRight((short) 1);// 边框的大小    
		    columnHeadStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体    
		    columnHeadStyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色    
		    // 设置单元格的背景颜色（单元格的样式会覆盖列或行的样式）    
		    columnHeadStyle.setFillForegroundColor(HSSFColor.WHITE.index);    
		    
		    HSSFFont font = workbook.createFont();    
		    font.setFontName("宋体");    
		    font.setFontHeightInPoints((short) 10);    
		    
		    // 普通单元格样式    
		    HSSFCellStyle style = workbook.createCellStyle();    
		    style.setFont(font);    
		    style.setAlignment(HSSFCellStyle.ALIGN_LEFT);// 左右居中    
		    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);// 上下居中    
		    style.setWrapText(true);   // 自动换行     
		    style.setLeftBorderColor(HSSFColor.BLACK.index);  // 左边框的颜色      
		    style.setBorderLeft((short) 1);   // 边框的大小     
		    style.setRightBorderColor(HSSFColor.BLACK.index);    
		    style.setBorderRight((short) 1);    
		    style.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体    
		    style.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色．    
		    style.setFillForegroundColor(HSSFColor.WHITE.index);// 设置单元格的背景颜色．    
		   
		    // 另一个样式    
		    HSSFCellStyle centerstyle = workbook.createCellStyle();    
		    centerstyle.setFont(font);    
		    centerstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
		    centerstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
		    centerstyle.setWrapText(true);    
		    centerstyle.setLeftBorderColor(HSSFColor.BLACK.index); // 左边框的颜色       
		    centerstyle.setBorderLeft((short) 1);    // 边框的大小    
		    centerstyle.setRightBorderColor(HSSFColor.BLACK.index);    
		    centerstyle.setBorderRight((short) 1);    
		    centerstyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体    
		    centerstyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色．    
		    centerstyle.setFillForegroundColor(HSSFColor.WHITE.index);// 设置单元格的背景颜色．    
		    
		    try {    
		      // 创建第一行    
		      HSSFRow row0 = sheet.createRow(0);    
		      // 设置行高    
		      row0.setHeight((short) 900);    
		      // 创建第一列    
		      HSSFCell cell0 = row0.createCell(0);    
		      cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
		      cell0.setCellStyle(headstyle);    
		      /**  
		       * 合并单元格  
		       *    第一个参数：第一个单元格的行数（从0开始）  
		       *    第二个参数：第二个单元格的行数（从0开始）  
		       *    第三个参数：第一个单元格的列数（从0开始）  
		       *    第四个参数：第二个单元格的列数（从0开始）  
		       */    
		      CellRangeAddress range = new CellRangeAddress(0, 0, 0, 7);    
		      sheet.addMergedRegion(range);    
		      // 创建第二行    
		      HSSFRow row1 = sheet.createRow(1);    
		      HSSFCell cell1 = row1.createCell(0);    
		      cell1.setCellValue(new HSSFRichTextString("本次会议时间：2009年8月31日       前次会议时间：2009年8月24日"));    
		      cell1.setCellStyle(centerstyle);    
		      // 合并单元格    
		      range = new CellRangeAddress(1, 2, 0, 7);    
		      sheet.addMergedRegion(range);    
		      // 第三行    
		      HSSFRow row2 = sheet.createRow(3);    
		      row2.setHeight((short) 750);    
		      HSSFCell cell = row2.createCell(0);    
		      cell.setCellValue(new HSSFRichTextString("责任者"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(1);    
		      cell.setCellValue(new HSSFRichTextString("成熟度排序"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(2);    
		      cell.setCellValue(new HSSFRichTextString("事项"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(3);    
		      cell.setCellValue(new HSSFRichTextString("前次会议要求\n/新项目的项目概要"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(4);    
		      cell.setCellValue(new HSSFRichTextString("上周工作进展"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(5);    
		      cell.setCellValue(new HSSFRichTextString("本周工作计划"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(6);    
		      cell.setCellValue(new HSSFRichTextString("问题和建议"));    
		      cell.setCellStyle(columnHeadStyle);    
		      cell = row2.createCell(7);    
		      cell.setCellValue(new HSSFRichTextString("备 注"));    
		      cell.setCellStyle(columnHeadStyle);  
		    
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

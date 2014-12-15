package execl;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;

public class Execl182_33 {

	
	public static void main(String[] args) {
		
		create();
	}
	
	///
	public static  void create(){
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		// create export file
		String fileUniqueName = "D:/MyExecl222.xls";
		File exportFile = new File(fileUniqueName);
		FileOutputStream fos;
		
		try {
			
			
			fos = new FileOutputStream(exportFile);
			
			HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet    
			
			
			///
			 sheet.setColumnWidth(0, 1000);    
			    sheet.setColumnWidth(1, 1000);    
			    sheet.setColumnWidth(2, 2000);    
			    sheet.setColumnWidth(3, 4500);  ////  
			    sheet.setColumnWidth(4, 500);    
			    sheet.setColumnWidth(5, 1000);    
			    sheet.setColumnWidth(6, 3500);    
			    sheet.setColumnWidth(7,3500);
			    
			    ///
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
			    
			   ///lingyige  
			   HSSFCellStyle headstyleH = workbook.createCellStyle();    
			   headstyleH.setFont(headfontCK);    
			   headstyleH.setAlignment(HSSFCellStyle.ALIGN_FILL);// 左右居中    
			   headstyleH.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
			   headstyleH.setLocked(true);    
			   headstyleH.setWrapText(true);// 自动换行    
			   //headstyleH.setBottomBorderColor(HSSFColor.WHITE.index);
			   CellRangeAddress range = new CellRangeAddress(0, 0, 1, 3);    
			      
			   
			   
			    
			    ///
			    
			 // 创建第一行    
			      HSSFRow row0 = sheet.createRow(0);    
			      // 设置行高    
			      row0.setHeight((short) 400);  
			      //row0.setRowStyle(headstyleH);
			      // 创建第一列    
			      HSSFCell cell0 = row0.createCell(0);    
			     // cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));    
			      cell0.setCellStyle(headstyleH); 
			      cell0.setCellValue(new HSSFRichTextString("REPORT ID:"));
			      //sheet.addMergedRegion(range);
			      
			     // cell0.set
			     /* cell0=row0.createCell(1);
			      cell0.setCellValue("SIAB001");
			      cell0.setCellStyle(headstyleH); 
			      row0.setRowStyle(headstyleH);*/
			    
			    
			    
			    workbook.write(fos);
				fos.flush();
				fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}

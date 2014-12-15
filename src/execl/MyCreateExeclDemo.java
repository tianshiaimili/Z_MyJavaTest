package execl;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.CellRangeAddressList;
import org.apache.poi.hssf.util.HSSFColor;

//F:\BUG\373
public class MyCreateExeclDemo {

	public static void main(String[] args) {
		
		createExeclFile();
		
	}
	///
	
	public static void createExeclFile(){
		
		
		HSSFWorkbook workbook=new HSSFWorkbook();
		//
		File file=new File("F:/BUG/373/GenExeclFile.xls");
		FileOutputStream outputStream;
		//
		
		try {
			
			outputStream=new FileOutputStream(file);
			
			HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet    
			//
			sheet.createFreezePane(0, 9);// 设置分页
			
			
			//设置表头的字体和样式。。
			HSSFFont commonHeadFont=workbook.createFont();
			commonHeadFont.setBoldweight((short)1);//
			commonHeadFont.setFontName("Times New Roman");    
			commonHeadFont.setFontHeightInPoints((short) 12);// 字体大小    
			commonHeadFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗    
			//样式
			HSSFCellStyle commonHeadStyle=workbook.createCellStyle();
			commonHeadStyle.setFont(commonHeadFont);    
			commonHeadStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
			commonHeadStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中    
			commonHeadStyle.setLocked(true);    
			commonHeadStyle.setWrapText(true);// 自动换行   
			commonHeadStyle.setLeftBorderColor(HSSFColor.BLACK.index);// 左边框的颜色    
			commonHeadStyle.setBorderLeft((short) 1);// 边框的大小    
			commonHeadStyle.setRightBorderColor(HSSFColor.BLACK.index);// 右边框的颜色    
			commonHeadStyle.setBorderRight((short) 1);// 边框的大小    
			commonHeadStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体    
			commonHeadStyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色    
			//换行
			 CellRangeAddress range ;   
		    
		      
			//创建第一行
			HSSFRow row0=sheet.createRow(0);
			row0.setHeight((short)300);
			HSSFCell cell0=row0.createCell(0);
			
			cell0.setCellValue(new HSSFRichTextString("Electronic Services (ESS)"));
			cell0.setCellStyle(commonHeadStyle);  
			range= new CellRangeAddress(0, 0, 0, 28); 
			sheet.addMergedRegion(range); 
			
			//第二行
			HSSFRow row1=sheet.createRow(1);
			row1.setHeight((short)300);
			HSSFCell cell1=row1.createCell(0);
			
			cell1.setCellValue(new HSSFRichTextString("Monthly Report on Number of e-Submissions"));
			cell1.setCellStyle(commonHeadStyle);  
			range= new CellRangeAddress(1, 1, 0, 28); 
			sheet.addMergedRegion(range); 
			
			//第3行
			HSSFRow row2=sheet.createRow(2);
			row2.setHeight((short)300);
			HSSFCell cell2=row2.createCell(0);
			
			cell2.setCellValue(new HSSFRichTextString("[ Year covered : 1.1.2014 – 31.12.2015 ]"));
			cell2.setCellStyle(commonHeadStyle);  
			range= new CellRangeAddress(2, 2, 0, 28); 
			sheet.addMergedRegion(range); 
			
			//第4行
			HSSFRow row3=sheet.createRow(3);
			row3.setHeight((short)300);
			HSSFCell cell3=row3.createCell(0);
			
			//cell3.setCellValue(new HSSFRichTextString("( for the month of January 2014 )"));
			cell3.setCellValue("( for the month of January 2014 )");
			cell3.setCellStyle(commonHeadStyle);  
			range= new CellRangeAddress(3, 3, 0, 28); 
			sheet.addMergedRegion(range); 
			
			//第5行
			HSSFRow row4=sheet.createRow(4);
			row4.setHeight((short)300);
			HSSFCell cell4=row4.createCell(0);
			
			cell4.setCellValue(String.format("%s", new SimpleDateFormat("yyyy-MM-dd ").format(new java.util.Date())));
			cell4.setCellStyle(commonHeadStyle);  
			range= new CellRangeAddress(4, 4, 0, 28); 
			sheet.addMergedRegion(range);
			
			///下面开始写中间部分
			//sheet.createFreezePane(0, 6);// 设置分页
			//sheet.createSplitPane(xSplitPos, ySplitPos, leftmostColumn, topRow, activePane)
			
			//HSSFSheet sheet2=workbook.createSheet();
			//sheet2.createFreezePane(1, 9);
			
			//sheet.createSplitPane(2000, 2000, 0, 0, HSSFSheet.PANE_LOWER_LEFT);
			//6 hang
			HSSFRow row5=sheet.createRow(4);
			row5.setHeight((short)300);
			HSSFCell cell5=row5.createCell(0);
			
			cell5.setCellValue(new HSSFRichTextString("District"));
			cell5.setCellStyle(commonHeadStyle);  
			range= new CellRangeAddress(6, 8, 0, 3); 
			sheet.addMergedRegion(range);
			
			
			
			////写出文件
			workbook.write(outputStream);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

package execl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class MergCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("new sheet");
		HSSFRow row = sheet.createRow((short) 1);
		HSSFCell cell = row.createCell(1);
		cell.setCellValue("This is a test of merging");

		for (int i = 0; i < 10; i++) {
			//sheet.addMergedRegion(new Region(i, (short) 1, i, (short) 2));
			sheet.addMergedRegion(new CellRangeAddress(2, 2, 2, 5));
		}
		HSSFSheet sheet1 = wb.createSheet("row sheet");
		sheet1.setSelected(true);

		// Write the output to a file
		try {
			FileOutputStream fileOut = new FileOutputStream("workbook.xls");
			wb.write(fileOut);
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
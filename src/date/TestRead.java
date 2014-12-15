package date;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * 测试poi读取excel文件内容
 * @author lihui
 *
 */
public class TestRead {

        /**
         * @param args
         */
        public static void main(String[] args){

        	read();
                /*HSSFWorkbook wb = null;
                POIFSFileSystem fs = null;
                try {
                        //设置要读取的文件路径
                        fs = new POIFSFileSystem(new FileInputStream("F:/csss/prd/report/lr/LR_IMP_2013.8.15.xls"));
                        //HSSFWorkbook相当于一个excel文件，HSSFWorkbook是解析excel2007之前的版本（xls）
                        //之后版本使用XSSFWorkbook（xlsx）
                        wb = new HSSFWorkbook(fs);
                        //获得sheet工作簿
                        HSSFSheet sheet = wb.getSheetAt(0);
                        //获得行
                        HSSFRow row = sheet.getRow(3);
                        //获得行中的列，即单元格
                        HSSFCell cell = row.getCell(0);
                        //获得单元格中的值，这里该单元格的值为数字，所以使用getNumericCellValue，如为字符串则会报错
                        //如何取别的值，见print2方法
                        double msg = cell.getNumericCellValue();
                        System.out.println("====="+msg);
                        print1();
                        print2();
                } catch (Exception e) {
                        e.printStackTrace();
                }*/
        }

        public static void print1() throws Exception {
                InputStream is = new FileInputStream("d:\\book1.xls");
                HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(is));
                //A text extractor for Excel files.
                //Returns the textual content of the file, suitable for indexing by something like Lucene,
                //but not really intended for display to the user.
                //用来获得整个excel文件的内容，表示为字符串
                ExcelExtractor extractor = new ExcelExtractor(wb);
                //字符串所包含的类型，详见api
                extractor.setIncludeSheetNames(true);
                extractor.setFormulasNotResults(false);
                extractor.setIncludeCellComments(true);
                //获得字符串形式
                String text = extractor.getText();
                System.out.println(text);
        }

        public static void print2() throws Exception {
                HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(
                                "d:\\book1.xls"));
                HSSFSheet sheet = wb.getSheetAt(0);
                //迭代行
                for (Iterator<Row> iter = (Iterator<Row>) sheet.rowIterator(); iter
                                .hasNext();) {
                        Row row = iter.next();
                        //迭代列
                        for (Iterator<Cell> iter2 = (Iterator<Cell>) row.cellIterator(); iter2
                                        .hasNext();) {
                                Cell cell = iter2.next();
                                //用于测试的文件就2列，第一列为数字，第二列为字符串
                                //对于数字cell.getCellType的值为HSSFCell.CELL_TYPE_NUMERIC，为0
                                //对于字符串cell.getCellType的值为HSSFCell.CELL_TYPE_STRING，为1
                                //完整的类型列表请查看api
                                String content = cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC?cell.getNumericCellValue()+"":cell.getStringCellValue();
                                System.out.println(content);
                        }
                }
        }
///////////////////////////////////////////
        public static void read(){  
  		  try {
  		   POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("F:/csss/prd/report/lr/LR_IMP_20130816.xls"));
  		     // 创建工作簿
  		     HSSFWorkbook workBook;
  		   workBook = new HSSFWorkbook(fs);
  		   //获得Excel中工作表个数
  		     System.out.println("工作表个数 :"+workBook.getNumberOfSheets());
  		     for (int i = 0; i < workBook.getNumberOfSheets(); i++) {
  		     System.out.println(" ***************工作表名称："+workBook.getSheetName(i)+"  ************");
  		     // 创建工作表
  		     HSSFSheet sheet = workBook.getSheetAt(i);
  		     // 获得行数
  		     int rows = sheet.getPhysicalNumberOfRows();
  		     if (rows > 0) {
  		        sheet.getMargin(HSSFSheet.TopMargin);
  		        for (int j = 0; j < rows; j++) {
  		         // 行循环
  		         HSSFRow row = sheet.getRow(j);
  		         if (row != null) {
  		          int cells = row.getLastCellNum();
  		          //获得列数
  		          for (short k = 0; k < cells; k++) {
  		           // 列循环
  		           HSSFCell cell = row.getCell(k);
  		             if (cell != null) {
  		              String value = "";
  		              switch (cell.getCellType()) {
  		               case HSSFCell.CELL_TYPE_NUMERIC: // 数值型                                       
  		                if (HSSFDateUtil.isCellDateFormatted(cell)) {
  		                 //如果是date类型则 ，获取该cell的date值                                 
  		                value = HSSFDateUtil.getJavaDate(cell.getNumericCellValue()).toString();
  		                 System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                }else{//纯数字 
  		                 value = String.valueOf((int)cell.getNumericCellValue());
  		                 System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                }
  		                break;
  		                
  		               case HSSFCell.CELL_TYPE_STRING: // 字符串型
  		                value = cell.getRichStringCellValue().toString();
  		                System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                break;
  		               case HSSFCell.CELL_TYPE_FORMULA://公式型
  		                //读公式计算值
  		                value = String.valueOf(cell.getNumericCellValue());
  		                if(value.equals("NaN")){//如果获取的数据值为非法值,则转换为获取字符串   
  		                 value = cell.getRichStringCellValue().toString();
  		                }
  		                //cell.getCellFormula();读公式
  		                System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                break;
  		               case HSSFCell.CELL_TYPE_BOOLEAN://布尔
  		                value = " "+ cell.getBooleanCellValue();
  		                System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                break;
  		               
  		               case HSSFCell.CELL_TYPE_BLANK: // 空值
  		                value = "";
  		                System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                break;
  		               case HSSFCell.CELL_TYPE_ERROR: // 故障                                    
  		                value = "";
  		                System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		                break;
  		               default:
  		                value = cell.getRichStringCellValue().toString();
  		                System.out.println("第"+j+"行,第"+k+"列值："+value+"<br>");
  		              }
  		             }
  		          }
  		         }
  		        }
  		     }
  		     }
  		  } catch (Exception e) {
  		   e.printStackTrace();
  		  }
  		 }
  	
}
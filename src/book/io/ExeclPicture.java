package book.io;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExeclPicture {
	HSSFWorkbook workbook=new HSSFWorkbook();
	HSSFSheet sheet=null;
	HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
	//图片是从数据库中blob字段中取出的。调用下面方法完成向sheet中插入图片。
	//
	/**
	 * 插入某个图片到指定索引的位置
	 * @param HSSFWorkbook wb; Workbook对象
	 * @param int sheetIndex; 插入图片的sheet下标索引
	 * @param byte[] data; 图片字节流
	 * @param int startRow; 起始行
	 * @param int startColumn; 起始列
	 * @param int upRow; 截至行
	 * @param int upColumn; 截至列
	 * @param int index; 内缩进像素数
	 */
	public static void insertImage(HSSFWorkbook wb,HSSFPatriarch patriarch,Blob blob,int startRow,int startColumn,int upRow,int upColumn,int index){
	int dx1=0,dy1=0,dx2=0,dy2=0;
	if(index!=0){
	dx1 = index*16;
	dy1 = index*16;
	dx2 = 1024-index*16;
	dy2 = 256-index*16;
	upRow = upRow-1;
	upColumn = upColumn -1;
	}
	
    HSSFClientAnchor anchor = new HSSFClientAnchor(dx1,dy1,dx2,dy2,(short)startColumn,startRow,(short)upColumn,upRow);
    anchor.setAnchorType(2);
    patriarch.createPicture(anchor , wb.addPicture(getImageData(blob, "JPEG"),HSSFWorkbook.PICTURE_TYPE_JPEG));
	
}
	
	//从图片里面得到字节数组
	public static  byte[] getImageData(Blob blob,String imageType){
	        try{
	        	BufferedImage bi=ImageIO.read(blob.getBinaryStream());
	             ByteArrayOutputStream bout=new ByteArrayOutputStream();
	             ImageIO.write(bi,imageType,bout);
	            return bout.toByteArray();
	         }catch(Exception exe){
	             exe.printStackTrace();
	            return null;
	         }
	     }
	
	////
	public static void  xxxx(){
		
//		 response.reset();
//		  response.setContentType("application/vnd.ms-excel");
//		  ServletContext context = this.getServlet().getServletContext();
		  try {
		   String path = "D://execl1.xls";//context.getRealPath("/reports/hab/apsfa/PicStat.xls");//导出的Excel文件在服务器上的输出路径
		   java.io.File reportFile1 =
		    new File(/*context.getRealPath("/reports/hab/apsfa/statPic.xls")*/"D://execl2.xls");//此Excel文件是服务器上的，一个包含一张统计图片的Excel模板
		   java.io.FileInputStream fos = new FileInputStream(reportFile1);//文件输入流
		   java.io.FileOutputStream os = new FileOutputStream(path);//文件输出流

		   String barName = "D://pie.jpg";//FileHelper.getUploadDir() + "/" + "collentResult2.jpg";//要导出到Excel文件中的图片路径

		   org.apache.poi.poifs.filesystem.POIFSFileSystem fs = new POIFSFileSystem(fos);
		   org.apache.poi.hssf.usermodel.HSSFWorkbook wb = new HSSFWorkbook(fs);
		   org.apache.poi.hssf.usermodel.HSSFSheet sheet = wb.getSheetAt(0);//Excel文件中的第一个工作表
		   org.apache.poi.hssf.usermodel.HSSFPatriarch patriarch = sheet.createDrawingPatriarch();///
		   org.apache.poi.hssf.usermodel.HSSFClientAnchor anchor =
			   new HSSFClientAnchor(0,0,350,100,(short) 0,1,(short) 10,10);

//		   HkSfaStatBC bc = new HkSfaStatBCImpl();//后台实现类 --结果统计
//		   HkSfaActivityBC abc = new HkSfaActivityBCImpl();//后台实现类 --审计活动
//		   String activitypk = request.getParameter("activitypk");//活动PK
//		   List childGroups = abc.getChildgroup(activitypk);//得到此活动的所有小组
//
//		   double[][] data = bc.problemCollect(activitypk);//得到统计结果，一个二维数组

		   org.apache.poi.hssf.usermodel.HSSFRow row = sheet.createRow(11);//在第一个工作表中创建一行（第12行）
//		   for (int k = 0; k < childGroups.size(); k++) {
//		    ApSfaGroupactivity activityGroup =(ApSfaGroupactivity) childGroups.get(k);//ApSfaGroupactivity为活动小组的Pojo
//		    org.apache.poi.hssf.usermodel.HSSFCell cell = row.createCell((short) (k + 1));//在row中创建单元格
//		    cell.setEncoding(HSSFCell.ENCODING_UTF_16);//设置编码
//		    cell.setCellValue(activityGroup.getName());//给单元格设置值
//		   }

		   /* 同前一个循环，给Excel添加数据 */
		   String[] strs ={ "不适用", "符合", "整改关闭", "不符合", "未检查", "检查数量", "已选择总数" };
//		   for (int i = 12; i < strs.length + 12; i++) {
//		    org.apache.poi.hssf.usermodel.HSSFRow row1 = sheet.createRow(i);
//		    for (int j = 0; j < data[0].length + 1; j++) {
//		     org.apache.poi.hssf.usermodel.HSSFCell cell = row1.createCell((short) j);
//		     cell.setEncoding(HSSFCell.ENCODING_UTF_16);
//		     if (j == 0) {
//		      cell.setCellValue(strs[i - 12]);
//		     } else {
//		      int a = (int) data[i - 12][j - 1];
//		      cell.setCellValue(a);
//		     }
//		    }
//		   }

		   java.io.File jpgfile = new File(barName);//barName 为统计图片在服务器上的路径
		   ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();//字节输出流，用来写二进制文件
		   java.awt.image.BufferedImage bufferImg = ImageIO.read(jpgfile);
		   javax.imageio.ImageIO.write(bufferImg, "jpg", byteArrayOut);

		   patriarch.createPicture(anchor,wb.addPicture(
		     byteArrayOut.toByteArray(),HSSFWorkbook.PICTURE_TYPE_JPEG));//将统计图片添加到Excel文件中
		   wb.write(os);
		   os.close();
		   fos.close();
		  // net.sf.excelutils.ExcelUtils.addValue("actionServlet", this);
//		   String config = null;
//
//		   config = "/reports/hab/apsfa/PicStat.xls";
		   //response.setHeader("Content-Disposition","attachment; filename=/"" + "PicStat.xls/"");
		  // net.sf.excelutils.ExcelUtils.export(getServlet().getServletContext(),config,response.getOutputStream());
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		//  return null;
		 }
		
	///
	public static void main(String[] args) {
		
		xxxx();
		System.out.println("...........");
		
	}
	
	}
	


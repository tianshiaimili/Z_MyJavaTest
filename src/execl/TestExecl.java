package execl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRAbstractExporter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;

public class TestExecl {
	public static void main(String[] args) {
		File reportFile = new File("D:\\report2.jrxml");
		Map parameters = new HashMap();
		Connection conn = null;
		FileOutputStream output = null;
		try {
			/*String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/cetvoss";
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "cetvoss", "cetvoss");*/
			Map parameter = new HashMap();
			
			 JasperReport jasperReport= (JasperReport)JRLoader.loadObject(reportFile.getPath());
			
			JasperPrint report = null;
			report = JasperFillManager.fillReport(reportFile.getPath(),
					parameter);
			JRAbstractExporter exporter = new JExcelApiExporter();
			output = new FileOutputStream("D:\\excel.xls");
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, report);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, output);
			exporter.exportReport();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
	
	
	///////
	
	/**
	02
	     * 导出为excel文件
	03
	     * @param request
	04
	     * @param response
	05
	     */
	
	 private void exportExcel(/* HttpServletResponse response,Connection conn*/){
	
		 FileOutputStream output = null;
		 Map parameters = new HashMap();
		 
	     try {
	
	        // response.setCharacterEncoding("UTF-8"); 
	
	       //  ServletContext servletContext=this.getServletConfig().getServletContext();
	
	         
	         output = new FileOutputStream("D:\\excel.xls");
	         //得到jasper文件
	
	         File jasperFile=new File("D:\\report2.jrxml");
	
	         JasperReport jasperReport= (JasperReport)JRLoader.loadObject(jasperFile.getPath());
	
	         JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,parameters);
	        // JasperPrint jasperPrint=JasperCompileManager.compileReport("reports/Location.jrxml");
	         //
	         JRXlsExporter exporter=new JRXlsExporter();
	         
	         exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT, jasperPrint);
	
	         exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, output);
	
	         exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE);
	
	         exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);
	
	
//	
//	         response.setHeader("Content-Disposition", "attachment;filename=first.xls");
//	
//	         response.setContentType("application/vnd_ms-excel");
	
	         exporter.exportReport();
	
	     } catch (JRException e) {
	
	         e.printStackTrace();
	
	     } catch (IOException e){
	
	         e.printStackTrace();
	
	     }
	
	    }

	
	
	
}
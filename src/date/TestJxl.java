package date;

import java.io.OutputStream;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import jxl.Workbook;
//import jxl.write.Label;
//import jxl.write.WritableCellFormat;
//import jxl.write.WritableFont;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;
//
//public class TestJxl {
//
//public void createReport(HttpServletRequest request,
//HttpServletResponse response) {
//String page_name = "测试Exl";
//
//response.reset();
//response.setContentType("APPLICATION/OCTET-STREAM");
//response.setHeader("Content-disposition", "attachment;filename=\""
//+ page_name + "Report.xls\"");
//
//try {
//
//OutputStream os = response.getOutputStream();
//WritableWorkbook wwb = Workbook.createWorkbook(os);
//WritableSheet ws = wwb.createSheet("用户表", 0);
//// 设置 结算报表 标题 字体
//jxl.write.WritableFont font_title = new jxl.write.WritableFont(
//WritableFont.ARIAL, 14, WritableFont.BOLD, false);
//// 设置结算报表 标题 格式
//jxl.write.WritableCellFormat format_title = new jxl.write.WritableCellFormat(
//font_title);
//// 设置结算报表 第一行 字体
//jxl.write.WritableFont font_caption = new jxl.write.WritableFont(
//WritableFont.ARIAL, 12, WritableFont.BOLD, false);
//// 设置结算报表 第一行 格式
//jxl.write.WritableCellFormat format_caption = new jxl.write.WritableCellFormat(
//font_caption);
//// 设置结算报表 其他内容 字体
//jxl.write.WritableFont font_content = new jxl.write.WritableFont(
//WritableFont.ARIAL, 11, WritableFont.NO_BOLD, false);
//// 设置结算报表 其他内容 格式
//jxl.write.WritableCellFormat format_content = new jxl.write.WritableCellFormat(
//font_content);
//
//jxl.write.WritableFont font_total = new jxl.write.WritableFont(
//WritableFont.ARIAL, 11, WritableFont.BOLD, false);
//jxl.write.WritableCellFormat format_total = new jxl.write.WritableCellFormat(
//font_total);
//
//jxl.write.Label label;
//
//String label_title = "用户表";
//jxl.write.Label title = new jxl.write.Label(1, 0, label_title,
//format_title);
//ws.addCell(title);
//
//label = new jxl.write.Label(1, 4, "用户ID", format_caption);
//ws.addCell(label);
//label = new jxl.write.Label(2, 4, "用户名称", format_caption);
//ws.addCell(label);
//label = new jxl.write.Label(3, 4, "用户密码", format_caption);
//ws.addCell(label);
//label = new jxl.write.Label(4, 4, "用户性别", format_caption);
//ws.addCell(label);
//
//// 得到结果
//List rs_result = new ArrayList();
//
//addCell(format_content, ws, rs_result);
//wwb.write();
//wwb.close();
//} catch (Exception e) {
//} 
//finally {
//try {
//response.getOutputStream().close();
//} catch (Exception e) {
//}
//}
//}
//
//public void addCell(WritableCellFormat format_content, WritableSheet ws, List result) {
//
//if (result == null || result.size() == 0) {
//return;
//}
//
//try {
//for (int i = 0; i < result.size(); i++) {
//jxl.write.Label l;
//if (i != result.size() - 1) {
//l = new Label(0, i + 5, "" + (i + 1));
//ws.addCell(l);
//}
//l = new jxl.write.Label(1, i + 5, ((User) result.get(i))
//.getUserId(), format_content);
//ws.addCell(l);
//l = new jxl.write.Label(2, i + 5, ((User) result.get(i))
//.getUserName(), format_content);
//ws.addCell(l);
//l = new jxl.write.Label(3, i + 5, ((User) result.get(i))
//.getPassWord(), format_content);
//ws.addCell(l);
//l = new jxl.write.Label(4, i + 5, ((User) result.get(i))
//.getSex(), format_content);
//ws.addCell(l);
//
//}
//} catch (WriteException ex) {
//}
//}
//}
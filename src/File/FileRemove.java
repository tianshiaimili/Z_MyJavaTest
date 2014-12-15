package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRemove {

	public static void main(String[] args) {

		 removeFile("F:\\CIS\\ToCIS\\CSSS_officer.2012", "F:\\CIS\\ToCIS\\backups\\");

		System.out.println("...........");

		//copyFile("D:\\MyExecl2.zip", "D:\\testRemove2\\MyExecl2.zip");

	}

	// 把文件从一个文件夹移动到另一个文件夹
	public static void removeFile(String fromFolder, String toFolder) {

		File fold = new File(fromFolder);
		String strNewPath = toFolder;
		File fnewpath = new File(strNewPath);

		if (!fnewpath.exists())
			fnewpath.mkdirs();

		File fnew = new File(strNewPath + fold.getName());

		if (fnew.exists()) {

			fnew.delete();
			System.out.println("delete.....");
		}
		//
		copyFile(fromFolder, toFolder + fnew.getName());

		// fold.renameTo(fnew);
		System.out.println("...........");

	}

	// /赋值文件
	public static void copyFile(String fromFolder, String toFolder) {

		File file = new File(fromFolder);
		File file2 = new File(toFolder);
		FileInputStream in = null;
		FileOutputStream out = null;
		int t = 0;
		byte[] bb = new byte[1024];
		try {
			in = new FileInputStream(file);
			out = new FileOutputStream(file2);
			//
			while ((t = in.read(bb)) != -1) {

				out.write(bb,0,t);

			}
			out.flush();
			System.out.println("...");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				if (out != null) {

					out.close();
				}
				if (in != null) {

					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	//
	public static void copy2() {
		FileInputStream m = null;
		BufferedInputStream n = null;
		FileOutputStream s = null;
		BufferedOutputStream j = null;
		try {
			m = new FileInputStream("D:\\MyExecl2.zip");// 原文件的路径
			n = new BufferedInputStream(m);
			s = new FileOutputStream("c:\\舒畅美图.jpg");// 准备把原文件复制到的路径
			j = new BufferedOutputStream(s);
			byte[] str = new byte[5000];
			while (n.read(str) != -1) {
				j.write(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				j.close();
				s.close();
				n.close();
				m.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

package date;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class classA {
	
	
 public static List recursion(String root, List<String> vecFile) {
  File file = new File(root);
  File[] subFile = file.listFiles();
  List vector=vecFile;
  
  for (int i = 0; i < subFile.length; i++) {
   if (subFile[i].isDirectory()) {
    recursion(subFile[i].getAbsolutePath(), vecFile);
   } else {
    String filename = subFile[i].getName();
    vector.add(filename);
   }
  }
  return  vector;
 }

 public static void main(String[] args) {
 // Vector<String> vecFile = new Vector<String>();
	 List<String> vecFile = new ArrayList<String>();
//System.out.println(  recursion("F:/csss/prd/report", vecFile).get(2)+"=========");
  vecFile=recursion("F:/csss/prd/report", vecFile);
  for (String fileName : vecFile) {
   System.out.println(fileName);
  }
  
  System.out.println("------------------");
  
  //System.out.println(vecFile.get(3));
  
  
  
 }
} 
package ZhengZe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestZhengZe {

	
	///
	public static Scanner getScanner(String str, String delimiter){
		Scanner sc = new Scanner(str);
		sc.useDelimiter(delimiter);		
		return sc;
	}
	////
	public static List<String> sscanf(String str, String delimiter){
		List<String> strs = new ArrayList<String>();
		Scanner sc = getScanner(str, delimiter);
		while(sc.hasNext()){
			strs.add(sc.next());
		}
		return strs;
	}
	///
	public static List<String> sscanf(String str){
		return sscanf(str, "\\s+");
	}	
	///
	public static void main(String[] args) {
		
		
		List<String> list=sscanf("2013-10-20 45678");
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i).toString());
			
		}
		
	}
}

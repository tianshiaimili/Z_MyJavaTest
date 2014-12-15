package string;

import date.classA;
import org.apache.commons.lang.CharUtils;
public class NullTest {

	public static void main(String[] args) {
		
		String oo=1+"";
		nullClass ll=new nullClass();
		
		String p2=ll.getPp();
		char cc=(CharUtils.toChar(p2,' '));
		System.out.println("---"+p2.trim()+"  - -  "+oo);
		
		
	}
	

	
}

class nullClass{
	
	String pp=null;

	public String getPp() {
		return pp;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}
	
}
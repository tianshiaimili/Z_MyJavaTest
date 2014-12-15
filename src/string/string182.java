package string;

public class string182 {

	public static void main(String[] args) {
		
		String xxx="/batch/csss/ecp/spl/mnlcq/mnlin2010_round0.csv";
		
		//
		boolean cc=xxx.endsWith("/");
		
		int aa=xxx.lastIndexOf("/");
		
		String vv=xxx.substring(0, aa+1);
		
		System.out.println(vv);
		
	}
	
}

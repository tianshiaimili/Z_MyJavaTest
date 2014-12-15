package date;

public class ContiuneDemo {

	public static void main(String[] args) {
		
		int a=0;
		
		for(int i=1;i<10;i++){
			
			a++;
			System.out.println("i===="+i);
			
			if(a==3){
				System.out.println("a===="+3+"  fanhui "+"此时 i==="+i);
				continue;
				
			}
			
			System.out.println("a=="+a+ "  a !=3 继续运行" +"此时 i==="+i);
			
			
		}
		
		
	}
	
}

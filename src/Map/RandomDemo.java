package Map;

public class RandomDemo {

	public static void main(String[] args) {
		
		randomIntarray();
	
	}
	
	public static void randomIntarray(){
		
		Long a=(long) 0;
		int b=a.intValue();
		
		
		int[] arr = new int[10];  
		 
		
		
        for (int i = 0; i < 10; i++)  
        {  
            arr[i] = (int) (Math.random() * 20) +1;  
            for (int j = 0; j < i; j++)  
            {  
                if (arr[j] == arr[i])  
                {  
                    i--;  
                    break;  
                }  
            }  
        }  
        for (int i = 0; i < 10; i++)  
            System.out.print(arr[i] + " "); 
		
		
	}
		
	}
	


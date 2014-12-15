package Map;

import java.lang.Thread.State;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapKeySetTest {

	public static void main(String[] args) {
		
		long start ;
		long end;
		
		Map<String , Person> map = new HashMap<String, Person>();
		
		for(int i = 1;i<500000;i++){
			
			Person person = new Person("map"+i, "10"+i);
			map.put("key"+i, person);
			
		}
		
		//////////////////更快点
		start = System.currentTimeMillis();
		for (Iterator iter = map.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			Person values =  map.get(name);
			String tempName =  values.getName();
//			System.out.println("tempName== "+tempName);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("//////////////////////////////n time = "+(end - start));
		
		
		start = System.currentTimeMillis();
		for(int i = 0;i<map.size();i++){
			
			Person person = map.get("map"+i);
//			System.out.println("age  == "+person.getAge());
		}
		
		end = System.currentTimeMillis();
		System.out.println("***********************************//n time2 = "+(end - start));
	}
	
	
}


 class Person {

	 String name ;
	 String age;
	 
	 
	public Person() {
		super();
	}


	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
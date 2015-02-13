package jackson_test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class JacksonTest {
	   private JsonGenerator jsonGenerator = null;
	    private ObjectMapper objectMapper = null;
	    private AccountBean bean = null;
	    
	    
	    public JacksonTest(){
	    	
	    	init();
	    	
	    }
	    
//	    @Before
	    public void init() {
	        bean = new AccountBean();
	        bean.setAddress("china-Guangzhou");
	        bean.setEmail("hoojo_@126.com");
	        bean.setId(1);
	        bean.setName("hoojo");
	        
	        objectMapper = new ObjectMapper();
	        try {
	            jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
//	    @After
	    public void destory() {
	        try {
	            if (jsonGenerator != null) {
	                jsonGenerator.flush();
	            }
	            if (!jsonGenerator.isClosed()) {
	                jsonGenerator.close();
	            }
	            jsonGenerator = null;
	            objectMapper = null;
	            bean = null;
	            System.gc();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    /**
	     * <b>function:</b>将java对象转换成json字符串
	     * @author hoojo
	     * @createDate 2010-11-23 下午06:01:10
	     */
	    public void writeEntityJSON() {
	        
	        try {
	            System.out.println("jsonGenerator");
	            //writeObject可以转换java对象，eg:JavaBean/Map/List/Array等
	            jsonGenerator.writeObject(bean);    
	            System.out.println();
	            
	            System.out.println("ObjectMapper");
	            //writeValue具有和writeObject相同的功能
	            objectMapper.writeValue(System.out, bean);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    /**
	     * <b>function:</b>将map转换成json字符串
	     * @author hoojo
	     * @createDate 2010-11-23 下午06:05:26
	     */
//	    @Test
	    public void writeMapJSON() {
	        try {
	            Map<String, Object> map = new HashMap<String, Object>();
	            map.put("name", bean.getName());
	            map.put("account", bean);
	            bean = new AccountBean();
	            bean.setAddress("china-Beijin");
	            bean.setEmail("hoojo@qq.com");
	            map.put("account2", bean);
	            
	            System.out.println("jsonGenerator");
	            
	            //打印如下 {"account2":{"id":0,"name":null,"email":"hoojo@qq.com","address":"china-Beijin","birthday":null},"name":"hoojo","account":{"id":1,"name":"hoojo","email":"hoojo_@126.com","address":"china-Guangzhou","birthday":null}}

	            jsonGenerator.writeObject(map);
	            System.out.println("");
	            
	            System.out.println("objectMapper");
	            objectMapper.writeValue(System.out, map);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    /**
	     * <b>function:</b>将list集合转换成json字符串
	     * @author hoojo
	     * @createDate 2010-11-23 下午06:05:59
	     */
//	    @Test
	    public void writeListJSON() {
	        try {
	            List<AccountBean> list = new ArrayList<AccountBean>();
	            list.add(bean);
	            
	            bean = new AccountBean();
	            bean.setId(2);
	            bean.setAddress("address2");
	            bean.setEmail("email2");
	            bean.setName("haha2");
	            list.add(bean);
	            
	            System.out.println("jsonGenerator");
	            //list转换成JSON字符串
	            jsonGenerator.writeObject(list);
	            System.out.println();
	            System.out.println("ObjectMapper");
	            //用objectMapper直接返回list转换成的JSON字符串
	            System.out.println("1###" + objectMapper.writeValueAsString(list));
	            System.out.print("2###");
	            //objectMapper list转换成JSON字符串
	            objectMapper.writeValue(System.out, list);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    /**
	     * <b>function:</b>将Array集合转换成json字符串
	     * @author hoojo
	     * @createDate 2010-11-23 下午06:05:59
	     */
//	    @Test
	    public void writeArrayJSON() {
	        try {
//	            List<AccountBean> list = new ArrayList<AccountBean>();
	            AccountBean[] array = new AccountBean[10];
//	            list.add(bean);
	            array[0] = bean;
	            
	            bean = new AccountBean();
	            bean.setId(2);
	            bean.setAddress("address2");
	            bean.setEmail("email2");
	            bean.setName("haha2");
//	            list.add(bean);
	            array[1] = bean;
	            
	            System.out.println("jsonGenerator");
	            //list转换成JSON字符串
	            jsonGenerator.writeObject(array);
	            System.out.println();
	            System.out.println("ObjectMapper");
	            //用objectMapper直接返回list转换成的JSON字符串
	            System.out.println("1###" + objectMapper.writeValueAsString(array));
	            System.out.print("2###");
	            //objectMapper list转换成JSON字符串
	            objectMapper.writeValue(System.out, array);
	        } catch (IOException e) {
	        	System.out.println("error = "+e.getMessage());
	            e.printStackTrace();
	        }
	    }
	    
	    

	    /***
	     * jackson的一些其他用法
	     */
	    public void writeOthersJSON() {
	        try {
	            String[] arr = { "a", "b", "c" };
	            System.out.println("jsonGenerator");
	            String str = "hello world jackson!";
	            //byte
	            jsonGenerator.writeBinary(str.getBytes());
	            //boolean
	            jsonGenerator.writeBoolean(true);
	            //null
	            jsonGenerator.writeNull();
	            //float
	            jsonGenerator.writeNumber(2.2f);
	            //char
	            jsonGenerator.writeRaw("c");
	            //String
	            jsonGenerator.writeRaw(str, 5, 10);
	            //String
	            jsonGenerator.writeRawValue(str, 5, 5);
	            //String
	            jsonGenerator.writeString(str);
	            jsonGenerator.writeTree(JsonNodeFactory.instance.POJONode(str));
	            System.out.println();
	            
	            //Object
	            jsonGenerator.writeStartObject();//{
	            jsonGenerator.writeObjectFieldStart("user");//user:{
	            jsonGenerator.writeStringField("name", "jackson");//name:jackson
	            jsonGenerator.writeBooleanField("sex", true);//sex:true
	            jsonGenerator.writeNumberField("age", 22);//age:22
	            jsonGenerator.writeEndObject();//}
	            
	            jsonGenerator.writeArrayFieldStart("infos");//infos:[
	            jsonGenerator.writeNumber(22);//22
	            jsonGenerator.writeString("this is array");//this is array
	            jsonGenerator.writeEndArray();//]
	            
	            jsonGenerator.writeEndObject();//}
	            
	            
	            AccountBean bean = new AccountBean();
	            bean.setAddress("address");
	            bean.setEmail("email");
	            bean.setId(1);
	            bean.setName("haha");
	            //complex Object
	            jsonGenerator.writeStartObject();//{
	            jsonGenerator.writeObjectField("user", bean);//user:{bean}
	            jsonGenerator.writeObjectField("infos", arr);//infos:[array]
	            jsonGenerator.writeEndObject();//}
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	   /**下面是json 2 bean************************************************/
	    
	    /**
	     *  将json字符串转换成JavaBean对象
	     */

	    public void readJson2Entity() {
	        String json = "{\"address\":\"北海\",\"name\":\"德玛西亚\",\"id\":1,\"email\":\"123456@qq.com\"}";
	        try {
	            AccountBean acc = objectMapper.readValue(json, AccountBean.class);
	            System.out.println(acc.getName());
	            System.out.println(acc);
	        } catch (JsonParseException e) {
	        	e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    ////
	    
	    /**
	     * <b>function:</b>json字符串转换成list<map>
	     * @author hoojo
	     * @createDate 2010-11-23 下午06:12:01
	     */
	    public void readJson2List() {
	        String json = "[{\"address\": \"北海\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"+
	                    "{\"address\":\"北海之家\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}]";
	        try {
	            List<LinkedHashMap<String, Object>> list = objectMapper.readValue(json, List.class);
	            System.out.println(list.size());
	            
	            for (int i = 0; i < list.size(); i++) {
	                Map<String, Object> map = list.get(i);
	                Set<String> set = map.keySet();
	                System.out.println("the set size "+set.size());
	                for (Iterator<String> it = set.iterator();it.hasNext();) {
	                    String key = it.next();
	                    System.out.println(key + ":" + map.get(key));
	                }
	            }
	        } catch (JsonParseException e) {
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	   /////
	    
	    /**
	     * <b>function:</b>json字符串转换成bean Array
	     * @author hoojo
	     * @createDate 2010-11-23 下午06:14:01
	     */
	    public void readJson2Array() {
	        String json = "[{\"Address\": \"北海拉\",\"Name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"+
	                "{\"address\":\"福成拉\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}]";
	        try {
	            AccountBean[] arr = objectMapper.readValue(json, AccountBean[].class);
	            System.out.println(arr.length);
	            for (int i = 0; i < arr.length; i++) {
	                System.out.println(arr[i]);
	                System.out.println((arr[i]).getAddress());
	            }
	            
	        } catch (JsonParseException e) {
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    ////
	    /**
	     * <b>function:</b>json字符串转换Map集合
	     * @author hoojo
	     * @createDate Nov 27, 2010 3:00:06 PM
	     */
	    public void readJson2Map() {
	        String json = "{\"success\":true,\"A\":{\"address\": \"address2\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"+
	                    "\"B\":{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}}";
	        try {
	            Map<String, Map<String, Object>> maps = objectMapper.readValue(json, Map.class);
	            System.out.println(maps.size());
	            Set<String> key = maps.keySet();
	            
	            Iterator<String> iter = key.iterator();
	            while (iter.hasNext()) {
	                String field = iter.next();
	                System.out.println(field + ":" + maps.get(field));
	            }
	        } catch (JsonParseException e) {
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
}

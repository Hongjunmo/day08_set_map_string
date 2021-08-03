package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04_map {
	public static void main(String[] args) {

		
			/* 
			 	Map
			 	-HashMap
			 	-TreeMap
			 	-HashTable..등
			 	
			 	HashMap
			 	-키와 값의 쌍이다
			 	- 순서는 유지되지 않는다
			 	- 키에대한 중복은 허용하지 않는다
			 
			 */
		
			HashMap map = new HashMap();
			map.put("선풍기","1000만원");
			map.put("자동차","10만원");
			map.put("에어컨","30만원");
	
			System.out.println(map);
			System.out.println(map.get("선풍기"));
			System.out.println(map.get("자동차"));
			System.out.println(map.get("에어컨"));
			System.out.println(map.get("없는키"));
				
			System.out.println(map.containsKey("에어컨"));
			System.out.println(map.containsKey("에어31컨"));
			
			System.out.println(map.containsValue("30만원"));
			System.out.println(map.containsValue("340만원"));
			
			System.out.println(map.remove("에어컨"));
			System.out.println(map.containsKey("에어컨"));
			System.out.println(map);
			
			System.out.println(map.keySet());
			
//			Set s = map.keySet()
			Iterator it = map.keySet().iterator();
			System.out.println("123123"+it.next());
			System.out.println("123123"+it.next());
			while(it.hasNext()) {
				String key = (String)it.next();
				System.out.println(key + " : " + map.get(key));
			}
			
			
			
			
			
			
					
	
	
	
	}
}

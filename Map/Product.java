package Map;

import java.util.HashMap;
import java.util.Map;

public class Product {
	public static void main(String[] args) {
		
		Map<String, Integer> aMap=new HashMap<String, Integer>();
		
		aMap.put("A", 4);
		aMap.put("B", 9);
		aMap.put("C", 3);
		
		boolean a = aMap.containsKey("B");
		System.out.println(a);
		
		boolean b = aMap.containsValue(3);
		System.out.println(b);
		
	}

}

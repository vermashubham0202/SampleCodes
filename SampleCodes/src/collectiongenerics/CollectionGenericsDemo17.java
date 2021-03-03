package collectiongenerics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * 143-Program to demonstrate Map interface using LinkedHashMap.
 * -> In both HashMap and Hashtable insertion order may change, so to resolve this we can use LinkedHashMap.
 */
public class CollectionGenericsDemo17 {
	
	public static void main(String[] args) {
		
		Map<String, String> values = new LinkedHashMap<>();
		//We use put() method in Map to add values.
		values.put("myName", "Shubham");
		values.put("myCrush", "Yogeeta Gululani");
		values.put("myLove", "Yami");
		
		Set<String> key = values.keySet();
		
		for(String k : key) {
			System.out.println(k + " -> " + values.get(k));
		}
		
	}
	
}

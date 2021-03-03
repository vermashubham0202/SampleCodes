package collectiongenerics;
/*
 * 142-Program to print values of Map using Map.Entry interface.
 * -> Entry is the interface in Map interface. (nested interface)
 * In Map we have a method called as entrySet() which will give you set of entries.
 * <Key, Value> pair is one entry.
 *  
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionGenericsDemo16 {

	public static void main(String[] args) {
		
		Map<String, String> values = new HashMap<>();
		//We use put() method in Map to add values.
		values.put("myName", "Shubham");
		values.put("myCrush", "Yogeeta Gululani");
		values.put("myLove", "Yami");
		
		Set<Map.Entry<String, String>> v = values.entrySet();
		
		for(Map.Entry<String, String> e : v) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
		
	}

}

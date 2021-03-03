package collectiongenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 140-Program to demonstrate Map interface using HashMap class.
 * -> We have four classes which implements Map:
 * 		-	HashMap
 * 		-	Hashtable
 * 		-	LinkedHashMap
 * 		-	TreeMap
 * 
 * -> In HashMap also values also, values are not stored in sequence.
 * -> Map has a <Kay, Value> pair. So, if you want to use generic, then first generic type is for Key
 * 		and second generic type is for value.
 * -> In our below code both key and values are of type String, so we are writing generic as <String, String>.
 */

public class CollectionGenericsDemo14 {

	public static void main(String[] args) {
		
		Map<String, String> values = new HashMap<>();
		//We use put() method in Map to add values.
		values.put("myName", "Shubham");
		values.put("favActor", "Aamir Khan");
		values.put("favSinger", "Atif Aslam");
		
		//Although it is a set, but if you assign new value to a key, it will replace original value of that key
		values.put("favSinger", "Arijit Singh");
		
		//we can repeat values, but we can not repeat keys
		values.put("favPerson", "Shubham");
		
		//Printing all Map's key -> value (Sequence not same)
		System.out.println(values);
		
		//Printing value of a specific key
		System.out.println(values.get("myName"));
		
		//If we put any key which is not present, then it gives null
		System.out.println(values.get("favSong"));
		
		System.out.println("==============");
		//Printing values of Map using enhanced for loop
		Set<String> keys = values.keySet();		//keySet() method will give you set of keys.
		
		for(String k : keys) {
			System.out.println(k + " -> " + values.get(k));
		}
	}

}

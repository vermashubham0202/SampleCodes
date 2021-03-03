package collectiongenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * 145-Program to print only duplicate elements in ArrayList.
 */

public class CollectionGenericsDemo19 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Shubham");
		names.add("Akki");
		names.add("Arpit");
		names.add("Akki");
		
		//To print unique values create a set
		Set<String> sname = new HashSet<>();
		
		for(String s : names) {
			
			if(!sname.add(s))	//If sname.add() return false then only print value.
				System.out.println(s);
		}
	}

}

package collectiongenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
129-Program to demonstrate collection & generic in Java.
-> In the below program we are creating a collection which can store only integer values.
-> We can create our custom classes (for eg. Student) and we can use them as generic.
-> In collection we can not add the element in between two numbers because there is no index numbers.
*/

public class CollectionGenericsDemo3 {

	public static void main(String[] args) {
		
		Collection<Integer> values = new ArrayList<Integer>();
		//values.add("Shubham"); Error
		values.add(5);
		values.add(7);
		values.add(2);
		values.add(9);
		
		//To remove any value we can write
		values.remove(2);
		
		//We can not sort Collection elements using Collections class's sort() method because it doesn't have index numbers
		//Collections.sort(values); Error
		for(int o : values) {	//now we can write either Integer/int (Wrapper classes)/Object as type of o.
			System.out.println(o);
		}

	}

}

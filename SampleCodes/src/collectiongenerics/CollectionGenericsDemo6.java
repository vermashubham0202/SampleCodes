package collectiongenerics;
/*
132-Program to demonstrate sorting List elements using last digit (unit digit) in Java.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionGenericsDemo6 {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList();
		values.add(13);
		values.add(11);
		values.add(3);
		values.add(4);
		values.add(8);
		values.add(9);
		
		//Sorting the values of list using Collections class's sort() method.
		Collections.sort(values);
		
		//After sorting the values we can reverse them to print in descending order.
		Collections.reverse(values);
		
		for(int i : values) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(134);
		l.add(117);
		l.add(336);
		l.add(421);
		l.add(848);
		l.add(995);
		
		//Comparator is an interface, so we need to implement it using a class
		//Here we are creating a class CompImp in which we implemented Comapator's class
		//unimplemented method comparator.
		Comparator<Integer> com = new CompImp();
		
		////////////////////////////////////////////////////////////////////////////////////////////
		/*We can also do the same task using annonymous class

		 	Comparator<Integer> com = new Comparator<Integer() {
		 		@Override
				public int compare(Integer arg0, Integer arg1) {
					if(arg0 % 10 > arg1 % 10)	//Here we modified it according to our need.
						return 1;
		
					return -1;
				}
		 	};
		 	
		 */
		
		////////////////////////////////////////////////////////////////////////////////////////////
		/*We can also do the same task using Lambda expression
		 * In Lambda expression we have an advantage of not writing data type of parameters

	 	Comparator<Integer> com = (arg0, arg1) -> {
				if(arg0 % 10 > arg1 % 10)	//Here we modified it according to our need.
					return 1;
	
				return -1;
				
				//We can write the code using ternary operator like:
				//	return arg0 % 10 > arg1 % 10 ? 1 : -1;
			};
	 	
		 */
		
		////////////////////////////////////////////////////////////////////////////////////////////
		/* We can use anonymous objects as well:
		 
		 	Collections.sort(l,(arg0, arg1) -> {
		 		return arg0 % 10 > arg1 % 10 ? 1 : -1;
		 	});
		 	
		 */
		
		//In this new list we want to sort these numbers based on unit digit only
		//For this we need to pass the object of Comparator in sort()
		Collections.sort(l,com);
		
		for(int i : l) {
			System.out.println(i);
		}
		
	
	}

}


//Comparator interface
class CompImp implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0 % 10 > arg1 % 10)	//Here we modified it according to our need. (mod 10 will give last digit)
			return 1;	//exchange bits
		
		return -1;	//remain as it is
	}
	
}
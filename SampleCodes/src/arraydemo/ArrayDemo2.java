package arraydemo;
/*
38-Program to demonstrate array elements printing with Enhanced for loop.
Enhanced for loop is used when we want to fetch all values from 
beginning to end and it only works with arrays and collections.
*/
/**
 *
 * @author Shubham Verma
 */
public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int a[] = {5, 7, 9, 4, 6, 8};
		
		for(int i : a) {
			System.out.println(i);	//here 'i' is the value in enhanced for loop.
		}

	}

}

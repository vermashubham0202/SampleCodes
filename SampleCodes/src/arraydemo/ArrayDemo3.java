package arraydemo;
/*
39-Program to demonstrate array.
*/
public class ArrayDemo3 {

	public static void main(String[] args) {

		int a[] = new int[5];
		
		//Assigning values to array.
		for(int i = 0; i < 5; i++) {
			a[i] = i + 1;
		}
		
		//Printing values of array using enhanced for loop.
		for(int k : a) {
			System.out.println(k);
		}
		
		System.out.println();
		
		//Printing values of array if we don't know the length.
		for(int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
	}

}

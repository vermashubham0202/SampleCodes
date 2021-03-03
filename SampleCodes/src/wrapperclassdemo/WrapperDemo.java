package wrapperclassdemo;
/*
94-Program to demonstrate wrapper classes in Java.
-> Java is 99.99% object oriented. 0.01% goes because of primitive data types (int, float, double etc.).
-> In Java everything should be in object, even if you create a variable that should also be an object.
-> We have some wrapper classes to create variable as object, like : Integer class, Float class,
Double class, Character class, Byte class etc.
We have class for all the primitive data types.
*/

public class WrapperDemo {

	public static void main(String[] args) {
		
		//This Integer class is called as wrapper class.
		Integer iObj = new Integer(5);
		
		//Printing the value with auto-unboxing
		System.out.println("iObj : " + iObj);
		/*Wrapping concept :
		 		converting an primitive data type variable to same type object.
		*/
		int j = 9;
		Integer jObj = new Integer(j);
		
		//Printing the value with auto-unboxing
		System.out.println("jObj : " + jObj);
		
		/*Unwrapping concept :
 				converting an wrapper class object to same primitive data type variable.
		 */
		
		//for taking out integer value we have a method called as : intValue();
		Integer kObj = new Integer(7);
		int k = kObj.intValue();
		
		System.out.println("k : " + k);

	}

}

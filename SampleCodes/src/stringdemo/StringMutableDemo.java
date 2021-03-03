package stringdemo;
/*
97-Program to demonstrate how to make string mutable (update the same object while 
	changing string not creating new object in String pool) using StringBuffer and
	StringBuilder in Java.
	
-> StringBuffer is thread-safe, you will not face any problem if you are working with multiple threads.
-> StringBuilder is not thread-safe.
*/

public class StringMutableDemo {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Shubham");
		sbf.append(" Verma");

		System.out.println(sbf);	/*It will automatically call toString() method
									you need not write like : System.out.println(sbf.toString()); */
		
		sbf.replace(0, 7, "Devendra");
		System.out.println(sbf);
		
		System.out.println(sbf.subSequence(3, 7));
		
		sbf.delete(3, 8);
		System.out.println(sbf);
			
	}

}

/*
75-Program to demonstrate Anonymous Object in Java.
-> Anonymous objects are those objects which do not have any reference.
-> Anonymous objects do not take memory of stack.
-> They were created in heap memory and after use they are eligible for garbage collection.
-> It is better to use such objects when you are using them once in your code.
*/

public class AnonymousObjDemo {

	public static void main(String[] args) {
		
		//Creating Anonymous object
		new AG().k = 34;
		
		//Creating different Anonymous object
		new AG().show(); 	//It will not consume Stack memory.
							//It will only consume heap memory.
							//So output is not 34, it is 0.

	}

}

class AG {
	
	int k;
	
	public void show() {
		System.out.println("Hello from class AG : " + k);
	}
	
}
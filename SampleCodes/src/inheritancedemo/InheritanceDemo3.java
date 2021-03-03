package inheritancedemo;
/*
63-Program to demonstrate object creation in inheritance in Java.
-> Whenever you create object of sub-class you also get the object of super-class.
or we can say whenever you call the constructor of sub-class it also calls the default constructor
of super class.
*/

public class InheritanceDemo3 {

	public static void main(String[] args) {
		
		O obj1 = new O(5);
		
		N obj2 = new O(); // In java you can create reference of super class and object of sub-class.
	}

}

class N {
	
	public N() {
		/*super(); we have super method here also.
		This super method will call the constructor of object class because
		every class in java extends the object class.
		*/
		System.out.println("In N const");
	}
	
	public N(int n) {
		//super(); Object class constructor will be called.
		System.out.println("In N const int");
	}
	
}

class O extends N {
	
	public O() {
		//super(); there is a hidden method which call the super class default constructor.
		System.out.println("In O const");
	}
	
	public O(int n) {
		/* super(); This super method will be called first. It will call its super class default
		Constructor. */
		System.out.println("In O const int");
	}
	
}
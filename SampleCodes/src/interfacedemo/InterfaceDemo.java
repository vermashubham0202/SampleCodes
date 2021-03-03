package interfacedemo;
/*
78-Program to demonstrate interface in Java.
-> Interface allows to use multiple inheritance in Java.
-> Interface provides security. (Explain in below code.)
-> Like abstract classes we can declare a method in interface but
   we can not define any method in interface.
-> You can not create object of abstract class, the same way we can not
	create object of interface.
-> Let we have to interface A and B, then a class C can implements both the interfaces.
	Now class C should define all the methods declared in both the interfaces A and B.

-> class and class extends for inheritance, interface and class implements for inheritance.
*/

public class InterfaceDemo {

	public static void main(String[] args) {
		
		AI obj1 = new AI();
		obj1.show();
		obj1.display();
		
		/* Here we are restricting object to call only show method not display
		   by making reference of interface. */
		AH obj2 = new AI();
		obj2.show();
		//obj2.display(); Error -> We can cast obj2 to AI to run this.
		
	}

}

interface AH {
	void show(); //By default every method declaration is public and abstract
				 //so it is not compulsory to write like : public abstract void show();
}

class AI implements AH {
	
	public void show() {
		System.out.println("Hello");
	}
	
	public void display() {
		System.out.println("Hi");
	}
}
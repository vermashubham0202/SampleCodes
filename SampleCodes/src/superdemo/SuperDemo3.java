package superdemo;
/*
70-Program to demonstrate super keyword as an object in Java.
*/

public class SuperDemo3 {

	public static void main(String[] args) {
		
		AA obj1 = new AA();
		obj1.show(); 	//This will call sub-class show() method.

	}

}

class Z {
	
	public void show() {
		System.out.println("In class Z");
	}
	
}

class AA extends Z {
	
	public void show() {
		super.show();	//This will call super-class show method.
		System.out.println("In class AA");
	}
	
}
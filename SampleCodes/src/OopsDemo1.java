/*
49-Program to create a class and object of that class.
*/
public class OopsDemo1 {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		//Destroying object
		obj = null; //now obj is ready for garbage collection

	}

}

class A {
	int x;
	public void show() {
		System.out.println("Hello from class!");
	}
}
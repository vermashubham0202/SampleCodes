package polymorphismdemo;
/*
66-Program to demonstrate polymorphism (constructor-overloading) in Java.
*/

public class PolymorphismDemo3 {

	public static void main(String[] args) {
		
		S obj1 = new S(); // This will call default constructor.
		S obj2 = new S(2); // This will call parameterized constructor.

	}

}

class S {
	
	public S() {
		System.out.println("In const");
	}
	
	public S(int i) {
		System.out.println("In const int " + i);
	}
	
}
package interfacedemo;
/*
83-Program to demonstrate defining methods in interface using 'default' keyword in Java.
This feature supports from java 1.8 onwards.

New features in interfaces in Java 1.8 :
	-> Default methods
	-> Static methods
*/

interface AS {
	void show();
	
	default void display() {
		System.out.println("Hi");
	}
}

public class InterfaceDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

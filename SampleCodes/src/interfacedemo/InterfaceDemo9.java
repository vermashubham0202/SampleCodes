package interfacedemo;
/*
86-Program to demonstrate interface with static methods in Java.
-> static methods in interface are supported from java 1.8 onwards.
*/

interface AX {
	static void show() {
		System.out.println("in show AX");
	}
}

public class InterfaceDemo9 {

	public static void main(String[] args) {
		
		AX.show(); //static methods can be called without any object.
		
	}

}

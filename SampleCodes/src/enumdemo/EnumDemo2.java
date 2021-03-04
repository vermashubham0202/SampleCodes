package enumdemo;
/*
 * 154-Program to demonstrate enum in java.
*/

enum Mobile {	//Here Mobile is enum's name
	//Constants
	APPLE, SAMSUNG, HTC;	//Semicolon at the end is not compulsory in enum
}

public class EnumDemo2 {

	public static void main(String[] args) {
		
		System.out.println(Mobile.APPLE);

	}

}

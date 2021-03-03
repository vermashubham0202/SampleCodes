package userinputdemo;

import java.io.IOException;

/*
91-Trick to take complete string input using System.in.read(); in Java.
*/

public class ReadDemo2 {

	public static void main(String[] args) throws IOException {
		
		int i;
		String str = "";
		
		System.out.println("<To end your input type '.' at the end>\nEnter something : ");
		
		//If user enter full stop or dot (.) the loop get terminated.
		//ASCII value of dot (.) is 46
		while((i = System.in.read()) != 46) {
			str = str + (char)i;
		}
		
		System.out.println("Your input : " + str);
		
	}

}

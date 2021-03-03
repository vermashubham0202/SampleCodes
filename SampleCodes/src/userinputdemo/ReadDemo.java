package userinputdemo;

import java.io.IOException;

/*
90-Program to take user input in Java.

-> To take input from user in Java we can either use :
	Scanner or
	BufferedReader
	you can use object of above classes to take input.

-> We can also use System.in.read(); method to take user input. But it can take only one character
	as input. (We can use loop trick to take complete string.)
	
-> Scanner and BufferedReader internally uses System.in.read(); method.
*/

public class ReadDemo {

	public static void main(String[] args) throws IOException {
		
		//read() can only take a range from 0 to 255 (ASCII value) and it can read only one character.
		//This method taking the value as character and it returns it ASCII value.
		System.out.println("Enter something : ");
		int i = System.in.read();
		System.out.println(i);
		
		//now we are doing type casting to print user input in given form
		System.out.println((char)i);
		
	}

}

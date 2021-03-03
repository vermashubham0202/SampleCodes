package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
104-Program to demonstrate try with resources in Java.
-> This feature introduce in Java 1.7
-> It simply says that if you are only using finally block to close your resources then
	don't do it. Done it with the help of 'try with resources', it will close the resources even if
	there is an exception.
	Also you don't require any catch block.
-> We can use it for sockets, files, database or any other resources.
*/

public class ExceptionHandlingDemo6 {

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
				String str = "";

				System.out.println("Enter your name : ");
				str = br.readLine();
				
				System.out.println("Hello " + str);
	
		} 
		
	}

}

package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
102-Program to demonstrate Exception Handling for user input in Java.
*/

public class ExceptionHandlingDemo4 {

	public static void main(String[] args) {
		
		int num1, num2, quo;
		
		System.out.println("Enter two numbers : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
			
			quo = num1 / num2;
			
			System.out.println("Quotient of " + num1 + " by " + num2 + " is : " + quo);
			
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number.");
			//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}

}

package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
99-Program to demonstrate Exception Handling (Divisible by zero - ArithmeticException) in Java.
*/

public class ExceptionHandlingDemo1{

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, quo = 0;
		
		System.out.println("Enter two numbers : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			//Unchecked Exception
			quo = num1 / num2;
			System.out.println("Quotient of " + num1 + " by " + num2 + " is : " + quo);
			
		} catch(InputMismatchException e) {
			System.out.println("Please enter numbers not other characters : " + e);
		} catch(ArithmeticException e) {
			System.out.println("Number can not be divided by 0");
		}

	}

}

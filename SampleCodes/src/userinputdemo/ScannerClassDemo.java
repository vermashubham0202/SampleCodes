package userinputdemo;

import java.util.Scanner;

/*
93-Program to take user input using Scanner Class in Java.
*/

public class ScannerClassDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Your input is : " + num);

	}

}

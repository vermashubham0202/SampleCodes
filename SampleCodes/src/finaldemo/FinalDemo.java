package finaldemo;
/*
71-Program to demonstrate final keyword with variable in Java.
-> Final keyword can be used with variable, method or with class.
-> Final keyword with variable creates a constant, which you can't change.
*/

public class FinalDemo {

	public static void main(String[] args) {
		
		final int i = 5;	//If you made a variable final, you can't change its value.
		
		//i++; -> This will give an error.
		//i = 6; -> This will give an error.
		
		System.out.println(i);
		
		final int j;//If we are failed to assign value here, we can assign it later.
	j = 4;
		//j = 7; -> This will give an error.
		System.out.println(j);
		
	}

}

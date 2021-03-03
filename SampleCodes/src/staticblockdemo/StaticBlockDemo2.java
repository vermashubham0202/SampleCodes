package staticblockdemo;
/*
58-Program to demonstrate actual use of static block.
*/

public class StaticBlockDemo2 {

	static String s = "";
	
	static {
		
		s = "Hello World!";
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("The value of s is : " + s);

	}

}

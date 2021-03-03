package stringdemo;
/*
98-Program to demonstrate how to make string mutable using StringBuilder in Java.
-> StringBuilder has almost same methods as StringBuffer.
*/

public class StringMutableDemo2 {

	public static void main(String[] args) {
		
		StringBuilder sbl = new StringBuilder("Arpit");
		sbl.append(" Verma");
		
		System.out.println(sbl);
		
		sbl.replace(0, 5, "Akki");
		System.out.println(sbl);

	}

}

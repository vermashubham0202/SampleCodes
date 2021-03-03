package stringdemo;
/*
89-Program to demonstrate toString() method in Java.
*/

public class DemotoString {

	public static void main(String[] args) {
		
		BA s1 = new BA(31, "Shubham");
		//System.out.println(s1.toString()); -> toString() method called automatically.	
		
		/* Whenever we try to print object by default it will call a method toString();
		   there is no method named as toString in class BA but it is present in Object class
		   and because of inheritance it becomes the part of BA class. */
		
		/* We can override this method in our BA class in such a way, so that if we print
		 * the object then it will print its values.
		 */

		System.out.println(s1);
	}

}

class BA extends Object {	//By default every class in Java extends Object class
	int rollNo;
	String sName;
	
	public BA(int rollNo, String sName) {
		this.rollNo = rollNo;
		this.sName = sName;
	}
	
	@Override
	public String toString() {
		return ("Roll Number : " + rollNo + "\nName : " + sName);
	}
}
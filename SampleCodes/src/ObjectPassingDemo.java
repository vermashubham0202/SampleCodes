/*
52-Program to demonstrate Object passing in Java.
In Java everything is passed as 'call by value'.
When we pass an object to a method, the hash-code of that object will be passed.
*/
public class ObjectPassingDemo {

	public static void main(String[] args) {
		
		Paper p = new Paper();
		p.setText("Hello World!");
		System.out.println(p.getText());
		
		Printer hp = new Printer();
		hp.print(p);
		System.out.println(p.getText());

	}

}

class Printer {
	
	public void print(Paper p) {
		p.setText("Get Lost!");
	}
	
}

class Paper {
	
	String text;
	
	public void setText(String t) {
		text = t;
	}
	
	public String getText() {
		return text;
	}
	
}
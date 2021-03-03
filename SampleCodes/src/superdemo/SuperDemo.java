package superdemo;
/*
68-Program to demonstrate super keyword as method in Java.
-> In Java every class extends Object class. class V's constructor will call its super class (Object class)
   constructor.
*/

public class SuperDemo {

	public static void main(String[] args) {
		
		W obj1 = new W();
		W obj2 = new W(5);
		
	}

}

class V /*extends Object */ {	//Super-class
	
	public V() {
		//super();	-> this will call object class's default constructor.
		System.out.println("In const V");
	}
	
	public V(int i) {
		//super();	-> this will call object class's default constructor.
		System.out.println("In const V para");
	}
	
}

class W extends V {	//Sub-class
	
	public W() {
		//super();	-> this will call class V's default constructor.
		System.out.println("In const W");
	}
	
	public W(int i) {
		//super();	-> this will call class V's default constructor not parameterized constructor.
		
		/* If you want to call parameterized constructor of super class V, then you have to write.
			super(i);
		 */
		System.out.println("In const W para");
	}

}
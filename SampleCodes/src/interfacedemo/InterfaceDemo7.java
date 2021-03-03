package interfacedemo;
/* Third rule in java.
84-Program to demonstrate class power over interface in Java.
*/

interface AT {
	default void show() {
		System.out.println("in show interface AT");
	}
}

class AU {
	public void show() {
		System.out.print("in show class AU");
	}
}

class AV extends AU implements AT {
	
}

public class InterfaceDemo7 {

	public static void main(String[] args) {
		
		AV obj = new AV();
		obj.show();	//Here it will call class's show() method
					//because class has more power than interface
					//class method show() will hide interface method show()
	}

}

package superdemo;
/*
69-Program to demonstrate super keyword as an object in Java.
*/

public class SuperDemo2 {

	public static void main(String[] args) {
		
		Y obj = new Y();
		obj.show();
		
	}

}

class X {
	
	int i = 5;
	
}

class Y extends X {
	
	int i = 4;
	
	public void show() {
		System.out.println(i);	//This will print Y class (sub-class) i.
		System.out.println(super.i);	//This will print X class (super-class) i.
	}
	
}
package interfacedemo;
/*
79-Program to demonstrate multiple inheritance using interface in Java.
*/

public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		AL obj = new AL();
		obj.abc();
		obj.show();

	}

}

interface AJ {
	void show();
}

interface AK {
	void abc();
}

class AL implements AJ, AK {

	@Override
	public void abc() {
		System.out.println("in abc");
	}

	@Override
	public void show() {
		System.out.println("in show");
	}
	
}
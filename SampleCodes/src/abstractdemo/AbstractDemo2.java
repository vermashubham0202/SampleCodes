package abstractdemo;
/*
77-Program to demonstrate another use of abstract class in Java.
*/

public class AbstractDemo2 {

	public static void main(String[] args) {
		
		Phone obj1 = new Iphone();
		show(obj1);
		
		Phone obj2 = new Samsung();
		show(obj2);
		
		Iphone obj3 = new Iphone();
		show(obj3);
		
		Samsung obj4 = new Samsung();
		show(obj4);

	}
	
	public static void show(Phone obj) {
		obj.showConfig();
	}

}

abstract class Phone {
	
	public abstract void showConfig();

}

class Iphone extends Phone {

	@Override
	public void showConfig() {
		System.out.println("Iphone 6, 1GB RAM, 16GB ROM");
	}
	
}

class Samsung extends Phone {

	@Override
	public void showConfig() {
		System.out.println("Samsung M10, 3GB RAM, 32GB ROM");
	}
	
}
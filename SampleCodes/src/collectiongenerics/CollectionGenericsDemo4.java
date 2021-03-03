package collectiongenerics;

import java.util.ArrayList;

/*
130-Program to demonstrate Custom collection & generic in Java.
-> If you are working with generic, it is compulsory to work with class.
*/

class Container<T> {	//This T will change its type according to the generic passed.
//class Container<T extends Number>	if we write this then those classes who extends Number class can only pass the generic.
											//that is only Integer, Double, Float generic can be passed.
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void show() {
		System.out.println(value.getClass().getName());
	}
	
	public void demo(ArrayList<Integer> obj) {
		
	}
	
	//Here '?' mark can be any sub-class of T because it extends T, and T will change according to passed generic
	public void newDemo(ArrayList<? extends Number> obj) {	//This will become :
											//public void newDemo(ArrayList<? extends T> obj) {	
		
	}
	
	//Here '?' mark can be any super class of T and T will change according to passed generic.
	public void newfun(ArrayList<? super T> obj) {	//This will become :	
							//public void newfun(ArrayList<? super Integer> obj) {
							//But it will support all the super classes of Integer such as Number
	}
}

public class CollectionGenericsDemo4 {

	public static void main(String[] args) {
		
		Container<Double> obj1 = new Container<>();
		obj1.setValue(3.4);
		
		System.out.println(obj1.getValue());
		obj1.show();
		obj1.demo(new ArrayList<Integer>());
		//obj1.demo(new ArrayList<Float>());	Error
		
		Container<Number> obj2 = new Container<>();
		obj2.newDemo(new ArrayList<Integer>());
		
		Container<Integer> obj3 = new Container<>();
		obj3.newfun(new ArrayList<Number>());

	}

}

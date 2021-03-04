package annotation;

import java.util.ArrayList;

/*
 * 158-Program to demonstrate some in-built Annotation in java.
 * -> We can use annotation on class, methods, interface and variables.
 */

@FunctionalInterface	//It is used when interface has only one method
interface Abc {
	void show();
	//void newshow(); By mistake if you put another method, it will give you error at compile time.
}

class A {
	public void show() {
		System.out.println("In show A");
	}
}

class B extends A {
	@Override	//It will give you error at compile time if you write wrong name
				//of over-rided method by mistake.
	//As well as it will help other coders to understand what are you doing here.
	
	@SuppressWarnings("unchecked")
	public void show() {
		ArrayList obj = new ArrayList();
		System.out.println("In show B");
	}
	
	@Deprecated
	public void oldShow() {
		System.out.println("This method is available for you, but don't use it.");
	}
}

public class AnnotationDemo1 {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.show();
		obj.oldShow();

	}

}

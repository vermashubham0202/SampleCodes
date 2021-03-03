package reflectionapidemo;

import java.lang.reflect.Method;

/*
118-Program to demonstrate Reflection API in Java.
-> Reflection API : It is a part of java with which you can get behavior of a class, fields of class
	or if you want to know that .class file is a class file or interface file etc., you can verify all 
	these things using reflection API.
-> So, basically we use Reflection API for testing or to get the understanding of the class.
-> In the below example we are using Reflection API to call the private method of Test class.
-> We are using Reflection to call private methods just for debugging.
*/

public class ReflectionApiDemo1 {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("reflectionapidemo.Test");
		Test t = (Test) c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);

	}

}

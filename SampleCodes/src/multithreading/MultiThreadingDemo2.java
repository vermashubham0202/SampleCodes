package multithreading;
/*
121-Program to demonstrate Multi-threading using Runnable interface in Java.
*/

public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		
		Runnable h1 = new HiNew();
		Runnable h2 = new HelloNew();
		
		/* To call the Runnable interface object we have to create Thread class object
		   and we have to link our Runnable object with them. */
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		
		t1.start();
		t2.start();

	}

}

class A {
	public void show() {
		System.out.println("In Show A");
	}
}

class HiNew extends A implements Runnable {
	public void run() {		//Whenever you create thread it is your responsibility to override run() method.
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class HelloNew extends A implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
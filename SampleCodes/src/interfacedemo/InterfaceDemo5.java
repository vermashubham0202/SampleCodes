package interfacedemo;
/*
82-Program to demonstrate interface extending other interface in Java.
*/

interface AO {
	void showAO();
}

interface AP {
	void showAP();
}

interface AQ extends AO, AP {
	void showAQ();
}

class AR implements AQ {

	@Override
	public void showAO() {
		System.out.println("in showAO");
		
	}

	@Override
	public void showAP() {
		System.out.println("in showAP");
		
	}

	@Override
	public void showAQ() {
		System.out.println("in showAQ");
		
	}
	
}
public class InterfaceDemo5 {

	public static void main(String[] args) {
		
		AR obj = new AR();
		obj.showAO();
		obj.showAP();
		obj.showAQ();
		
	}

}

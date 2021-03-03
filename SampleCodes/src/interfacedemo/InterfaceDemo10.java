package interfacedemo;
/*
87-Program to demonstrate the use of Marker Interface (Interface with no methods) in Java.
-> Marker interface can be used to provide security to access methods.
*/

class AY implements AZ {
	
	void show() {		//We don't want to make this method accessible to everyone. (We want to put permission.)
		System.out.println("in show AY");
	}
	
}

//We are creating a Marker interface (no declaration inside interface)
interface AZ {
	//If any class implements AZ then we will allow to call those class methods. 
}

public class InterfaceDemo10 {

	public static void main(String[] args) {
		
		AY obj = new AY();
		
		//By using the keyword 'instanceof' we can check whether object is an instance of interface or not.
		/* Because by implementing an interface in class and then creating class object we are indirectly creating
		   object of interface. */
		if(obj instanceof AZ) {
			obj.show();
		} else {
			System.out.println("No permission!");
		}

	}

}

package objectcloning;
/*
109-Program to demonstrate deep copy of object in Java.
*/

public class DeepCopyDemo {

	public static void main(String[] args) {
		
		BC obj1 = new BC();
		obj1.i = 5;
		obj1.j = 6;
		
		System.out.println(obj1);
		
		/*Deep copy : new object will be created and manually we have to copy each value one by one.
			if we have so many variables then we have to write that much statements, so this drawback
			can be addressed by Object Cloning. */
		BC obj2 = new BC();
		obj2.i = obj1.i;
		obj2.j = obj1.j;
		
		System.out.println(obj2);

	}

}

class BC {
	int i, j;
	
	@Override
	public String toString() {
		return "BC{" + "i=" + i + ", j=" + j + "}";
		
	}
}
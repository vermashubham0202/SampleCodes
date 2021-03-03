package encapsulationdemo;
/*
60-Program to demonstrate encapsulation in Java.
-> Encapsulation says that to set the value of a variable you should use method and
	to get the value of a variable you should use the variable.
-> It simply means data hiding.
-> For each variable of class we have different getters and setters method.
-> Let we have 'n' variables then we will have maximum 'n' getters and 'n' setters.
*/

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		H obj = new H();
		//obj.i = 5; //It is violating encapsulation by directly setting value to variable.
					//To make it not directly accessible we make 'i' as private in class.
		
		obj.setI(7);
		obj.setS("Yogita");
		
		System.out.println(obj.getI());
		System.out.println(obj.getS());
		
	}

}

class H {
	
	private int i;
	private String s;
	
	public void setI(int varI) {
		i = varI;
	}
	
	public int getI() {
		return i;
	}
	
	public void setS(String varS) {
		s = varS;
	}
	
	public String getS() {
		return s;
	}
	
}
package enumdemo;
/*
 * 153-Program to demonstrate enum in java.
 * -> enum is used to define the range in java. (Constants)
 * -> Earlier people were using interfaces to create their own constant (to define range).
*/

interface MobileCompany {
	//If you create any variable inside interface, that will become constant.
	//Even if you don't mention, by default all variables are 'final' in interface.
	//final String APPLE = "Apple";
	
	static String APPLE = "Apple";
	static String Samsung = "Samsung";
	static String HTC = "htc";
}

public class EnumDemo1 {

	public static void main(String[] args) {
		
		if(MobileCompany.APPLE == "Apple") {	//Here "Apple" is our string which we are comparing
												//with MobileCompany.APPLE's value.
			System.out.println("Correct");
		}
		
		//But coder might forget that the value of MobileCompany.APPLE is of type string
		//He, might compare any integer with that and he will get an error,
		
		/*
		if(MobileCompany.APPLE == 1) {
			System.out.println("Correct");
		}
		error
		*/
		//So, to avoid this thing we use enum.

	}

}

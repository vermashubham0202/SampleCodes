package swapnumbers;
/*
36-Swaping two numbers in one line.
 */
/**
 *
 * @author Shubham Verma
 */
public class SwapTwoNum4 {

	public static void main(String[] args) {
		
		int num1 = 7, num2 = 9;
		
		num2 = num1 + num2 - (num1 = num2);
		
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
	}

}

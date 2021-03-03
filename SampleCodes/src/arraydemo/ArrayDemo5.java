package arraydemo;
import java.util.Random;

/*
41-Program to demonstrate different types of errors in array.
*/
public class ArrayDemo5 {

	public static void main(String[] args) {
		
		int a[] = new int[20];
		
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(50); //It will give random values between 0 to 50 (50 excluded).
		}
		
		for(int i : a) {
			System.out.println(i);
		}
		
		try {
			System.out.println(a[21]); //Error : Index 21 out of bounds for length 20 (Unchecked Exception)
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum index is 19 : " + e);
		}

	}

}

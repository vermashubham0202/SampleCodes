package arraydemo;
/*
37-Program to demonstrate array.
 */
/**
 *
 * @author Shubham Verma
 */
public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}

}

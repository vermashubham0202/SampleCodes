package currenttimemillis;

import java.util.ArrayList;

/*
 * 146-Program to demonstrate System.currentTimeMillis() method.
 */

public class CurrentTimeMillisDemo1 {

	public static void main(String[] args) {
		
		//variable to store start time of the code.
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> l = new ArrayList<>();
		
		for(int i = 0; i < 1000000; i++) {
			l.add(i);
		}
		
		//variable to store end time of the code.
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);

	}

}

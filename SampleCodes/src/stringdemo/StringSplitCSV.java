package stringdemo;
/*
96-Program to split string from CSV (Comma Separated Values) in Java.
*/

public class StringSplitCSV {

	public static void main(String[] args) {
		
		String str = "Shubham, Akki, Yogita, Jaya";
		
		//split method will give you an array where each index contains separated value
		String names[] = str.split(", ");	//Enter that character with which you want to separate.
		
		for(String s : names) {
			System.out.println(s);
		}

	}

}

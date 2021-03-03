package collectiongenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 136-Program to print student's roll number based on their marks (sorting).
 * Highest marks to lowest marks.
 */
public class CollectionGenericsDemo10 {

	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList();
		sList.add(new Student(1,45));
		sList.add(new Student(2,65));
		sList.add(new Student(3,85));
		sList.add(new Student(4,25));
		sList.add(new Student(5,75));
		sList.add(new Student(6,95));
		
		//Sorting students based on their marks
		Collections.sort(sList,(s1,s2) -> {	//Collections.sort(List, Comparator)
			return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;
		});
		
		//Printing sorted list of students based on marks
		for(Student s : sList) {
			System.out.println(s);
		}
		
	}

}

class Student {
	int rollNo;
	int marks;
	
	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
}
package serialization.deserialization;
/*
117-Program to demonstrate Deserialization of Java Object in XML using XMLEncoder.
*/

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;


public class DeserializationXML {

	public static void main(String[] args) {
		
		XMLDecoder xd = null;
		try {
			xd = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
			
			College c = (College) xd.readObject();
			List<Student> s = c.getStudents();
			
			for(Student value : s) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			xd.close();
		}

	}

}

package serialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
115-Program to demonstrate serialization of Java Object.
-> Serialization : Saving the state of an Object in a file.
*/

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
		//Serialization is used to store the state(values) of the object.
		//So that if we again create object we can retrieve all its value.
		Save obj1 = new Save();
		obj1.i = 5;
		
		//Saving object state to a file
		File f = new File("object.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1); 	//obj1 state will be saved in object.txt
		
		//Retrieving object from a file
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj2 = (Save) ois.readObject();	//ois.readObject(); will return the object of Object class
												//so we need to type cast it to Save's object.
		
		System.out.println("Value of obj2 : " + obj2.i);
		
	}

}

class Save implements Serializable {
	int i;
}
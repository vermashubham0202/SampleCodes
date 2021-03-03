package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
112-Program to demonstrate file handling in Java.
*/

public class FileHandlingDemo1 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("demo.txt");
		
		//Writing data to file
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Shubham Verma");
		
		//Reading data from file
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		
		System.out.println(str);
	}

}

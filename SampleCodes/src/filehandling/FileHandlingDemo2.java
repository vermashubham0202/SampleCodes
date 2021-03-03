package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

/*
113-Program to demonstrate properties files in Java.
-> Every property file will have a key and a value.
-> In one property file we can have multiple keys and multiple values.
-> For Eg. to access a database we need three things - url of database, user name and password
   so we can write these three things in property file and we can fetch this later.
*/

public class FileHandlingDemo2 {

	public static void main(String[] args) throws Exception {
		
		//Storing information to property file
		Properties p = new Properties();
		
		//We need object of OutputStream to store data outside
		OutputStream os = new FileOutputStream("dataconfig.properties");
		
		//Setting values to property file
		p.setProperty("url", "localhost:3306/myDb");
		p.setProperty("uname", "shubham");
		p.setProperty("pass", "0000");
		
		p.store(os, null);
	}

}

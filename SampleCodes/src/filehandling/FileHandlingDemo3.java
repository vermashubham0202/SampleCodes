package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
114-Program to demonstrate reading values from properties files in Java.
*/

public class FileHandlingDemo3 {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		File f = new File("dataconfig.properties");
		
		//To fetch data from a file we use InputStream
		InputStream is  = new FileInputStream(f);
		p.load(is);
		
		System.out.println(p);
		System.out.println(p.getProperty("url"));
		
		p.list(System.out);

	}

}

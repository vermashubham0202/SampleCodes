package qrcode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/*
111-Program to generate QR Code from text in Java.
*/

public class QRCodeGenerator {

	public static void main(String[] args) throws Exception {
		
		String details = "Shubham Verma : +91-7078512340";
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		
		File f = new File("/home/shubham/Study/Tutorials/Technical/Computer Programming/Java/Core Java/MyDetail.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();

	}

}

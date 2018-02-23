package practice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\New folder\\Text Document.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = " Hello My Name is Lohit Reddy";
		
		byte[] b = str.getBytes();
		
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("Success");
		
	}

}

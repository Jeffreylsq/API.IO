package io2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("e.zip");
		FileOutputStream fos = new FileOutputStream("Copy_e.rar");
		
		int d = 0;
		long s = System.currentTimeMillis();
		while((d = fis.read())!= -1) {
			
			fos.write(d);
		}
		long e = System.currentTimeMillis();
		System.out.println("Finish: " + ( e - s));
		fis.close();
		fos.close();
		
		
	}
}

package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {

	public static void main(String[] args) throws IOException {

		FileInputStream s = new FileInputStream("pos.txt");
		FileOutputStream o = new FileOutputStream("pos2.txt",true);
		
		byte [] data = new byte[1024*10];
		int len = 0;
		while((len = s.read(data))!= -1) {
			
			o.write(data,0,len);
		}
		System.gc();
		System.out.println("finish");
		s.close();
		o.close();
	}
}

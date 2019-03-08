package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo3 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile f = new RandomAccessFile("pos.txt","r");
		RandomAccessFile f2 = new RandomAccessFile("pos22.txt","rw");
		
		byte[] data = new byte[1024*10];
		int len;
		
		while((len = f.read(data))!= -1) {
			
			f2.write(data,0,len);
		}
		
		f.close();
		f2.close();
	}

}

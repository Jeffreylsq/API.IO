package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author pc
 *
 */
public class Bos_flushDemo {

	public static void main(String[] args) throws IOException {

	
		
		/*
		 *flush 方法是将缓冲区中已经缓存的数据一次性写出，
		 *频繁的调用会降低写出效率，但是可以改变写出数据的及时性 
		 */

		FileOutputStream fos = new FileOutputStream("saa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "asdjahsldjalskdkajksdjklaskssssss";
		bos.write(str.getBytes());
		
		bos.close();
	}

}

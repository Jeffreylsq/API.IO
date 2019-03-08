package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流完成文件复制
 * 缓冲流：
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 他们是一组高级流，将他们连接上以后可以提高读写效率
 * 这样一来无论我们使用单字节读写还是块读写，都可以保证读写效率
 * @author pc
 *
 */

public class Copydemo4 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("Windows10.iso");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("Windows2.iso");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long s = System.currentTimeMillis();
		byte []data = new byte[1024*10000];
		int len;
		while((len = bis.read(data))!= -1) {
			bos.write(data,0,len);
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		
		bis.close();
		bos.close();
		
		
		
		
		
		
	}

}

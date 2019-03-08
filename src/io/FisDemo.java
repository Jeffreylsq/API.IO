package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，用于文件中读取字节
 * @author pc
 *
 */

public class FisDemo {

	public static void main(String[] args) throws IOException {
		
	    FileInputStream f = new FileInputStream("pos.txt");
	    
	    byte [] data = new byte[1000];
	   int len = f.read(data);
	    String str = new String(data,0,len,"utf-8");
	    System.out.println(str);
	}

}

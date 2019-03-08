package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成复制
 * 
 * 
 * @author pc
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * 流程：
		 * 1.创建文件输入流读取源文件
		 * 2.创建文件输出流向复制文件文件写
		 * 3.循环从源文件读取一组字节并写入到复制文件中完成复制操作
		 * 4.关闭两个流
		 */
		
		
		FileInputStream f2 = new FileInputStream("sss.txt");
		FileOutputStream f3 = new FileOutputStream("sss2.txt");
		
		byte[]data2 = new byte[1024*100];
		int len;
		
		
         while( (len = f2.read(data2))!= -1) {
			
        //	 String  str = new String(data2, 0 , l, "utf-8");
        	 f3.write(data2,0,len);
		}
		
		System.out.println("finish");
		
		f2.close();
		f3.close();
		
	}

}

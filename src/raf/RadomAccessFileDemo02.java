package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * 从文件中读取字节
 * @author pc
 *
 */
public class RadomAccessFileDemo02 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("text2.dat","r");
		/*
		 * 从文件中读取一个字节，并用int返回
		 * 00000001 低8位， 前面补24个零
		 * 如果返回值是-1， 则表示已经都取到了文件末尾
		 * 我们只考虑最末尾的8位， 
		 * 00000000 00000000 00000000 11111111 ---- 输入255   输出 255
		 * 00000000 00000000 00000001 00000000 -----输入 256 输出 0
		 * 00000000 00000000 00000001 00000001 -----输入 257 输出 1   因为这个只显示 后8位
		 * 
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		raf.close();   //这个一定要关掉 释放资源
				
	}

}

package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *  专门用来读写文件数据的API，其基于指针读写，可以对文件任意位置进行读写操作，编辑文件数据内容非常灵活
 *  
 *  创建RAF时第一个参数为要操作的文件，第二个参数为模式，模式有两个比较常用的选项：
 *  ”r" 只读模式
 *  ”rw" 读写模式
 * @author pc
 *
 */

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("./text2.dat","rw");
		
		raf.write(-1);  //所对应的二进制写入
		raf.close();
		
		/*
		 * void write(int d)
		 * 向文件写入一字节，写入的是给定的int值所对应的2进制的低8位
		 * 
		 * 00000000 00000000 00000000 00000001
		 * 
		 * 
		 */
		RandomAccessFile r = new RandomAccessFile("./Jeffrey.txt","rw");
		
		r.write(1);//每调用一次写一个字节，但是你重新执行，每次都是从第一个开始写开始覆盖，
		System.out.println("finish");
		r.close();
		
	}

}

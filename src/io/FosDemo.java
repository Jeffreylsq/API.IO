package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 流  java标准的io操作
 * 使用流我们可以以统一的方式读写一切设备
 * java 将流按照读写功能分为：
 * 
 * 输入流：用于从外界读取数据到程序中（负责读功能）
 * 
 * 输出流：用于将数据从程序中写出到外界（负责写功能）
 * java.io.InputStream 是所有字节输入流的超类
 * java.io.OutputStream 是所有字节输出流的超类
 * 他们规定了所有流都必须具备读写的操作， 因此无论读写什么设备的流，读写方法都是一样的
 * 
 * java将流分成节点流和处理流：
 * 
 * 节点流：又称低级流，实际连接程序与另一端的管道， 负责实际读或写数据的流，读写操作一定是建立在节点流的基础上进行的
 * 
 *处理流：
 *又称高级流， 不能独立存在， 必须连接在其他流上，目的是当数据流经当前处理流时可以对数据进行某种加工处理操作，简化我们对数据的相关操作
 *
 *文件流：
 *文件流是一种低级流，用于读写
 *文件流与RandomAccessFile都是用来读写文件数据的，虽然读写方法定义都相同，（read,write方法）但是底层实际的读写形式完全不同
 *文件流是基于java标准io对文件进行数据读写的，而流的读写形式为{顺序读写}， 即：读或写操作只能顺序向后， 不可会退。
 *RAF是基于指针的随机读写形式，可以操作只针对文件任意位置进行读写，所以文件流做不到对文件任意位置的编辑操作，但是基于流连接，可以轻松完成
 *RAF不容易办到的事情
 *流连接：
 *使用流读写时，串联若干高级流，并最终串联到某个低级流对某设备进行读写操作的过程
 *流连接也是IO留的精髓
 * @author pc
 *
 */
public class FosDemo {

	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 输出流每次创建的时候会把之前的数据完全删除，然后填写新的
		 * 
		 * 
		 * File 提供的构造方法：
		 * FileOutputStream(File file)
		 * FileOutputStream(String path)
		 * 以上形式创建文件输出流时，若指定文件已经存在， 那么流创建时会见该文件数据全部清除，所以这个方式为覆盖写模式
		 * 
		 */

		//FileOutputStream pos = new FileOutputStream("pos.txt");
		
		/**
		 * 如果创建时在传入一个boolean值类型的参数，那么当前文件输出流就变成了追加模式，
		 * 即：若文件已存在文件数据全部保留，通过流写出的内容会被追加到文件末尾
		 */
		
		
		FileOutputStream pos = new FileOutputStream("pos.txt",true);  //在既有文件后面加东西， 流不能修改只能在末尾追加
		
		
		
		String str = "I'm recover from hurt";
		byte[]data = str.getBytes("utf-8");
		pos.write(data);
		
		pos.write(", I will try my best to make my life to be successful ".getBytes("utf-8"));
		
		pos.write("asdsadsa".getBytes());

		
		
		
		System.out.println("Finish");
		pos.close();
	}

}

















package api.day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 字符流
 * java将流按照读写数据的单位划分成了两类：
 * 
 * 字节流： 以字节为单位读写数据， 超类：InputStream, OutputStream 
 * 字符流： 以字符为单位读写数据， 超类：Reader，Writer
 * 
 * 字符流底层实际还是按照字节形式读写，但是字符与字节的转换
 * 操作字符流自行完成，所以字符流只适合读写文本数据
 * 
 * 
 * 转换流：
 * java.io.OutputStreamWriter
 * java.io.InputStreamReader
 * 转换流是一对高级流，是可以链接在字节流上的字符流， 实际应用中当我们都写文本数据时通常不会直接操作这对流，但是他们在流连接当中是非常重要的一环
 * 
 * @author pc
 *
 */

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {

		 FileOutputStream fos = new FileOutputStream("fos.txt");
		 /*
		  * 如果不指定第二个参数，则是按照系统默认字符集将写出的文本数据转换为字节，
		  * 指定后按照指定的字符集转换
		  * 
		  * 
		  */
		 OutputStreamWriter osw = new OutputStreamWriter(fos);
		 
		osw.write("马超 字孟起，五虎上将， 右将军， 神功天将军， 领汉中太守");
		osw.write("，潼关之战 击败曹操，曹操割须弃袍");
		osw.write("刘备入蜀，");
		osw.close();
		
		
	}

}

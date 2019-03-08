package api.day06;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 缓冲字符流内部有缓冲区，读写字符效率高，并且可以按行读写字符串
 * 
 * 但是比较常用的缓冲字符输出流为： PrintWriter, 他内部连接BufferedWriter 作为其缓冲加速器，而他自身提供了自动的行刷新操作
 * @author pc
 *
 */
public class PWDemo1 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		/*
		 * 这是一个高级流但是 PrinterWriter -> BufferedWriter -> OutputStreamWriter - > FileOutputStream -> file.txt
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 * 
		 * 可以在传入一个String类型的参数为字符集；
		 */
		
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		
		pw.println("臣亮言： 先帝创业为半 而中道崩殂， 今天下三分益州疲敝");
		pw.println("此诚危急存亡之秋也！");
		System.out.println("finish");
		
		pw.close();
		
			
		
		
		
	}

}

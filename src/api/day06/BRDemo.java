package api.day06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流，可以按行读取字符串
 * 
 * 
 * @author pc
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * 将当前程序源代码读取出来并输出到控制台
		 * 
		 */
		FileInputStream fis = new FileInputStream("./src/api/day06/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String str = null;
		
		/*
		 * String readLine()
		 * 读取一行字符串，该方法会连续读取若干字符，当读取到换行符时停止，并将换行符之前的内容以一个字符串的形式返回，
		 * 注意，返回的字符串中不包含最后的换行符
		 * 如果返回值为null，则表示读取到了末尾（若是读取文件则表示文件都到了末尾）
		 * 
		 * 
		 */
		while((str = br.readLine())!= null) {
			System.out.println(str);
		}
		
		br.close();
		
	}

}

package api.day06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 简易记事本工具
 * 程序启动后，要求用户输入文件名，然后对该文件进行操作，之后用户在控制台输入的每行字符串都按行写入该文件，
 * 若用户输入”exit“时退出
 * @author pc
 *
 */
public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = kb.nextLine();
		//System.out.println("please enter your file");
		
		FileOutputStream file = new FileOutputStream(fileName+".txt");
		OutputStreamWriter osw = new OutputStreamWriter(file);
		BufferedWriter bw = new BufferedWriter(osw);
		
		/*
		 * 在流连接中创建PW时，在构造方法允许我们在传入一个boolean 参数，当这个值为true时，那么当前PW就具有了换行功能，当我们调用println方法后
		 * 会自动flush，但是print方法不会自动flush
		 * 
		 */
		
		
		
		
		PrintWriter pw = new PrintWriter(bw,true); //第一个参数是个流， 而且加true 如果是println方法 自动行刷新
		
		
		
		
		
		
		while(true) {
			String str = kb.nextLine();
			 
			 if("exit".equals(str)) {
				 break;
			 }
			 
			 pw.println(str);
			// pw.flush(); 
	 }
		
		System.out.println("Finish");
		 pw.close();
		
	}

}

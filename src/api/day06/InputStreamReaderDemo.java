package api.day06;
/*
 * ת������ȡ�ı�����
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * ��osw.txt�ļ��ж�ȡ�ı�����
		 */
		FileInputStream fis = new FileInputStream("fos.txt");
	    InputStreamReader isr = new InputStreamReader(fis, "gbk");
	    
		
//		char[] data = new char[100];
//		int len = isr.read(data);
//		String str = new String(data, 0, len);
//		System.out.println(str);
//		isr.close();
		
		int d = -1;
		
		while((d = isr.read())!= -1) {
			System.out.print((char)d);
		}
		
		
	}

}

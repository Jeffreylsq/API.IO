package api.day06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ��������ʹ��pw
 * 
 * @author pc
 *
 */
public class PWDemo02 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("pw.txt");
		OutputStreamWriter  osw  = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("ŭ�����ƾ���� ������Ъ");
		pw.println("̧�������쳤Х׳������");
		
		System.out.println("Finish");
		pw.close();
		
		
		
	}

}

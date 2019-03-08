package api.day06;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * �����ַ���
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * �����ַ����ڲ��л���������д�ַ�Ч�ʸߣ����ҿ��԰��ж�д�ַ���
 * 
 * ���ǱȽϳ��õĻ����ַ������Ϊ�� PrintWriter, ���ڲ�����BufferedWriter ��Ϊ�仺������������������ṩ���Զ�����ˢ�²���
 * @author pc
 *
 */
public class PWDemo1 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		/*
		 * ����һ���߼������� PrinterWriter -> BufferedWriter -> OutputStreamWriter - > FileOutputStream -> file.txt
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 * 
		 * �����ڴ���һ��String���͵Ĳ���Ϊ�ַ�����
		 */
		
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		
		pw.println("�����ԣ� �ȵ۴�ҵΪ�� ���е����㣬 ��������������ƣ��");
		pw.println("�˳�Σ������֮��Ҳ��");
		System.out.println("finish");
		
		pw.close();
		
			
		
		
		
	}

}

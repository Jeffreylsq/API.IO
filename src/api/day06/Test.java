package api.day06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * ���׼��±�����
 * ����������Ҫ���û������ļ�����Ȼ��Ը��ļ����в�����֮���û��ڿ���̨�����ÿ���ַ���������д����ļ���
 * ���û����롱exit��ʱ�˳�
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
		 * ���������д���PWʱ���ڹ��췽�����������ڴ���һ��boolean �����������ֵΪtrueʱ����ô��ǰPW�;����˻��й��ܣ������ǵ���println������
		 * ���Զ�flush������print���������Զ�flush
		 * 
		 */
		
		
		
		
		PrintWriter pw = new PrintWriter(bw,true); //��һ�������Ǹ����� ���Ҽ�true �����println���� �Զ���ˢ��
		
		
		
		
		
		
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

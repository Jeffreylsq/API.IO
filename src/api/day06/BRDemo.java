package api.day06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ������������԰��ж�ȡ�ַ���
 * 
 * 
 * @author pc
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * ����ǰ����Դ�����ȡ���������������̨
		 * 
		 */
		FileInputStream fis = new FileInputStream("./src/api/day06/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String str = null;
		
		/*
		 * String readLine()
		 * ��ȡһ���ַ������÷�����������ȡ�����ַ�������ȡ�����з�ʱֹͣ���������з�֮ǰ��������һ���ַ�������ʽ���أ�
		 * ע�⣬���ص��ַ����в��������Ļ��з�
		 * �������ֵΪnull�����ʾ��ȡ����ĩβ�����Ƕ�ȡ�ļ����ʾ�ļ�������ĩβ��
		 * 
		 * 
		 */
		while((str = br.readLine())!= null) {
			System.out.println(str);
		}
		
		br.close();
		
	}

}

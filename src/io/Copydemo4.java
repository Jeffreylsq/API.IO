package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ�û���������ļ�����
 * ��������
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * ������һ��߼������������������Ժ������߶�дЧ��
 * ����һ����������ʹ�õ��ֽڶ�д���ǿ��д�������Ա�֤��дЧ��
 * @author pc
 *
 */

public class Copydemo4 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("Windows10.iso");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("Windows2.iso");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long s = System.currentTimeMillis();
		byte []data = new byte[1024*10000];
		int len;
		while((len = bis.read(data))!= -1) {
			bos.write(data,0,len);
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		
		bis.close();
		bos.close();
		
		
		
		
		
		
	}

}

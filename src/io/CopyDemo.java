package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�����ɸ���
 * 
 * 
 * @author pc
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * ���̣�
		 * 1.�����ļ���������ȡԴ�ļ�
		 * 2.�����ļ�����������ļ��ļ�д
		 * 3.ѭ����Դ�ļ���ȡһ���ֽڲ�д�뵽�����ļ�����ɸ��Ʋ���
		 * 4.�ر�������
		 */
		
		
		FileInputStream f2 = new FileInputStream("sss.txt");
		FileOutputStream f3 = new FileOutputStream("sss2.txt");
		
		byte[]data2 = new byte[1024*100];
		int len;
		
		
         while( (len = f2.read(data2))!= -1) {
			
        //	 String  str = new String(data2, 0 , l, "utf-8");
        	 f3.write(data2,0,len);
		}
		
		System.out.println("finish");
		
		f2.close();
		f3.close();
		
	}

}

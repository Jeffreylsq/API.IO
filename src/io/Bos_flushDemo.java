package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author pc
 *
 */
public class Bos_flushDemo {

	public static void main(String[] args) throws IOException {

	
		
		/*
		 *flush �����ǽ����������Ѿ����������һ����д����
		 *Ƶ���ĵ��ûή��д��Ч�ʣ����ǿ��Ըı�д�����ݵļ�ʱ�� 
		 */

		FileOutputStream fos = new FileOutputStream("saa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "asdjahsldjalskdkajksdjklaskssssss";
		bos.write(str.getBytes());
		
		bos.close();
	}

}

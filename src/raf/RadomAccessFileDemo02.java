package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * ���ļ��ж�ȡ�ֽ�
 * @author pc
 *
 */
public class RadomAccessFileDemo02 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("text2.dat","r");
		/*
		 * ���ļ��ж�ȡһ���ֽڣ�����int����
		 * 00000001 ��8λ�� ǰ�油24����
		 * �������ֵ��-1�� ���ʾ�Ѿ���ȡ�����ļ�ĩβ
		 * ����ֻ������ĩβ��8λ�� 
		 * 00000000 00000000 00000000 11111111 ---- ����255   ��� 255
		 * 00000000 00000000 00000001 00000000 -----���� 256 ��� 0
		 * 00000000 00000000 00000001 00000001 -----���� 257 ��� 1   ��Ϊ���ֻ��ʾ ��8λ
		 * 
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		raf.close();   //���һ��Ҫ�ص� �ͷ���Դ
				
	}

}

package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *  ר��������д�ļ����ݵ�API�������ָ���д�����Զ��ļ�����λ�ý��ж�д�������༭�ļ��������ݷǳ����
 *  
 *  ����RAFʱ��һ������ΪҪ�������ļ����ڶ�������Ϊģʽ��ģʽ�������Ƚϳ��õ�ѡ�
 *  ��r" ֻ��ģʽ
 *  ��rw" ��дģʽ
 * @author pc
 *
 */

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("./text2.dat","rw");
		
		raf.write(-1);  //����Ӧ�Ķ�����д��
		raf.close();
		
		/*
		 * void write(int d)
		 * ���ļ�д��һ�ֽڣ�д����Ǹ�����intֵ����Ӧ��2���Ƶĵ�8λ
		 * 
		 * 00000000 00000000 00000000 00000001
		 * 
		 * 
		 */
		RandomAccessFile r = new RandomAccessFile("./Jeffrey.txt","rw");
		
		r.write(1);//ÿ����һ��дһ���ֽڣ�����������ִ�У�ÿ�ζ��Ǵӵ�һ����ʼд��ʼ���ǣ�
		System.out.println("finish");
		r.close();
		
	}

}

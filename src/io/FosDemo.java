package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��  java��׼��io����
 * ʹ�������ǿ�����ͳһ�ķ�ʽ��дһ���豸
 * java �������ն�д���ܷ�Ϊ��
 * 
 * �����������ڴ�����ȡ���ݵ������У���������ܣ�
 * 
 * ����������ڽ����ݴӳ�����д������磨����д���ܣ�
 * java.io.InputStream �������ֽ��������ĳ���
 * java.io.OutputStream �������ֽ�������ĳ���
 * ���ǹ涨��������������߱���д�Ĳ����� ������۶�дʲô�豸��������д��������һ����
 * 
 * java�����ֳɽڵ����ʹ�������
 * 
 * �ڵ������ֳƵͼ�����ʵ�����ӳ�������һ�˵Ĺܵ��� ����ʵ�ʶ���д���ݵ�������д����һ���ǽ����ڽڵ����Ļ����Ͻ��е�
 * 
 *��������
 *�ֳƸ߼����� ���ܶ������ڣ� �����������������ϣ�Ŀ���ǵ�����������ǰ������ʱ���Զ����ݽ���ĳ�ּӹ���������������Ƕ����ݵ���ز���
 *
 *�ļ�����
 *�ļ�����һ�ֵͼ��������ڶ�д
 *�ļ�����RandomAccessFile����������д�ļ����ݵģ���Ȼ��д�������嶼��ͬ����read,write���������ǵײ�ʵ�ʵĶ�д��ʽ��ȫ��ͬ
 *�ļ����ǻ���java��׼io���ļ��������ݶ�д�ģ������Ķ�д��ʽΪ{˳���д}�� ��������д����ֻ��˳����� ���ɻ��ˡ�
 *RAF�ǻ���ָ��������д��ʽ�����Բ���ֻ����ļ�����λ�ý��ж�д�������ļ������������ļ�����λ�õı༭���������ǻ��������ӣ������������
 *RAF�����װ쵽������
 *�����ӣ�
 *ʹ������дʱ���������ɸ߼����������մ�����ĳ���ͼ�����ĳ�豸���ж�д�����Ĺ���
 *������Ҳ��IO���ľ���
 * @author pc
 *
 */
public class FosDemo {

	
	public static void main(String[] args) throws IOException {
		
		/*
		 * �����ÿ�δ�����ʱ����֮ǰ��������ȫɾ����Ȼ����д�µ�
		 * 
		 * 
		 * File �ṩ�Ĺ��췽����
		 * FileOutputStream(File file)
		 * FileOutputStream(String path)
		 * ������ʽ�����ļ������ʱ����ָ���ļ��Ѿ����ڣ� ��ô������ʱ������ļ�����ȫ����������������ʽΪ����дģʽ
		 * 
		 */

		//FileOutputStream pos = new FileOutputStream("pos.txt");
		
		/**
		 * �������ʱ�ڴ���һ��booleanֵ���͵Ĳ�������ô��ǰ�ļ�������ͱ����׷��ģʽ��
		 * �������ļ��Ѵ����ļ�����ȫ��������ͨ����д�������ݻᱻ׷�ӵ��ļ�ĩβ
		 */
		
		
		FileOutputStream pos = new FileOutputStream("pos.txt",true);  //�ڼ����ļ�����Ӷ����� �������޸�ֻ����ĩβ׷��
		
		
		
		String str = "I'm recover from hurt";
		byte[]data = str.getBytes("utf-8");
		pos.write(data);
		
		pos.write(", I will try my best to make my life to be successful ".getBytes("utf-8"));
		
		pos.write("asdsadsa".getBytes());

		
		
		
		System.out.println("Finish");
		pos.close();
	}

}

















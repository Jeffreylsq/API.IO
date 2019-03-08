package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * ��������
 * 
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * ������һ�Ը߼��������𼴽�java�������ֽ�֮���ڶ�д�Ĺ����н���ת��
 * 
 * @author pc
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {

	   /*
	    * ��һ��Personʵ��д���ļ�person.obj��
	    */
		
		String name = "�Ծ���";
		String gender = "Ů";
		int age = 30;
		String[]otherInfo = {"��Ա","have sex","�ٽ������Ļ�����"};
		Person person2 = new Person(name,age,gender,otherInfo);
		
		FileOutputStream fos = new FileOutputStream("Person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		
		/*
		 * writeObject ����ʱObjectOutputStream�ṩ�ķ����������ǽ�������������ṹת��Ϊһ���ֽڡ�
		 * Ȼ���ٽ��ֽ�ͨ�������ӵ���д��
		 * ʵ��ת�����ֽڱȸö��󱣴������Ҫ�� ��Ϊ��Ҫ�����ö���Ľṹ��Ϣ
		 * 
		 * ����д����ʱ��ÿ��������Ĺ���Ϊ��
		 * ���������Ƚ���������ṹת��Ϊһ���ֽ�
		 * ������̽���:�������л�
		 * ���л�����ֽ��ھ����ļ����������д�����ļ�
		 * ��д���ļ��͵���д���˴��������ñ��棬�ػ�����Ҳ���ᶪʧ����������̽������ݳ־û�
		 */
		oos.writeObject(person2);
		System.out.println("finish");
		oos.close();
		
		
		
		
		
	}

}

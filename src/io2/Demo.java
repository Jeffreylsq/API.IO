package io2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException {

		String name = "����";
		String nick = "�Ƴ�";
		String [] array = {"ǰ����","����ͤ��","���ݶ���"};
		Person person = new Person(name,nick,array);
		
		
		Person P2 = new Person("�ŷ�","���", new String[]{"�󽫾�","���ｫ��","����̫��"});
		Person P3 = new Person("��","����", new String[]{"�ҽ���","���ｫ��","����̫��"});
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(person);
		oos.writeObject(P2);
		oos.writeObject(P3);
		System.out.println("Finish");
		oos.close();
		
	}

}

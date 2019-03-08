package io2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("person.obj");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Person p = (Person)ois.readObject();
		//Person p = (Person)ois.readObject();
		//Person p2 = (Person)ois.readObject();
		System.out.println(p);
		System.out.println(p);
		
		
		ois.close();
	}

}

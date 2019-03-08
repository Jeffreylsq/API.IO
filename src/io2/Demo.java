package io2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException {

		String name = "关羽";
		String nick = "云长";
		String [] array = {"前将军","汉寿亭侯","荆州都督"};
		Person person = new Person(name,nick,array);
		
		
		Person P2 = new Person("张飞","翼德", new String[]{"左将军","车骑将军","阆中太守"});
		Person P3 = new Person("马超","孟起", new String[]{"右将军","骠骑将军","江州太守"});
		
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

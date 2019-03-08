package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * 对象流：
 * 
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 他们是一对高级流，负责即将java对象与字节之间在读写的过程中进行转换
 * 
 * @author pc
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {

	   /*
	    * 将一个Person实例写入文件person.obj中
	    */
		
		String name = "苍井空";
		String gender = "女";
		int age = 30;
		String[]otherInfo = {"演员","have sex","促进中日文化交流"};
		Person person2 = new Person(name,age,gender,otherInfo);
		
		FileOutputStream fos = new FileOutputStream("Person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		
		/*
		 * writeObject 方法时ObjectOutputStream提供的方法，作用是将给定对象按照其结构转换为一组字节、
		 * 然后再将字节通过其连接的流写出
		 * 实际转换的字节比该对象保存的内容要大， 因为还要包含该对象的结构信息
		 * 
		 * 下面写对象时，每个流负责的工作为：
		 * 对象流首先将对象按照其结构转换为一组字节
		 * 这个过程叫做:对象序列化
		 * 序列化后的字节在经过文件输出流最终写入了文件
		 * （写入文件就等于写入了磁盘做长久保存，关机数据也不会丢失）而这个过程叫做数据持久化
		 */
		oos.writeObject(person2);
		System.out.println("finish");
		oos.close();
		
		
		
		
		
	}

}

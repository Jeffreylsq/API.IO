package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class OutputDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile ran = new RandomAccessFile("tttt.txt","r");
		
		for(int i = 0 ; i < ran.length()/100; i++) {
			
			 byte [] data = new byte[32];
			 ran.read(data);
			 String name = new String(data,"utf-8").trim();
			 
			 ran.read(data);
			 String nick = new String(data,"utf-8").trim();
			 
			 ran.read(data);
			 String pas = new String(data,"utf-8").trim();
			 
			int age = ran.readInt();
			
			System.out.println("Name: " + name + " Nickname: " + nick + " Passward:" + pas + " Age: " + age);
		}
		ran.close();
	}

}

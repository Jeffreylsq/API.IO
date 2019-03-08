package api.day05;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;
public class WriteDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		RandomAccessFile ran = new RandomAccessFile("jeffrey.txt","rw");

		Scanner kb = new Scanner(System.in);
		System.out.println("Name");
		String name = kb.next();
		System.out.println("Pas");	
		String pas = kb.next();
		System.out.println("nickName");
		String nick = kb.next();
		System.out.println("Age");
		int age = Integer.parseInt(kb.next());
		
		ran.seek(ran.length());
		
		byte[]data = name.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		data = pas.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		data = nick.getBytes("utf-8");
		data = Arrays.copyOf(data,32);
		ran.write(data);
		
		ran.writeInt(age);
		
		ran.close();
	}

}

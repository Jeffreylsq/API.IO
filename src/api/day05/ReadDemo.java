package api.day05;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class ReadDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("jeffrey.txt","rw");
		
		for(int i = 0 ; i < file.length()/100 ; i ++) {
			
			byte [] data = new byte[32];
			file.read(data);
			String name = new String(data, "utf-8").trim();
			
			file.read(data);
			String pas = new String(data, "utf-8").trim();
			
			file.read(data);
			String nick = new String(data,"utf-8").trim();
			
			int age = file.readInt();
			
			System.out.println("Name " + name + " Passcode: " + pas + " nickname: " + nick + " age: "+ age);
		}
	}

}

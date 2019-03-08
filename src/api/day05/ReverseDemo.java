package api.day05;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseDemo {

	public static void main(String[] args) throws IOException  {

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter name");
		String name = kb.next();
		System.out.println("nick");
		String nick = kb.next();

		RandomAccessFile ran = new RandomAccessFile("jeffrey.txt","rw");
		boolean updata = true;
		for(int i = 0 ; i < ran.length()/100 ; i++) {
			
			ran.seek(i*100);
			byte[]data = new byte[32];
			ran.read(data);
			String n = new String(data,"utf-8").trim();
			
			if(n.equals(name)) {
				
				ran.seek(i*100 + 64);
				
				data = nick.getBytes("utf-8");
				data = Arrays.copyOf(data, 32);
				ran.write(data);
				System.out.println("finish");
				
				updata = false;
				break;
			}
			
		}
		if(updata) {
			System.out.println("not found this person");
		}
		
		
	}

}

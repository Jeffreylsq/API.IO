package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateDemo2 {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name = kb.next();
		
		
		System.out.println("Please enter your nick");
		String nick = kb.next();
		
		RandomAccessFile ran = new RandomAccessFile("tttt.txt","rw");
		boolean res = false;
		for(int i = 0 ; i < ran.length()/100; i++) {
			ran.seek(i*100);
			byte[] data = new byte[32];
			ran.read(data);
			String n = new String(data,"utf-8").trim();
			
			if(n.equals(name)) {
				ran.seek(i*100 + 32);
				
				byte[] arr = nick.getBytes();
				arr = Arrays.copyOf(arr, 32);
				ran.write(arr);
				res = true;
			}
			
			
		}
		if(res) {
			
		}else {
			System.out.println("not exit");
		}
		ran.close();
		
	}

}

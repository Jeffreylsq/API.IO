package api.day03;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ���µ��ļ�
 * 
 * 
 * 
 * 
 */
public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * �ڵ�ǰĿ¼���½�һ��demo.txt
		 * 
		 */
		
		File file = new File("./Demo1.txt");
		
		if(!file.exists()) {
			
			file.createNewFile();
			System.out.println("New file is created");
		}else {
			System.out.println("File exists");
		}
		
		
		
		
	}

}

package api.day03;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新的文件
 * 
 * 
 * 
 * 
 */
public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 在当前目录下新建一个demo.txt
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

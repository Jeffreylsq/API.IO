package api.day03;

import java.io.File;

/**
 * 获取一个目录中所有子项
 * @author pc
 *
 */
public class ListFilesDemo {

	public static void main(String[] args) {

		/*
		 * 获取当前目录下所有子项
		 */
		
		File dir = new File(".");
		
		boolean d =  dir.isDirectory();
	//	boolean f =  dir.isFile();
	
		if(d) {
			File[]subs = dir.listFiles();
			
			for(int i = 0 ; i < subs.length ; i++) {
				System.out.println(subs[i].getName());
			}
		}
		
		
		
	}

}

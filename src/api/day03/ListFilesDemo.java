package api.day03;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼����������
 * @author pc
 *
 */
public class ListFilesDemo {

	public static void main(String[] args) {

		/*
		 * ��ȡ��ǰĿ¼����������
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

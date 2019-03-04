package api.day03;

import java.io.File;

/**
 *创建一个多级目录
 * @author pc
 *
 */


public class MKDirsDemo {

	public static void main(String[] args) {

		File file = new File("a/b/c/d/e/f/demo");
		
		if(!file.exists()) {
			
			file.mkdirs();
			System.out.println("Created");
		}else {
			System.out.println("Exist");
		}
	}

}

package api.day03;

import java.io.File;

/**
 * 创建一个新目录
 * @author pc
 *
 */
public class MKDirDemo {

	public static void main(String[] args) {

		/*
		 * 在当前目录下新建一个名为：demo的目录
		 */
		
		File dir = new File("jeffrey");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("direct exist");
		}else {
			System.out.println("Exits");
		}
		
	}

}

package api.day03;

import java.io.File;

/**
 * ����һ����Ŀ¼
 * @author pc
 *
 */
public class MKDirDemo {

	public static void main(String[] args) {

		/*
		 * �ڵ�ǰĿ¼���½�һ����Ϊ��demo��Ŀ¼
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

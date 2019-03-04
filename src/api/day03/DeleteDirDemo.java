package api.day03;

import java.io.File;

public class DeleteDirDemo {

	public static void main(String[]args) {
		
		
		File dir = new File("./a/b/c/d/f/demo");
		if(dir.exists()) {
			dir.delete();
			System.out.println("Delete");
		}else {
			System.out.println("Not exist");
		}
		
		
	}
}

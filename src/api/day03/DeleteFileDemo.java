package api.day03;
import java.io.File;
/**
 * 删除一个文件
 * @author pc
 *
 */
public class DeleteFileDemo {

	public static void main(String[] args) {

		/*
		 *
		 */
		
		File file = new File("./jeffrey.txt");
		if(file.exists()) {
			System.out.println("File Deleted");
			file.delete();
		}else {
			System.out.println("File is not exist");
		}
			
		
		
		
	}

}

package api.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * java.io.File
 * File的每一个实例用于并表示文件系统中的一个文件或目录
 * 
 * 使用File可以：
 * 
 * 1.访问其表示的文件或目录的属性信息
 * 2.创建或删除文件，目录
 * 3.访问一个目录的所有子项
 * 
 * 
 * 但是不可以：
 * 访问文件数据
 * @author pc
 *
 */
public class FileDemo {

	
	public static void main(String[] args) throws FileNotFoundException {
		
       	//	File file = new File("C:\\Users\\pc\\eclipse-workspace\\TEDU.API\\test.txt");
		/**
		 * 这里指定路径时，应当指定相对路径，因为绝对路径的根不同的操作系统是不同的，不利于跨平台，
		 * 相对路径的好处是屏蔽了系统差异，但是具体相对哪里要根据运行程序的环境而定，
		 * "./"即：当前目录：
		 * 在eclipse中，"./"指的是当前程序所在项目的目录
		 * 
		 */
		
		File file = new File("./test.txt");
		//获取名字
		String name = file.getName();
		System.out.println("File name: " + name);
		
		//获取文件长度(字节量)
		long length = file.length();
		System.out.println("Length: " + length);
		
		//是否可读
		boolean cr = file.canRead();
		//是否可写
		boolean cw = file.canWrite();
		System.out.println(cr);
		System.out.println(cw);
		
		//是否隐藏
		boolean ih = file.isHidden();
		System.out.println("Hidden file: " + ih);
		
		
		
		
		Scanner input = new Scanner(file);
		String line = input.nextLine();
		
		StringBuilder builder = new StringBuilder(line);
		builder.append(" Yes it is");
		System.out.println(builder.toString());
		
		
		
		
		
		
		
		
	}

}

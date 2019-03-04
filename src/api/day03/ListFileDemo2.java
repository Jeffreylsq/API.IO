package api.day03;

import java.io.File;
import java.io.FileFilter;

/**
 * listFile 的重载方法允许我们传入一个文件过滤器
 * File[]listFiles（FileFilter filter)
 * 该方法会将当前File对象标识的目录中满足过滤器要求的子项获取回来
 * 
 * 
 * @author pc
 *
 */
public class ListFileDemo2 {

	public static void main(String[] args) {

		 File file = new File(".");
		 if(file.isDirectory()) {
			 
			FileFilter f = new FileFilter() {
				
				public boolean accept(File file)
				{
					return file.getName().endsWith(".txt");
				}
			};
			
			 
			 
			 File[] arr = file.listFiles(f);
			 for(int i = 0 ; i < arr.length ;i++) {
				 System.out.println(arr[i].getName());
			 }
		 }
		
	}

}

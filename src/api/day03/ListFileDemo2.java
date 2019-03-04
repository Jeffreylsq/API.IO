package api.day03;

import java.io.File;
import java.io.FileFilter;

/**
 * listFile �����ط����������Ǵ���һ���ļ�������
 * File[]listFiles��FileFilter filter)
 * �÷����Ὣ��ǰFile�����ʶ��Ŀ¼�����������Ҫ��������ȡ����
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

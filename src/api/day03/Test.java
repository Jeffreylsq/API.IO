package api.day03;

import java.io.File;

/**
 * 编写程序删目录
 * @author pc
 *
 */
public class Test {

	public static void main(String[] args) {

		File dir = new File("./a");
		delete2(dir);
		System.out.println("Finish");
	}

/*	public static void delete(File file) {

		boolean res = file.isDirectory();

		if(res) {

			
			File [] array = file.listFiles();
			

			for(int i = 0 ; i < array.length; i++)
			{
				//array[0].delete();
				delete(array[i]);


			}
			file.delete();



		}else {
			file.delete();
		}

	*/
	
	public static void delete2(File file) {
		
		
		
		boolean res = file.isDirectory();
		
		if(res) {
			
			File[] arrays = file.listFiles();
			
			for(int i = 0 ; i < arrays.length ; i++) {
				
				delete(arrays[i]);
			}
			
			file.delete();
		}else {
			file.delete();
		}
	
	}

   public static void delete(File file) {
	   
	   if(file.isDirectory()) {
		   
		   File []arr = file.listFiles();
		   
		   for(int i = 0 ; i < arr.length ; i++) {
			   
			   /**
			    * 一个方法内部调用自己方法的现象称为递归调用，递归在实际开发中能避免使用尽量避免
			    * 因为资源开销大，运行速度慢
			    * 若使用递归，应当注意满足以下两点：
			    * 1.递归调用必须被一个分支语句控制，如果方法内部必然执行递归则是死循环
			    * 2.递归层数少（开销大）
			    * 
			    */
			   delete(arr[i]);
		   }
		 //  file.delete();
	   }
		   file.delete();
	 
   }

}

package api.day03;

import java.io.File;

/**
 * ��д����ɾĿ¼
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
			    * һ�������ڲ������Լ������������Ϊ�ݹ���ã��ݹ���ʵ�ʿ������ܱ���ʹ�þ�������
			    * ��Ϊ��Դ�����������ٶ���
			    * ��ʹ�õݹ飬Ӧ��ע�������������㣺
			    * 1.�ݹ���ñ��뱻һ����֧�����ƣ���������ڲ���Ȼִ�еݹ�������ѭ��
			    * 2.�ݹ�����٣�������
			    * 
			    */
			   delete(arr[i]);
		   }
		 //  file.delete();
	   }
		   file.delete();
	 
   }

}

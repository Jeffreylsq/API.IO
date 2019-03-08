
package Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * ��IO����ʹ���쳣����
 * 
 */
public class FinallyDemo2 {

	public static void main(String[] args) {

		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream("fos.dat");
			file.write(1);
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			
			try{
				if(file != null) {
				file.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
			
		}
		
	}

}

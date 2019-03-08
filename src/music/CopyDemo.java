package music;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile s = new RandomAccessFile("./sss.png","r");
		RandomAccessFile f = new RandomAccessFile("./sss_t.png","rw");
		
		int d = 0;
      long star = System.currentTimeMillis();
		while((d = s.read())!= -1) {
			
			f.write(d);
			
		}
		System.out.println("Finish");
		s.close();
		f.close();
	}
	

}

package demo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class readDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile ran = new RandomAccessFile("Aoo.txt","r");
	    RandomAccessFile ran2 = new RandomAccessFile("Boo.txt","rw");
	   
	    byte[] data = new byte[1024*10];
	    int len = -1;
	    while((len = ran.read(data))!= -1) {
	    	ran2.write(data,0,len);
	    }
		
		ran.close();
		ran2.close();
		
	}

}

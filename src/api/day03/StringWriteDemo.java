package api.day03;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class StringWriteDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("iiiiii.txt","rw");
		String str = "yasyysyay";
		byte[]data = str.getBytes();
		file.write(data);
		file.close();
		
		RandomAccessFile file2 = new RandomAccessFile("iiiiii.txt","r");
		
		byte[]arr = new byte[(int) file2.length()];
		file2.read(arr);
		String str2 = new String(arr,"utf-8");
		System.out.println(str2);
		file2.close();
	}
}

package api.day03;
import java.io.File;
import java.io.IOException;
public class Demo {

	public static void main(String[] args) throws IOException  {

		File file = new File("./Demo1.txt");
		
	    String name = file.getName();
	    long length = file.length();
	    
	    System.out.println("Length : " + length);
		System.out.println("Name: " + name);
		
		boolean hid = file.isHidden();
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("Can Read: " + cr);
		System.out.println("Can Write: " + cw);
		System.out.println("Hidden: " + hid);
		
		
	}

}

package api.day01;
/**
 * 
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ����Ը����ַ�����ʼ���β��
 * @author pc
 *
 */
import java.util.Scanner;
public class StartWithDemo {

	public static void main(String[] args) {

		String str = "thinking in java";
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		
		starts = str.endsWith("ava");
		System.out.println(starts);
		
		System.out.println("please enter your name of pic");	
		Scanner kb = new Scanner(System.in);
		String pic = kb.next();
	    
		boolean result = pic.endsWith("png");
		String s = (result)?"This is a picture":"This is not a picture";
	    System.out.println(s);
		
		
		
	}

}

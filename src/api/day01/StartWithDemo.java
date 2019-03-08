package api.day01;
/**
 * 
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定字符串开始或结尾的
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

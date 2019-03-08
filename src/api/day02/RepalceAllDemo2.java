package api.day02;

import java.util.Arrays;

/**
 * 和谐用于
 * @author pc
 *
 */
public class RepalceAllDemo2 {

	public static void main(String[] args) {
		/**
		 * 
		 * 梦露baby
		 * 
		 * 
		 */
		
		String rege = "(wqnmlgb|cnm|nc|mmp|sb|mdzz|djb)";
		String str = "你是不是大sb, 我cnm";
		
		String str2 = str.replaceAll(rege, "***");
		System.out.println(str2);
		
		
		
	/*	String s = "abababshsbdjasadkjajkjf";
		String region = "^(ab)+";
		String [] array = s.split(region);
		String news = s.replaceAll(region, "sb");
		System.out.println(Arrays.toString(array));
		System.out.println(news);
		
		*/
		
		String s1 = "123abc456def789ghi";
		String[] array = s1.split("[a-z]");
		
		for(int i = 0 ; i < array.length ;i++) {
			System.out.println(array[i]);
		}
		
	}

}

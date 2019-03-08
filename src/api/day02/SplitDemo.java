package api.day02;

import java.util.Arrays;

/**
 * 字符串支持正则表达式方法2：
 * String [] split(String regx)
 * 将当前字符串按照满足正则表达式要求的部分经行拆分，并将拆分出的内容返回
 * @author pc
 *
 */
public class SplitDemo {

	public static void main(String[] args) {

		 String str = "asd13sad21sda44va";
		 String [ ]array2 = str.split("[0-9]+");
		 
		 /*
		  * 拆分时，若两侧没有内容时，会拆分出空字符串
		  */
		 String [] array = str.split("[a-zA-Z]");     //凡是末尾连续的空串全被忽略不要
		 System.out.println(Arrays.toString(array2));
		 System.out.println(array.length);  //至于拆除多少个array 元素 要看字母有几个（除去末尾连续的字母）
		 System.out.println(Arrays.toString(array));
		 
		 String image = "1234.jpg";
		 String []arr = image.split("\\.");
		 image = System.currentTimeMillis() + "." + arr[1];
		 System.out.println(image);
		
	}

}

package api.day01;
/**
 * 
 * int indexOf(String str) 查找给定字符串在当前字符串的位置
 * 若返回值为-1 ，则表示当前字符串中不含有给定内容
 * 
 */

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "I love you Bella, but I cannot stay with you ";
		
		int num = str.indexOf("i");
		System.out.println(num);
		
		int num2 = str.indexOf("you");
		System.out.println("index: " + num2);   //里面如果有多个， 只返回第一个的第一个字母的位置
		
		//***********************************************************************
		
		/*
		 * 从指定的位置开始检索第一次出现给定字符的位置
		 */
		num2 = str.indexOf("you", 15);
		System.out.println(num2);
		
		
		String str2 = "wty19921119@gmail.com";
		int num3 = str2.indexOf("@");		
		int num4 = str2.lastIndexOf("@"); 
		System.out.println(num3 + " , " + num4);
		
		
		
		
	}

}

package api.day02;

import java.util.Scanner;

/**
 * 字符串支持正则表达式方法一：
 * boolean matches(String regex) 
 * 使用给定的正则表达式判断当前的字符串是否满足格式需要，满足则返回true.
 * 注意，该方法是做完全匹配验证的，无论是否添加正则表达式中的边界匹配符“^....$"都是做完全匹配验证的
 * @author pc
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter your website");
		String str = kb.next();
		String region = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		String email = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		
		String str2 = (str.matches(region))?"It is":"it isn't";
		System.out.println(str2);
		
		
	}

}

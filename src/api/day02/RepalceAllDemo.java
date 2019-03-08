package api.day02;
/**
 * String replaceAll(String regex, String str)
 * 将当前字符串中满足正则表达式的部分替换成为给定内容， 
 * @author pc
 *
 */
public class RepalceAllDemo {

	public static void main(String[] args) {

		String str = "abc123def456ghi";
		/*
		 * 将数字部分替换成为：”#NUMBER#"
		 */
		
		String str2 = str.replaceAll("[a-zA-Z]+", "#NUMBER#");
		System.out.println(str2);
		
	}

}

package api.day01;

/**
 * 字符串是不变对象，内容一旦创建，若改变一定会创建新对象
 * 
 * @author pc
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "abc123";
		String s2 = "abc123";  
		System.out.println(s1 == s2);   //表示 s1 s2 指向的是同一个对象
		
		 s2 = "abc123"+ "!";  //只要改变字符串 则默认为创建一个新的对象
		
		System.out.println(s1 == s2);
		
		
		String str4 = new String("abc123"); //这个地方是一定要创建新的对象， 地址不同了
		System.out.println(str4 == s1);   //false 
		System.out.println(str4.equals(s1));
		
	}

}

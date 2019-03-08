package api.day01;

public class Test {

	public static void main(String[] args) {
               
		String str = getHostName("www.baidu.com");
		
		System.out.println(str);
		
		str = getHostName("http://www.tedu.cn");
		
		System.out.println(str);
		                // 0123456789012345
		str = getHostName("www.tedu.com.cn");
		
		System.out.println(str);
	}
	
	public static String getHostName(String str) {
		
		int x = str.indexOf(".");
		int y = str.indexOf(".", x+1);
		
		return str.substring(x+1, y);
	}
	
	

}

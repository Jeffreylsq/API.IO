package api.day01;
/*
 * String substring (int start , int end)
 * 截取当前字符串指定范围内的字符串
 * 
 * java api 有一个特点： 通常两个数字表示范围时， 都是“含头不含尾”
 */
public class SubstringDemo {

	public static void main(String[] args) {
//两个参数		          01234567890
		String str = "www.tedu.cn";
		String str2 = str.substring(4, 8);
		System.out.println(str2);
		
//一个参数
		String str3 = str.substring(4);
		System.out.println(str3);     //从4这个位置截到最后
		
		
		
	}

}

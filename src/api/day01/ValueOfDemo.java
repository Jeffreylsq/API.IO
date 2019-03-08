package api.day01;
/**
 * static String valueOf()
 * 字符串提供了很多个重载的valueOf方法， 作用是将给定的内容转化为字符串
 * 常用的是将基本类型转化为字符串
 * @author pc
 *
 */
public class ValueOfDemo {

	public static void main(String[] args) {

		int a = 10;
		char b = 'r';
		boolean f = false;
		String ff = String.valueOf(f);
		String aa = String.valueOf(a);
		String x = String.valueOf(b);
		System.out.println(ff);
		System.out.println(aa + " , " + x);
	}

}



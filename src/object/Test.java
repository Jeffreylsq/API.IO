package object;

import java.util.Arrays;

/**
 * 测试重写
 * @author pc
 *
 */
public class Test {

	public static void main(String[] args) {

		Point p = new Point(1,2);
		
		/**
		 * Object 提供了toString()方法，意义是将该对象转换成为一个字符串
		 * object 已经实现了该方法，返回的字符串内容为对象的句柄（类名@地址）或称为对象的引用
		 */
		
		 System.out.println(p);
		 
		 /*
		  * System.out.println(Object O)
		  * 该方法就是将给定对象的toString方法返回的字符串输出到控制台
		  */
		 
		 /**
		  * 字符串与引用类型变量连接时， 也是先调用其 toString 方法在与字符串连接的
		  */
		 System.out.println(p);
		
		/**
		 * Object提供equals方法 定义为：
		 * boolean euqals（Object obj)
		 * 设计意图是比较当前对象与参数对象内容是否相同， 但是Object实现这个方法时，内部用 this== obj，
		 * 进行判定的， 所以不重写这个方法没有意义
		 * 
		 * 
		 */
		
		Point p2 = new Point(1,2);
		System.out.println( p == p2);  // false
		System.out.println(p.equals(p2));  //按理说应该是true ,但是我们创建的类 还没有重写 equals 所以是false的
 		
		/**
		 * 对于类型变量而言， 由于保存的是地址，所以 ”==“ 做值比较时，比较的是两个变量指向的是否为”同一个对象“
		 * 而equals比较的是两个对象的内容是否相同
		 * 
		 * java提供的类很多都已经重写了equals方法， 比如String
		 * 
		 * 
		 */
	}

}

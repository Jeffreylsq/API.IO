package api.day01;


/**
 * 文档注释，是一个功能级注释，用来说明一个类的功能，方法的功能，常量的功能，而不是说明某一句话的功能
 * 
 * 在类上使用， 用来描述当前类的设计意图，功能等
 * 
 *@author  Jeffrey Wei
 *@version 1.0            整数部分大的功能性的更新， 小数部分不影响功能，修复性的改变，本质功能没有改变
 *@since   JDK1.0         基于哪个版本开始开发的（java是向下兼容的） 
 *@see     java.lang.String       参考其他资源 (非必需）
 */
public class Demo {

	/**
	 * sayHello 中使用的问候语
	 */
	
	public final static String INFO = "Hello";
	
	
	
	
	/**
	 * 为指定用户添加一个问候语
	 * 
	 * @param name     给定用户的名字   
	 * @return         含有问候语的字符串
	 * 
	 */

	public String sayHello(String name) {
		
		return INFO + name;
	}
	
	public static void main(String[] args) {
    
		 
	}

}

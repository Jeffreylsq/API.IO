package api.day01;
/**
 * 字符串不变的对象特性只针对字符串重用， 并没有考虑修改操作的性能， 因此string不适合频繁修改内容
 * 若有频繁操作修改， 使用StringBuilder 来完成， 他是专门用来修改字符串内容的，其提供了对字符串的内容编辑操作， 
 * 增 删 改 插 四种操作
 * @author pc
 *
 */

public class StringBuilderDemo {

	public static void main(String[] args) {

		String line = "好好学习java";
		StringBuilder sb = new StringBuilder(line);
		sb.append(",为了找个好工作!");
		line = sb.toString();
		System.out.println(line);
		
	    sb.replace( 9, sb.length()-1,"就是为了改变世界");
	    System.out.println(sb);
	    
	    sb.delete(8, sb.length());
	    System.out.println(sb);
	    
	    sb.insert(0,"Bella ");
	    System.out.println(sb.toString());
	    
	    sb.reverse();
	    System.out.println(sb.toString());
	    
	    
	    
		
	}

}

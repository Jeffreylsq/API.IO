package api.day03;
/**
 * 1.编写一段程序 计算1+2+3+4 +。。。。。100
 * 输出结果， 不得出现for while
 * 2. 买汽水问题， 1块钱 1瓶汽水，  2个空瓶可以换1瓶汽水，三个瓶盖可以换一瓶汽水，请问20块钱能买多少瓶汽水
 * 110多
 * 
 * 
 * 
 * 
 * 
 * @author pc
 *
 */
public class Recursion {

	public static void main(String[] args) {

		System.out.println(f(100));
		
		
	}
	
	public static int f(int n) {
		int num = 1;
		if(n <= 1) {
			
			return num;
		}
		 
		return n + f(n-1);
	}

}

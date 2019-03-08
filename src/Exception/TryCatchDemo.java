package Exception;
/**
 * 异常处理机制 try - catch
 * 语法：
 * try{
 * 
 *   代码片段
 *   
 *   }catch(xxxException e){
 *   
 *     解决try代码片段中出现xxxException的处理代码
 *   }
 * 
 * 
 */
public class TryCatchDemo {

	public static void main(String[] args) {

		System.out.println("Program start");
		try {
			String str = "1";
		System.out.println(str.length());
		char ch  = str.charAt(0);
		System.out.println(Integer.parseInt(str));
		
		/*
		 * try 语句块中如果某句代码抛出了异常，那么try语句块中该句代码后面的内容都不会被执行
		 */
		
		//只要某句话报异常， try里面报错的这句话下面的语句不输出
		System.out.println("!!!!!!!!!!!");
		}catch(NullPointerException e) {
			System.out.println("出现空指针");
			
			
			/*
			 * catch 可以定义多个，针对不同异常有不同处理方式时，我们可以分别捕获这些异常并进行处理
			 */
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("下标越界");
			
			/*
			 * 可以在最后一个catch捕获Exception,避免因为一个未捕获的异常导致程序中断
			 * 
			 * 
			 */
		}catch(Exception e) {
			System.out.println("反正就是出了个错");
		}
		
		
		
		System.out.println("Done");
		
	}

}

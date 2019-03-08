package Exception;

/**
 * finally 块是异常处理机制的最后一块，可以直接跟在try或最后一个catch之后，
 * finally可以保证只要代码执行到try当中，无论try语句块中的代码是否抛出异常，finally块中的内容都必定执行
 * 
 * 所以我们通常将释放资源这类操作放在这里确保运行
 * @author 
 *
 */
public class FinallyDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		
		try {
          String str = "";
          System.out.println(str.length());
          return;
		}catch(Exception e) {
			System.out.println("Exception happen");
		}finally {
			System.out.println("finally---------------");
		}
		System.out.println("finish");
	}

}

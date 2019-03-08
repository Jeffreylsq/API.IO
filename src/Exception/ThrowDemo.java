package Exception;

public class ThrowDemo {

	public static void main(String[] args) {

		 Person p  = new Person();
		 try {
			 
			 /*
			  *当我们调用一个含有throws声明异常抛出的方法时，编译器要求我们必须处理异常
			  *而处理异常的方式有两种：
			  *1：使用try - catch 捕获并处理抛出的异常类型 
			  * 2.在当前方法上继续使用throws声明抛出异常，具体使用哪种，结合实际业务需求而定
			  */
			p.setAge(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println(p.getAge());
	}

}

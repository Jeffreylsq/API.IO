package Exception;
/**
 * 
 * 使用这个类测试异常的抛出
 * @author pc
 *
 */
public class Person {

	private int age;

	public int getAge() {
		return age;
	}
/**
 * 通常一个方法中使用throw抛出什么异常，就要在方法声明时使用throws生命这个异常的抛出， 只有RuntimeException 是个例外
 * @param age
 * @throws Exception
 */
	public void setAge(int age)throws Exception {   //上面必须也要抛相同的异常让调用该方法的人看见这个方法会报异常
		if(age<0 || age > 120) {
			
			/*
			 * 使用throw关键字可以对外抛出一个异常
			 * 
			 */
			throw new Exception("你家寿命超过120岁啊");      //我自己抛了个异常
		}
		this.age = age;
	}
	
	
}

package Exception;
/**
 * 
 * ʹ�����������쳣���׳�
 * @author pc
 *
 */
public class Person {

	private int age;

	public int getAge() {
		return age;
	}
/**
 * ͨ��һ��������ʹ��throw�׳�ʲô�쳣����Ҫ�ڷ�������ʱʹ��throws��������쳣���׳��� ֻ��RuntimeException �Ǹ�����
 * @param age
 * @throws Exception
 */
	public void setAge(int age)throws Exception {   //�������ҲҪ����ͬ���쳣�õ��ø÷������˿�����������ᱨ�쳣
		if(age<0 || age > 120) {
			
			/*
			 * ʹ��throw�ؼ��ֿ��Զ����׳�һ���쳣
			 * 
			 */
			throw new Exception("�����������120�갡");      //���Լ����˸��쳣
		}
		this.age = age;
	}
	
	
}

package Exception;

public class ThrowDemo {

	public static void main(String[] args) {

		 Person p  = new Person();
		 try {
			 
			 /*
			  *�����ǵ���һ������throws�����쳣�׳��ķ���ʱ��������Ҫ�����Ǳ��봦���쳣
			  *�������쳣�ķ�ʽ�����֣�
			  *1��ʹ��try - catch ���񲢴����׳����쳣���� 
			  * 2.�ڵ�ǰ�����ϼ���ʹ��throws�����׳��쳣������ʹ�����֣����ʵ��ҵ���������
			  */
			p.setAge(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println(p.getAge());
	}

}

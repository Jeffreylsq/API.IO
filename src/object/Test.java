package object;

import java.util.Arrays;

/**
 * ������д
 * @author pc
 *
 */
public class Test {

	public static void main(String[] args) {

		Point p = new Point(1,2);
		
		/**
		 * Object �ṩ��toString()�����������ǽ��ö���ת����Ϊһ���ַ���
		 * object �Ѿ�ʵ���˸÷��������ص��ַ�������Ϊ����ľ��������@��ַ�����Ϊ���������
		 */
		
		 System.out.println(p);
		 
		 /*
		  * System.out.println(Object O)
		  * �÷������ǽ����������toString�������ص��ַ������������̨
		  */
		 
		 /**
		  * �ַ������������ͱ�������ʱ�� Ҳ���ȵ����� toString ���������ַ������ӵ�
		  */
		 System.out.println(p);
		
		/**
		 * Object�ṩequals���� ����Ϊ��
		 * boolean euqals��Object obj)
		 * �����ͼ�ǱȽϵ�ǰ������������������Ƿ���ͬ�� ����Objectʵ���������ʱ���ڲ��� this== obj��
		 * �����ж��ģ� ���Բ���д�������û������
		 * 
		 * 
		 */
		
		Point p2 = new Point(1,2);
		System.out.println( p == p2);  // false
		System.out.println(p.equals(p2));  //����˵Ӧ����true ,�������Ǵ������� ��û����д equals ������false��
 		
		/**
		 * �������ͱ������ԣ� ���ڱ�����ǵ�ַ������ ��==�� ��ֵ�Ƚ�ʱ���Ƚϵ�����������ָ����Ƿ�Ϊ��ͬһ������
		 * ��equals�Ƚϵ�����������������Ƿ���ͬ
		 * 
		 * java�ṩ����ܶ඼�Ѿ���д��equals������ ����String
		 * 
		 * 
		 */
	}

}

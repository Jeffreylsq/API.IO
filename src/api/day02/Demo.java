package api.day02;

import java.util.Scanner;

/**
 * �ַ���֧��������ʽ����һ��
 * boolean matches(String regex) 
 * ʹ�ø�����������ʽ�жϵ�ǰ���ַ����Ƿ������ʽ��Ҫ�������򷵻�true.
 * ע�⣬�÷���������ȫƥ����֤�ģ������Ƿ����������ʽ�еı߽�ƥ�����^....$"��������ȫƥ����֤��
 * @author pc
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter your website");
		String str = kb.next();
		String region = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		String email = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		
		String str2 = (str.matches(region))?"It is":"it isn't";
		System.out.println(str2);
		
		
	}

}

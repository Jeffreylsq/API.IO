package api.day01;
/**
 * 
 * int indexOf(String str) ���Ҹ����ַ����ڵ�ǰ�ַ�����λ��
 * ������ֵΪ-1 �����ʾ��ǰ�ַ����в����и�������
 * 
 */

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "I love you Bella, but I cannot stay with you ";
		
		int num = str.indexOf("i");
		System.out.println(num);
		
		int num2 = str.indexOf("you");
		System.out.println("index: " + num2);   //��������ж���� ֻ���ص�һ���ĵ�һ����ĸ��λ��
		
		//***********************************************************************
		
		/*
		 * ��ָ����λ�ÿ�ʼ������һ�γ��ָ����ַ���λ��
		 */
		num2 = str.indexOf("you", 15);
		System.out.println(num2);
		
		
		String str2 = "wty19921119@gmail.com";
		int num3 = str2.indexOf("@");		
		int num4 = str2.lastIndexOf("@"); 
		System.out.println(num3 + " , " + num4);
		
		
		
		
	}

}

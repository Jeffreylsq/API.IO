package api.day01;

/**
 * �ַ����ǲ����������һ�����������ı�һ���ᴴ���¶���
 * 
 * @author pc
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "abc123";
		String s2 = "abc123";  
		System.out.println(s1 == s2);   //��ʾ s1 s2 ָ�����ͬһ������
		
		 s2 = "abc123"+ "!";  //ֻҪ�ı��ַ��� ��Ĭ��Ϊ����һ���µĶ���
		
		System.out.println(s1 == s2);
		
		
		String str4 = new String("abc123"); //����ط���һ��Ҫ�����µĶ��� ��ַ��ͬ��
		System.out.println(str4 == s1);   //false 
		System.out.println(str4.equals(s1));
		
	}

}

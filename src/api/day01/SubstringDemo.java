package api.day01;
/*
 * String substring (int start , int end)
 * ��ȡ��ǰ�ַ���ָ����Χ�ڵ��ַ���
 * 
 * java api ��һ���ص㣺 ͨ���������ֱ�ʾ��Χʱ�� ���ǡ���ͷ����β��
 */
public class SubstringDemo {

	public static void main(String[] args) {
//��������		          01234567890
		String str = "www.tedu.cn";
		String str2 = str.substring(4, 8);
		System.out.println(str2);
		
//һ������
		String str3 = str.substring(4);
		System.out.println(str3);     //��4���λ�ýص����
		
		
		
	}

}

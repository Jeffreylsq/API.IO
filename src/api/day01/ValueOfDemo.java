package api.day01;
/**
 * static String valueOf()
 * �ַ����ṩ�˺ܶ�����ص�valueOf������ �����ǽ�����������ת��Ϊ�ַ���
 * ���õ��ǽ���������ת��Ϊ�ַ���
 * @author pc
 *
 */
public class ValueOfDemo {

	public static void main(String[] args) {

		int a = 10;
		char b = 'r';
		boolean f = false;
		String ff = String.valueOf(f);
		String aa = String.valueOf(a);
		String x = String.valueOf(b);
		System.out.println(ff);
		System.out.println(aa + " , " + x);
	}

}



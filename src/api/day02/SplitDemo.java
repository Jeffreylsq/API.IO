package api.day02;

import java.util.Arrays;

/**
 * �ַ���֧��������ʽ����2��
 * String [] split(String regx)
 * ����ǰ�ַ�����������������ʽҪ��Ĳ��־��в�֣�������ֳ������ݷ���
 * @author pc
 *
 */
public class SplitDemo {

	public static void main(String[] args) {

		 String str = "asd13sad21sda44va";
		 String [ ]array2 = str.split("[0-9]+");
		 
		 /*
		  * ���ʱ��������û������ʱ�����ֳ����ַ���
		  */
		 String [] array = str.split("[a-zA-Z]");     //����ĩβ�����Ŀմ�ȫ�����Բ�Ҫ
		 System.out.println(Arrays.toString(array2));
		 System.out.println(array.length);  //���ڲ�����ٸ�array Ԫ�� Ҫ����ĸ�м�������ȥĩβ��������ĸ��
		 System.out.println(Arrays.toString(array));
		 
		 String image = "1234.jpg";
		 String []arr = image.split("\\.");
		 image = System.currentTimeMillis() + "." + arr[1];
		 System.out.println(image);
		
	}

}

package api.day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * �ַ���
 * java�������ն�д���ݵĵ�λ���ֳ������ࣺ
 * 
 * �ֽ����� ���ֽ�Ϊ��λ��д���ݣ� ���ࣺInputStream, OutputStream 
 * �ַ����� ���ַ�Ϊ��λ��д���ݣ� ���ࣺReader��Writer
 * 
 * �ַ����ײ�ʵ�ʻ��ǰ����ֽ���ʽ��д�������ַ����ֽڵ�ת��
 * �����ַ���������ɣ������ַ���ֻ�ʺ϶�д�ı�����
 * 
 * 
 * ת������
 * java.io.OutputStreamWriter
 * java.io.InputStreamReader
 * ת������һ�Ը߼������ǿ����������ֽ����ϵ��ַ����� ʵ��Ӧ���е����Ƕ�д�ı�����ʱͨ������ֱ�Ӳ�������������������������ӵ����Ƿǳ���Ҫ��һ��
 * 
 * @author pc
 *
 */

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {

		 FileOutputStream fos = new FileOutputStream("fos.txt");
		 /*
		  * �����ָ���ڶ������������ǰ���ϵͳĬ���ַ�����д�����ı�����ת��Ϊ�ֽڣ�
		  * ָ������ָ�����ַ���ת��
		  * 
		  * 
		  */
		 OutputStreamWriter osw = new OutputStreamWriter(fos);
		 
		osw.write("�� �������廢�Ͻ��� �ҽ����� ���콫���� �캺��̫��");
		osw.write("������֮ս ���ܲܲ٣��ܲٸ�������");
		osw.write("��������");
		osw.close();
		
		
	}

}

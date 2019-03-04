package api.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * java.io.File
 * File��ÿһ��ʵ�����ڲ���ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * 
 * ʹ��File���ԣ�
 * 
 * 1.�������ʾ���ļ���Ŀ¼��������Ϣ
 * 2.������ɾ���ļ���Ŀ¼
 * 3.����һ��Ŀ¼����������
 * 
 * 
 * ���ǲ����ԣ�
 * �����ļ�����
 * @author pc
 *
 */
public class FileDemo {

	
	public static void main(String[] args) throws FileNotFoundException {
		
       	//	File file = new File("C:\\Users\\pc\\eclipse-workspace\\TEDU.API\\test.txt");
		/**
		 * ����ָ��·��ʱ��Ӧ��ָ�����·������Ϊ����·���ĸ���ͬ�Ĳ���ϵͳ�ǲ�ͬ�ģ������ڿ�ƽ̨��
		 * ���·���ĺô���������ϵͳ���죬���Ǿ����������Ҫ�������г���Ļ���������
		 * "./"������ǰĿ¼��
		 * ��eclipse�У�"./"ָ���ǵ�ǰ����������Ŀ��Ŀ¼
		 * 
		 */
		
		File file = new File("./test.txt");
		//��ȡ����
		String name = file.getName();
		System.out.println("File name: " + name);
		
		//��ȡ�ļ�����(�ֽ���)
		long length = file.length();
		System.out.println("Length: " + length);
		
		//�Ƿ�ɶ�
		boolean cr = file.canRead();
		//�Ƿ��д
		boolean cw = file.canWrite();
		System.out.println(cr);
		System.out.println(cw);
		
		//�Ƿ�����
		boolean ih = file.isHidden();
		System.out.println("Hidden file: " + ih);
		
		
		
		
		Scanner input = new Scanner(file);
		String line = input.nextLine();
		
		StringBuilder builder = new StringBuilder(line);
		builder.append(" Yes it is");
		System.out.println(builder.toString());
		
		
		
		
		
		
		
		
	}

}

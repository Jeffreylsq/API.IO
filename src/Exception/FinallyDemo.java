package Exception;

/**
 * finally �����쳣������Ƶ����һ�飬����ֱ�Ӹ���try�����һ��catch֮��
 * finally���Ա�ֻ֤Ҫ����ִ�е�try���У�����try�����еĴ����Ƿ��׳��쳣��finally���е����ݶ��ض�ִ��
 * 
 * ��������ͨ�����ͷ���Դ���������������ȷ������
 * @author 
 *
 */
public class FinallyDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		
		try {
          String str = "";
          System.out.println(str.length());
          return;
		}catch(Exception e) {
			System.out.println("Exception happen");
		}finally {
			System.out.println("finally---------------");
		}
		System.out.println("finish");
	}

}

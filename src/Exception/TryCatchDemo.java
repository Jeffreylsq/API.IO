package Exception;
/**
 * �쳣������� try - catch
 * �﷨��
 * try{
 * 
 *   ����Ƭ��
 *   
 *   }catch(xxxException e){
 *   
 *     ���try����Ƭ���г���xxxException�Ĵ������
 *   }
 * 
 * 
 */
public class TryCatchDemo {

	public static void main(String[] args) {

		System.out.println("Program start");
		try {
			String str = "1";
		System.out.println(str.length());
		char ch  = str.charAt(0);
		System.out.println(Integer.parseInt(str));
		
		/*
		 * try ���������ĳ������׳����쳣����ôtry�����иþ�����������ݶ����ᱻִ��
		 */
		
		//ֻҪĳ�仰���쳣�� try���汨�����仰�������䲻���
		System.out.println("!!!!!!!!!!!");
		}catch(NullPointerException e) {
			System.out.println("���ֿ�ָ��");
			
			
			/*
			 * catch ���Զ���������Բ�ͬ�쳣�в�ͬ����ʽʱ�����ǿ��Էֱ𲶻���Щ�쳣�����д���
			 */
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("�±�Խ��");
			
			/*
			 * ���������һ��catch����Exception,������Ϊһ��δ������쳣���³����ж�
			 * 
			 * 
			 */
		}catch(Exception e) {
			System.out.println("�������ǳ��˸���");
		}
		
		
		
		System.out.println("Done");
		
	}

}

package api.day01;
/**
 * �ַ�������Ķ�������ֻ����ַ������ã� ��û�п����޸Ĳ��������ܣ� ���string���ʺ�Ƶ���޸�����
 * ����Ƶ�������޸ģ� ʹ��StringBuilder ����ɣ� ����ר�������޸��ַ������ݵģ����ṩ�˶��ַ��������ݱ༭������ 
 * �� ɾ �� �� ���ֲ���
 * @author pc
 *
 */

public class StringBuilderDemo {

	public static void main(String[] args) {

		String line = "�ú�ѧϰjava";
		StringBuilder sb = new StringBuilder(line);
		sb.append(",Ϊ���Ҹ��ù���!");
		line = sb.toString();
		System.out.println(line);
		
	    sb.replace( 9, sb.length()-1,"����Ϊ�˸ı�����");
	    System.out.println(sb);
	    
	    sb.delete(8, sb.length());
	    System.out.println(sb);
	    
	    sb.insert(0,"Bella ");
	    System.out.println(sb.toString());
	    
	    sb.reverse();
	    System.out.println(sb.toString());
	    
	    
	    
		
	}

}

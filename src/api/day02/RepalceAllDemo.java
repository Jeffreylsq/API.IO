package api.day02;
/**
 * String replaceAll(String regex, String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻��Ϊ�������ݣ� 
 * @author pc
 *
 */
public class RepalceAllDemo {

	public static void main(String[] args) {

		String str = "abc123def456ghi";
		/*
		 * �����ֲ����滻��Ϊ����#NUMBER#"
		 */
		
		String str2 = str.replaceAll("[a-zA-Z]+", "#NUMBER#");
		System.out.println(str2);
		
	}

}

package api.day03;
/**
 * 1.��дһ�γ��� ����1+2+3+4 +����������100
 * �������� ���ó���for while
 * 2. ����ˮ���⣬ 1��Ǯ 1ƿ��ˮ��  2����ƿ���Ի�1ƿ��ˮ������ƿ�ǿ��Ի�һƿ��ˮ������20��Ǯ�������ƿ��ˮ
 * 110��
 * 
 * 
 * 
 * 
 * 
 * @author pc
 *
 */
public class Recursion {

	public static void main(String[] args) {

		System.out.println(f(100));
		
		
	}
	
	public static int f(int n) {
		int num = 1;
		if(n <= 1) {
			
			return num;
		}
		 
		return n + f(n-1);
	}

}

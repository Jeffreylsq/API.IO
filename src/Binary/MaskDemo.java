package Binary;

public class MaskDemo {

	public static void main(String[] args) {

		int n = 0x69e352ba;
		int m = 0xff;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		
		// 00111110 01011010 11100101 11110001
		int n1 = 0x3e5ae5f1;
		int m1 = 0xfff;
		int k1 = n1&m1;
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(m1));
		System.out.println(Integer.toBinaryString(k1));
		
		int m2 = 0x3f;
		System.out.println(Integer.toBinaryString(m2));
		System.out.println(Integer.toBinaryString(m2&k1));
		
		int m3 = 0xffff;
		System.out.println(Integer.toBinaryString(m3&n1));
	}

}

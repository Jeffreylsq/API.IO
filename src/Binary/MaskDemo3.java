package Binary;

public class MaskDemo3 {

	public static void main(String[] args) {

		int n = 0x9d;
		int m = 0x9f00;
		int k = n|m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		
		
	}

}

package Binary;

public class MaskDemo2 {

	public static void main(String[] args) {

		//01101110 10000111 10101001 11110111
		
		int n = 0x6e87a9f7;
		int k = n>>>1;
		int g = n>>>2;
		int m = n>>>8;
		
		int x = (n>>>8)&0xff;
		
		int b1 = (n>>>24)&0xff;
		int b2 = (n>>>16)&0xff;
		int b3 = (n>>>8) &0xff;
		int b4 = (n)&0xff;
		
		
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(g));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b4));
	}

}

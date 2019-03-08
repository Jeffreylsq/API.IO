package Binary;

public class MaskDemo4 {

	public static void main(String []args) {
		
		int b1 = 0x6e;
		int b2 = 0x87;
		int b3 = 0xa9;
		int b4 = 0xf7;
		
		int m = b1<<24|b2<<16|b3<<8|b4;
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(m));
		
		
		
	}
}

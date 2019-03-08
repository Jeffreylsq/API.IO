package Binary;

public class Demo {

	public static void main(String[] args) {

		int x = 0x45ac9d6a;
		int m = 0xff;     //8bits mask
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(x&m));
		
		int m2 = 0x1f;    //5bits mask
		System.out.println(Integer.toBinaryString(m2&x));
		
		int m3 = 0xffff;
		System.out.println(Integer.toBinaryString(m3&x));
	}

}

package Binary;

public class Demo3 {

	public static void main(String[] args) {

		
		int max = Integer.MAX_VALUE;
		
		System.out.println(Integer.toBinaryString(max));
		
		int min = Integer.MIN_VALUE;
		
		System.out.println(Integer.toBinaryString(min));
		System.out.println(Integer.toBinaryString(1000));
	
		long start = System.currentTimeMillis();
		int x = 78;
		int a = 78;
		
		System.out.println((System.currentTimeMillis()-start));
		
		
		
		System.out.println(~100 +1);
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toBinaryString(~100));
		
		System.out.println(~80);
		
		int n = 0x69e352ba;
		int m = 0xff;
		int k = n*m;
		System.out.println(Integer.toBinaryString(k));
	}

}

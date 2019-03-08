package Binary;

public class Demo01 {

	public static void main(String[] args) {

		int n = 50;  //110010
		//将n在内存中2进制形式转换为字符串
		System.out.println(Integer.toBinaryString(4324));
		
		for(int i = 0  ; i <= 200; i ++) {
			
			System.out.println(Integer.toBinaryString(i) + " " + i);
		}
		
	}

}

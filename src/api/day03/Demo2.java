package api.day03;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		int [] num = { 1,3,4,5,6,7};
		int [] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		
		int[]array = Arrays.copyOf(num,num.length);
		int[]array2 = Arrays.copyOf(array, array.length+1);
		
		System.out.println(Arrays.toString(array2));
	}

}

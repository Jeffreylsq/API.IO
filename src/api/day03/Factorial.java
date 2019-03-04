package api.day03;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(f(100));
	}
	
	public static int f(int n) {
		
	     int num = 1;
	     if( n<=1) {
	    	 
	    	 return num;
	     }
		
		
		return f(n - 1)+ n;
	}

}

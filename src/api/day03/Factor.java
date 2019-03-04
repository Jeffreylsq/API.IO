package api.day03;

public class Factor {

	public static void main(String[] args) {

		System.out.println(f(20,0,0));
	}
	
	
	public static int f(int money , int bottle, int cap) {
		
		     bottle = money + bottle;
		     cap = money + cap;
		     
		     if(bottle/2 + cap/3 == 0) {
		    	 
		    	 return money;
		     }
		     
		     return money + f((bottle/2+cap/3), bottle%2, cap%3 );
		
	}

}

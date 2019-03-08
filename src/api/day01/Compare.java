package api.day01;

public class Compare {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("A");
		
		for(int i = 0 ; i < 1000000000; i++) {
			
			builder.append("A");
		}
		System.out.println("Finish");
	}

}

package api.day02;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		String s = "asaDDSsrfDDS";
		System.out.println(get(s));
	}
	public static String get(String str)
	{
		StringBuilder build = new StringBuilder();
		
		for(int i = 0 ;  i < str.length() ; i++)
		{
			char a = str.charAt(i);
			if(Character.isUpperCase(a)) {
				build.append(Character.toLowerCase(a));
			}
			else if(Character.isLowerCase(a)) {
				build.append(Character.toUpperCase(a));
			}
		}
		return build.toString();
	}

}

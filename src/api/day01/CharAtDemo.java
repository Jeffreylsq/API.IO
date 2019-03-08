package api.day01;
/**
 * char charAt(int index)
 * 返回指定位置的对应字符
 * @author pc
 *
 */
public class CharAtDemo {

	public static void main(String[] args) {
		            //0123456789012345
		String str = "Thinking in java";
		
		char c = str.charAt(9);
		System.out.println(c);
		
		String  line = "上海自来水来自海上";
		boolean flag = true;
		for(int i = 0 ; i < line.length()/2 ; i++)
		{
			char a = line.charAt(i);
			char b = line.charAt(line.length()-1 -i);
			if(a!=b) {
				flag = false;
				break;
			}
		}
		String s = (flag)?"Yes":"NO";
		System.out.println(s);
		
	}

}

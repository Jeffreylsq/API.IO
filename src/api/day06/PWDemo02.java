package api.day06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 流连接中使用pw
 * 
 * @author pc
 *
 */
public class PWDemo02 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("pw.txt");
		OutputStreamWriter  osw  = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("怒发冲冠凭栏处 潇潇雨歇");
		pw.println("抬望眼仰天长啸壮怀激烈");
		
		System.out.println("Finish");
		pw.close();
		
		
		
	}

}

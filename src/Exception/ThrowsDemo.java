package Exception;

import java.awt.AWTException;
import java.io.IOException;

/**
 * ������д���ຬ��throws�����쳣�׳��ķ���ʱ��throws����д����
 * @author pc
 *
 */
public class ThrowsDemo {

	
	public void dosome()throws IOException, AWTException{
		
	}

}

class Son extends ThrowDemo{
	
	
/*   //��ͬ�϶�һ��
	public void dosome()throws IOException, AWTException{
		
	}
	
*/
	//������׳������쳣
	public void dosome()throws AWTException{
		
	}
	
    //ɶҲ����
	public void dosome() {
		
	}
	
    //�׳������쳣�������쳣
	public void dosome()throws FileNotFoundException{
		
	}
	//����������
     //�������׳������쳣
	public void dosome()throws SQLException{
		
	}
	
   //�������׳����෽���׳��쳣�ĸ������쳣
	public void dosome()throws Exception{
		
	}

	
}
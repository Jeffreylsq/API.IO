package Exception;

import java.awt.AWTException;
import java.io.IOException;

/**
 * 子类重写父类含有throws声明异常抛出的方法时，throws的重写规则
 * @author pc
 *
 */
public class ThrowsDemo {

	
	public void dosome()throws IOException, AWTException{
		
	}

}

class Son extends ThrowDemo{
	
	
/*   //相同肯定一样
	public void dosome()throws IOException, AWTException{
		
	}
	
*/
	//子类仅抛出部分异常
	public void dosome()throws AWTException{
		
	}
	
    //啥也不抛
	public void dosome() {
		
	}
	
    //抛出父类异常的子类异常
	public void dosome()throws FileNotFoundException{
		
	}
	//不允许的情况
     //不允许抛出额外异常
	public void dosome()throws SQLException{
		
	}
	
   //不允许抛出父类方法抛出异常的父类型异常
	public void dosome()throws Exception{
		
	}

	
}
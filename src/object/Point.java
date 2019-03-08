package object;

/**
 * 使用当前类测试object的相关方法
 * @author pc
 *
 */
public class Point {

	private int x;
	private int y;
	
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		
		if(x < 0 ||x > 120)
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

    /**
     * 重写toString(）方法
     * 通常我们自己定义的toString()的方法被调用，就应当重写该方法，重写没有固定要求，原则上返回的字符串中应当包含当前对象的
     * 信息	
     */
	public String toString() {
		
		return "( " + x + " , " + y +" )";
		
	}
	
	/**
	 * 重写object提供的equals方法
	 * 判断当前对象与参数的内容是否相同
	 * 判断内容实际上就是判断属性值， 但没有要求所有属性的值都相同才认定为相同，可结合实际需求而定
	 * 
	 */
	
/*	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(obj instanceof Point) {
			Point p = (Point)obj;
			return p.x == this.x && p.y == this.y;
		}
		return false;
	}
	
	
	*/
	
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(obj instanceof Point) {
			
			Point p = (Point)obj;
			return p.x == this.x && p.y == this.y;
		}
		return false;
	}
	
	
	
	 
}

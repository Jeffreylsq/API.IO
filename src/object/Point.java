package object;

/**
 * ʹ�õ�ǰ�����object����ط���
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
     * ��дtoString(������
     * ͨ�������Լ������toString()�ķ��������ã���Ӧ����д�÷�������дû�й̶�Ҫ��ԭ���Ϸ��ص��ַ�����Ӧ��������ǰ�����
     * ��Ϣ	
     */
	public String toString() {
		
		return "( " + x + " , " + y +" )";
		
	}
	
	/**
	 * ��дobject�ṩ��equals����
	 * �жϵ�ǰ����������������Ƿ���ͬ
	 * �ж�����ʵ���Ͼ����ж�����ֵ�� ��û��Ҫ���������Ե�ֵ����ͬ���϶�Ϊ��ͬ���ɽ��ʵ���������
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

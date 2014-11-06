package memoryGame;

public class Brick implements Comparable{

	int x;
	int y;
	String value;
	boolean hide;
	
	
	
	
	Brick(String Value)
	{
		this.value = Value;

	}
	Brick(int x, int y,String Value)
	{
		this.value = Value;
		this.x = x;
		this.y = y;
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public boolean isHide() {
		return hide;
	}
	public void setHide(boolean hide) {
		this.hide = hide;
	}




	
	public int compareTo(Object o) {
		return this.value.compareTo(((Brick) o).getValue());   
	}
	
}

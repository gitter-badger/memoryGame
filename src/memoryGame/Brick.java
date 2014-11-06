package memoryGame;

public class Brick implements Comparable<Brick> {

	private int x;
	private int y;
	private String brickValue;
	private boolean faceUp;

	Brick(String value) {
		this.brickValue = value;

	}

	Brick(int x, int y, String value) {
		this.brickValue = value;
		this.x = x;
		this.y = y;
		faceUp = false;

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
		return brickValue;
	}

	public void setValue(String value) {
		this.brickValue = value;
	}

	public boolean isHidden() {
		return faceUp;
	}

	public void setFaceUp(boolean hidden) {
		this.faceUp = hidden;
	}

	@Override
	public int compareTo(Brick o) {
		return this.brickValue.compareTo(((Brick) o).getValue());
	}

}

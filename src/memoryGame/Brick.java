package memoryGame;

/**
 * 
 * @author Amir
 *
 */
public class Brick implements Comparable<Brick> {

	private int x;
	private int y;
	private String brickValue;
	private boolean faceUp;

	/**
	 * default constructor for Brick
	 * 
	 * @param value
	 */
	Brick(String value) {
		this.brickValue = value;

	}

	/**
	 * constructor for Brick with coordinates where it is on the grid
	 * 
	 * @param x
	 * @param y
	 * @param value
	 */
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

	/**
	 * is the tile hidden or not?
	 * @return false if it is hidden and true if it is FaceUp
	 */
	public boolean isFaceUp() {
		return faceUp;
	}

	/**
	 * set to true when tile is changed. 
	 * @param hidden
	 */
	public void setFaceUp(boolean hidden) {
		this.faceUp = hidden;
	}

	/**
	 * Compares the value of the brick with the value of another brick. 
	 */
	@Override
	public int compareTo(Brick o) {
		return this.brickValue.compareTo(((Brick) o).getValue());
	}

}

package memoryGame;

import java.util.ArrayList;
import java.util.Collections;

public class Grid {
	
	private int sizeX, sizeY; // size of grid
	private Brick[][] gridOfBricks; //grid of bricks

	Grid(int sizeX,int sizeY) // constructor
	{
		gridOfBricks = new Brick[sizeX][sizeY];
		this.sizeX = sizeX; //number of rows
		this.sizeY = sizeY; //number of columns
		this.createGrid(); //creates grid and adds tiles to it
	}
	
	public void createGrid(){
		
		int numberOfBricks = sizeX * sizeY; //total number of bricks
		
		ArrayList <Brick> deckOfBricks = new ArrayList <Brick>(); //list of bricks to be shuffled
		
		for (int i = 0; i < numberOfBricks / 2; i++){ //loop start
			deckOfBricks.add(new Brick(""+i)); //creates two bricks with id 
			deckOfBricks.add(new Brick(""+i));
		} //loop end
		
		Collections.shuffle(deckOfBricks); // shuffles list
		
		int tilesAddedToGrid = 0; //number of bricks added to grid
		
		for (int i = 0; i < sizeX; i++){ // outer loop start
			for (int j = 0; j < sizeY; j++){ //inner loop start
			gridOfBricks[i][j] = deckOfBricks.get(tilesAddedToGrid); //adds brick to grid
			tilesAddedToGrid++; 
			} //inner loop  end
		} //outer loop end
		
	} //method createGrid end
	
	public Brick getBrick(int x, int y)
	{
		return gridOfBricks[x][y];	
	}
	
	public void showGrid()
	{
	
		for (int i = 0; i < sizeX; i++){ //outer loop start
			for (int j = 0; j < sizeY; j++){ //inner loop start
				
			if (gridOfBricks[i][j].isFaceUp() == false){ // if face down
				System.out.print("X ");
			}
			else if (gridOfBricks[i][j].isFaceUp() == true){ // if face up, get face value
				System.out.print(gridOfBricks[i][j].getValue()+" ");
			}
				
			} //inner loop end
			System.out.println(" "); // new line
		} //outer loop end	
		
	}
}

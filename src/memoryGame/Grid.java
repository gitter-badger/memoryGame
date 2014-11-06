package memoryGame;

import java.util.ArrayList;
import java.util.Collections;

public class Grid {
	
	private int sizeX, sizeY; // size of grid
	private Brick[][] myGridOfBriks = new Brick[sizeX][sizeY]; //grid of bricks

	Grid(int sizeX,int sizeY) // constructor
	{
		this.createGrid(sizeX, sizeY); //creates grid and adds tiles to it
	}
	
	public void createGrid(int sizeX, int sizeY){
		this.sizeX = sizeX; //number of rows
		this.sizeY = sizeY; //number of columns
		
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
			myGridOfBriks[i][j] = deckOfBricks.get(tilesAddedToGrid); //adds brick to grid
			tilesAddedToGrid++; 
			} //inner loop  end
		} //outer loop end
		
	} //method createGrid end
	
	public String getBrick(int x, int y)
	{
		return null;
		
	}
	
	public void showGrid()
	{
		
	}
}

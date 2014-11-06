package memoryGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class cmdRunner {

	public static void main(String[] args) {

		cmdRunner cmdRunner = new cmdRunner();
		cmdRunner.playMemo();

	}

	public void playMemo() {

		// initiate grid
		Grid grid = new Grid(4, 4);

		// show grid
		grid.showGrid();
		// Loop 2 times[
		for (int i = 0; i < 2; i++) {

			// input from user
			int[] coordinates = inputFromUser();

			// show tile
			
			grid.getBrick(coordinates[0], coordinates[1]).setHide(false);

			// show grid]
			grid.showGrid();
		
		}
	}

	public int[] inputFromUser() {

		System.out.println("What tile do you want to turn?");

		int[] coordinates = new int [2];
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("What row: ");
			coordinates[0] = scanner.nextInt() +1;
			System.out.print("What column: ");
			coordinates[1] = scanner.nextInt() +1;

		} catch (Exception e) {
			System.out.println("Wrong input " + e);
			// TODO: better errorsolving if input is incorrect
		}
		return coordinates;
	}
}

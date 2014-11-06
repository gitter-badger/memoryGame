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

			// show grid]
			grid.showGrid();
		
		}
	}

	public int[] inputFromUser() {

		System.out.println("What tile do you want to turn?");

		int[] coordinates = null;
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("What row: ");
			coordinates[0] = scanner.nextInt();
			System.out.print("What column: ");
			coordinates[1] = scanner.nextInt();

		} catch (Exception e) {
			System.out.println("Wrong input " + e);
			// TODO: better errorsolving if input is incorrect
		}
		return coordinates;
	}
}

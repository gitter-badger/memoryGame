package memoryGame;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cmdRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cmdRunner cmdRunner = new cmdRunner();
		cmdRunner.playMemo();

	}

	public void playMemo() {

		// initiate grid
		//Grid grid = new Grid(4, 4);

		// show grid

		// Loop 2 times[

		// input from user
		String input = inputFromUser();

		// show tile

		// show grid]

	}

	public String inputFromUser() {

		System.out.println("What tile do you want to turn?");

		String coordinates;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {

			coordinates = br.readLine();

		} catch (Exception e) {
			System.out.println("Wrong input " + e);
			coordinates = "empty";
			// TODO: better errorsolving if input is incorrect
		}

		return coordinates;
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hanoi {

	public static void main(String[] args) throws Exception {
		// Using BufferedReader for input
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Mr. Raffoul's Towers of Hanoi Solver!");
		System.out.print("How many discs you have on the starting pile? ");
		int numDiscs = Integer.parseInt(stdin.readLine());

		System.out.println();
		System.out.println("The following instructions will tell you how to move discs from one Column to another.");
		System.out.println("Assume that the starting column is Column 1.");
		System.out.println("Assume that the intermediate column is Column 2.");
		System.out.println("Assume that the final column is Column 3.");
		System.out.println();
		System.out.println("Move the discs as follows:");
		HanoiSolver(numDiscs, 1, 2, 3);
	}

	public static void HanoiSolver(int numDiscs, int startingColumn, int intermediateColumn, int finalColumn) {//startingColumn=rod where the disks are present, 
		//iColumn=rod where the disks to be moved, fColumn=the remaining rod
		if (numDiscs > 1)
			HanoiSolver(numDiscs - 1, startingColumn, finalColumn, intermediateColumn);
		
		System.out.println("Disc " + numDiscs + ": " + startingColumn + " -> " + finalColumn);//the last move? 
		
		if (numDiscs > 1)
			HanoiSolver(numDiscs - 1, intermediateColumn, startingColumn, finalColumn);
	}

}
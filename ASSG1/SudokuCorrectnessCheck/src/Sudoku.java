import java.util.Scanner;


public class Sudoku {
	public static void main(String []args){
		Check c = new Check();
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int numberOfRows = reader.nextInt();
		System.out.println("Give the sudoku entries ");
		int [][]sudokuArray = c.readSudoku(numberOfRows);
		int [][]solutionArray;
		System.out.println("Candidate Solution");
		if(c.checkConsistencyAtRead(sudokuArray) && !c.checkRepititionInRow(solutionArray = c.getSolutionArray()) && !c.checkRepititionInColoumn(solutionArray) 
				&& !c.checkRepititionInBlock(solutionArray))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

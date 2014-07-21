import java.util.Scanner;


public class Check {
	private int [][] solutionArray;
	private int sudokuArray[][];
	Scanner reader = new Scanner(System.in);
	
	public int[][] readSudoku(int numberOfRows){
		sudokuArray = new int [numberOfRows][numberOfRows];
		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfRows;j++){
				sudokuArray[i][j] = reader.nextInt();
			}
		}
		return sudokuArray;
	}
	
	public boolean checkConsistencyAtRead(int sudokuArray[][]){
		int n = sudokuArray[0].length;
		solutionArray = new int [n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int sudokuEntry = reader.nextInt();
				if(sudokuEntry <= n && sudokuEntry > 0 && sudokuArray[i][j] == sudokuEntry|| sudokuArray[i][j] == 0)
					solutionArray[i][j] = sudokuEntry;
				else
					return false;
			}
		}
		return true;
	}
	
	public boolean checkRepitition(int array[]){
		int n = array.length,count = 0;
		for(int i =1;i<=n;i++){
			count = 0;
			for(int j=0;j<n;j++){
				if(array[j]==i)
					count++;
			}
			if(count>1)
				return true;
		}
		return false;
	}
	
	public boolean checkRepititionInRow(int solutionArray[][]){
		int n = solutionArray[0].length;
		for(int i=0;i<n;i++){
			if(!checkRepitition(solutionArray[i]))
				continue;
			else
				return true;
		}
		return false;
	}
	
	public boolean checkRepititionInColoumn(int solutionArray[][]){
		int n = solutionArray[0].length;
		int []tempArray = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				tempArray[j] = solutionArray[j][i];
			}
			
			if(!checkRepitition(tempArray))
				continue;
			else
				return true;
		}
		return false;
	}
	
	public boolean checkRepititionInBlock(int solutionArray[][]){
		int n = solutionArray[0].length;
		int blockInterval = (int) Math.sqrt(n);
		int tempArray[] = new int[n];
		for(int i=0;i<=n-blockInterval;i=i+blockInterval){
			for(int j=0;j<=n-blockInterval;j=j+blockInterval){
				int localIncrementer=0;
				for(int k=0;k<blockInterval;k++){
					for(int l=0;l<blockInterval;l++){
						tempArray[localIncrementer] = solutionArray[i+k][j+l];
						localIncrementer++;
					}
				}
				
				if(!checkRepitition(tempArray))
					continue;
				else
					return true;
			}
		}
		return false;
	}
	
	public int[][] getSolutionArray(){
		return solutionArray;
	}
}

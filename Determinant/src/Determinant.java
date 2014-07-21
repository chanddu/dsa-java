import java.util.Scanner;


public class Determinant {
	private int matrix1[][];
	int matrix2[][];
	private int order;
	Scanner reader = new Scanner(System.in);
	
	public void setMatrix(){
		matrix1 = new int[order][];
		for(int i=0;i<order;i++){
			matrix1[i] = new int[order];
		}
		System.out.println("enter the elements of matrix row by row");
		for(int i=0;i<order;i++){
			for(int j=0;j<order;j++){
				matrix1[i][j] = reader.nextInt();
			}
		}
	}
	
	public void setOrder(){
		System.out.println("Enter the order of matrix");
		order = reader.nextInt();
	}
	
	public int getOrder(){
		return order;
	}
	
	public int[][] getMatrix(){
		return matrix1;
	}
	
	public int calcDet(int matrix[][],int order){
		int det;
		if(order==1){
			det = matrix[0][0];
		}
		else if(order==2){
			det = matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
		}
		else{
			det = 0;
			for(int i=0;i<order;i++){
				matrix2 = new int[order-1][];
				for(int j=0;j<order-1;j++){
					matrix2[j] = new int[order-1];
				}
				for(int k=0;k<order-1;k++){
					int x=0;
					for(int l=0;l<order;l++){
						if(l==i)
							continue;
						matrix2[k][x] = matrix[k+1][l];
						x++;
					}
				}
				det+=Math.pow(-1, i)*matrix[0][i]*calcDet(matrix2, order-1);
			}
			
		}
		return det;
	}
	
}

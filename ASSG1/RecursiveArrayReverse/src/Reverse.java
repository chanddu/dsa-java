import java.util.Scanner;


public class Reverse {
	private int array[];
	Scanner reader = new Scanner(System.in);
	@SuppressWarnings("unused")
	public void readArray(){
		int i = 0;
		System.out.println("Enter the size of array");
		int arraySize = reader.nextInt();
		array= new int[arraySize];
		System.out.println("Enter the array elements");
		for(int number:array){
			array[i] = reader.nextInt();
			i++;
		}
		
	}
	
	public int[] getArray(){
		return array;
	}
	
	public void printReverseArray(int array[]){
		for(int number:array){
			System.out.println(number);
		}
	}
	public int[] reverseArray(int array[],int startPosition,int endPosition){
		int temp;
		temp = array[startPosition];
		array[startPosition] = array[endPosition-startPosition-1];
		array[endPosition-startPosition-1] = temp;
		startPosition++;
		if(startPosition != endPosition/2)
			reverseArray(array, startPosition, endPosition);
		return array;
	}

}

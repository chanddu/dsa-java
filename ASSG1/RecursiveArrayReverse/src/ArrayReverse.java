

public class ArrayReverse {
	public static void main(String args[]){
		Reverse rev = new Reverse();
		rev.readArray();
		int array[] = rev.getArray();
		int[] reversedArray = rev.reverseArray(array, 0, array.length);
		rev.printReverseArray(reversedArray);
	}

}

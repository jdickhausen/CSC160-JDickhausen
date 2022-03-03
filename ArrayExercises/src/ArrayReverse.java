import java.lang.reflect.Array;

public class ArrayReverse {
	public static void main(String[] args) {
		int myArray [];
		myArray = new int [3];
		myArray[0] = 3;
		myArray[1] = 2;
		myArray [2] = 1;
		System.out.println(reverseValues(myArray, myArray));
	}
	public static int[] reverseValues(int [] myArray, int []secondArray) {
		secondArray = new int [3];
		for (int i = 0, j = myArray.length-1; i < myArray.length && j > 0; i++, j--) {
			secondArray[j]=i;
		}
		return secondArray;
	}
}



public class FindValue {

	public static void main(String[] args) {
		int [] myArray;
		myArray = new int [3];
		myArray[0] = 1;
		myArray[1] = 5;
		myArray [2] = 3;
		int num1 = 3;
		if (sameValue(myArray, num1)) {
			System.out.println("Value is in the array");
		}
		else {
			System.out.println("Value is not in the array");
		}
	}
	public static boolean sameValue(int[]myArray, int num1) {
		for(int i = 0; i < myArray.length; i++) {
			if (myArray[i] == num1) {
				return true;
			}
			else {;}
		}
		return false; 
	}
}

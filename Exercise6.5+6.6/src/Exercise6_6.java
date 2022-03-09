import java.util.Arrays;

public class Exercise6_6 {

	public static void main(String[] args) {
		String tiles = "aaaaazzzzzca";
		String scrabbleWord = "car";
		
		if (canSpell(tiles, scrabbleWord)) {
			System.out.print("It works");
		}
		else {
			System.out.print("It doesn't work");
		}
	}
	public static boolean canSpell(String givenWord, String tileLetters) {
		tileLetters = tileLetters.toLowerCase();
		givenWord = givenWord.toLowerCase();
		char[] myArray1 = givenWord.toCharArray();
		char[] myArray2= tileLetters.toCharArray();
		Arrays.sort(myArray1, 0, (myArray1.length));
		Arrays.sort(myArray2, 0, (myArray2.length));
		
		for (int i = 0; i < tileLetters.length() - givenWord.length();i++) {
			int index = myArray1[i];
			if (myArray1[i] == myArray2[i]) {
				i++;
			}
		}
		return true;
	}
}

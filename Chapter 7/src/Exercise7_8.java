import java.util.Arrays;

public class Exercise7_8 {


	public static void main(String[] args) {
		String firstWord = "pots";
		String secondWord = "stop";
		if(isAnogram(firstWord, secondWord)) {
			System.out.println("It is an anogram");
		}
		else {
			System.out.println("It is not an anogram");
		}
	}
	public static boolean isAnogram (String word1, String word2) {
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		char[] myArray1 = word1.toCharArray();
		char[] myArray2= word2.toCharArray();
		if (myArray1.length != myArray2.length) {
			return false;
		}
		Arrays.sort(myArray1, 0, (myArray1.length));
		Arrays.sort(myArray2, 0, (myArray2.length));
		
		for (int i = 0; i < word1.length();i++) {
				
				if (myArray1[i] != myArray2[i]) {
					return false;
				}
		}
		return true;
	}
}

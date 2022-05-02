import java.io.IOException;

public class StringKnowledge {
	public static void main(String[] args) throws IOException {
		String str = "abcdhiefghi";
		System.out.println(countHi(str));
		
		str = "12xy34";
		String word = "xy";
		System.out.println(plusOut(str, word));
	}
	public static int countHi (String str) {
		str = "abcdhiefghi";
		int count = 0;
		if (str.length() < 2) {
			return count;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
				count = count + 1;
			}
		}
		return count;
	}
	public static String plusOut(String str, String word) {
		str = "12xy34";
		word = "xy";
		
		String plusChar = "+";
		String newWord = "";
		int index = str.indexOf(word);
		while(index < str.length()) {
			index++;
			newWord = newWord + str.replace(str.substring(0, index), plusChar) + word;
		}
		return newWord;
	}
}

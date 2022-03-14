

public class Exercise6_6 {

	public static void main(String[] args) {
		String tiles = "aaaarazzzzzca";
		String word = "car";
		
		if (canSpell(tiles, word)) {
			System.out.print("It works");
		}
		else {
			System.out.print("It doesn't work");
		}
	}
	public static boolean canSpell(String tiles, String word) {
	
		word = word.toLowerCase();
		tiles = tiles.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			if (tiles.indexOf(word.charAt(i)) == -1) {
				return false;
			}
			else {
				int location = tiles.indexOf (word.codePointAt(i));
				tiles = tiles.substring(0, location) + tiles.substring(location + 1, tiles.length());
			}
		}
		return true;
	}
}

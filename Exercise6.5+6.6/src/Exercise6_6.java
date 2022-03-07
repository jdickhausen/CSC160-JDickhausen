
public class Exercise6_6 {

	public static void main(String[] args) {
		String tiles = "racecar";
		String scrabbleWord = "car";
		
		if (canSpell(tiles, scrabbleWord)) {
			System.out.print("It works");
		}
		else {
			System.out.print("It doesn't work");
		}
	}
	public static boolean canSpell(String scrabbleWord, String tiles) {
		for (int i = 0; i < scrabbleWord.length(); i++) {
			for (int j = 0; j < tiles.length(); j++) {
				if (scrabbleWord.charAt(i) == tiles.charAt(j)) {
					return true;
				}
				else {;}
			}
		}
		return false;
	}

}

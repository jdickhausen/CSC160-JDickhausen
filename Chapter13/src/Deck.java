import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] cards;
	private Random random = new Random();
	
	public Deck(int n) {
		this.cards = new Card[n];
	}
	
	public Card[] getCards() {
		return this.cards;
	}
	public String toString(int [] cards) {
		return Arrays.toString(this.cards);
	}
	public int randomInt (int low, int high) {
		return random.nextInt();
	}
	public void swapCards(int i, int j) {
		Card picked = cards[i];
		cards[i] = cards[j];
		cards[j] = picked;		
	}
	public void shuffle() {
		for (int i = 0; i < cards.length - 1; i++) {
			swapCards(i, randomInt (i, cards.length - 1));
		}
	}
	public int indexLowest (int low, int high) {
		
		
		return 0;
	}
}

import java.util.Arrays;
import java.util.Random;

public class Deck {
	public Card[] cards;
	private static final Random random = new Random();
	
	public Deck () {
		this.cards = new Card [52];
		int index = 0;
		for (int i = 0; i < 4; i ++) {
			for (int j = 1; j < 14; j++) {
				cards[index] = new Card(j, i);
				index++;
			}
		}
	}
	public Deck (int n) {
		this.cards = new Card[n];
	}
	public Deck subdeck(int start, int end) {
		Deck subdeck = new Deck (end - start +1);
		for (int i = start, j = 0; i <= end; i++, j++) {
			subdeck.cards[j] = this.cards[i];
		}
		return subdeck;
	}
	
	public String toString() {
		return Arrays.toString(this.cards);
	}
	public static int randomInt(int low, int high){
	      return random.nextInt(Math.max(high,low) - Math.min(high,low) + 1) + low;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public void swapCards (int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
	public void shuffle () {
		for (int i = 0; i < cards.length; i++) {
			int j = random.nextInt(cards.length);
			swapCards(i, j);
			
		}
	}
	public void selectionSort(int n) {
		for (int i = 0; i < n-1; i++){
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (cards[j].compareTo(cards[min_idx]) < 0) {
					min_idx = j;
				}
			}
			swapCards(min_idx, i);
		}
	}
}

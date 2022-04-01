import java.util.Arrays;

public class War {
	public static void main(String[] args) {
		Deck deck = new Deck();
		//System.out.println(deck);
		
		deck.shuffle();
		//System.out.print(deck);
		
		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0,25));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(26,51));
		
		//Pile mPile = new Pile();
		
		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			int diff = c1.getRank() - c2.getRank();
			if (diff > 0) {
				p1.addCard(c1);
				p1.addCard(c2);
			}
			if (diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
			}
		}
		if (p2.isEmpty()) {
			System.out.print("player 1 wins");
		}
		else {
			System.out.print("player 2 wins");
		}
	}

}

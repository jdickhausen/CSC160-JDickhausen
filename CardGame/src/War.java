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
		
		Pile mPile = new Pile();
		//mPile.addDeck(deck.subdeck());
		
		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			mPile.addCard(c1);
			mPile.addCard(c2);
		System.out.println(mPile.toString());
//			int diff = c1.getRank() - c2.getRank();
			if (c1.getRank() > c2.getRank()) {
				p1.addCard(c1);
				p1.addCard(c2);
			}
			else if (c1 .getRank() < c2.getRank()) {
				for(Card c: mPile.cards)
				{
					p2.addCard(mPile.popCard());
				}
			}
			//else {
  				
			//}
		}
		if (p2.isEmpty()) {
			System.out.print("player 1 wins");
		}
		else {
			System.out.print("player 2 wins");
		}
	}

}

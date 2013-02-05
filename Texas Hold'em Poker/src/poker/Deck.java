package poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> deck;
	private Random random;
	
	public Deck() {
		
		deck = new ArrayList<Card>(52);
		
		for (Suit suit : Suit.values() ) {
			for (Value value : Value.values()) {
				 deck.add (new Card(value, suit));
			}
		}
	}
}

package examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("javadoc")
public class Deck {
	
	// Fields
	final static int[] NUMBER_ARRAY = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			13 };
	
	final public ArrayList<Card> deck = new ArrayList<Card>();
	
	// Main
	public static void main (String[] args) {
		
		new Deck().run();
		
	}
	
	// Run method
	public void run () {
		
		// Creates deck
		createDeck();
		
		// Shuffles
		shuffle();
		
		// Deals cards
		for (int i = 0; i < 52; i++) {
			
			deal();
			
		}
		
	}
	
	public void deal () {
		
		// Sets card to the last card in the arrayList, mostly to increase speed and efficiency
		Card card = deck.get(deck.size() - 1);
		
		// Removes the last card, which is card
		deck.remove(deck.size() - 1);

		// Prints out message
		System.out.println("You got the " + card.number + " of " + card.suit
				+ "!");
		
	}
	
	public void shuffle () {
		
		// Uses collections.shuffle to shuffle the deck
		Collections.shuffle(deck);
		
	}
	
	public void createDeck () {
		
		// For each suit
		for (Suit suit : Suit.SUITS) {
			
			// For each number
			for (int i = 1; i <= 13; i++) {
				
				deck.add(new Card(i, suit));
				
			}
			
		}
		
	}
}

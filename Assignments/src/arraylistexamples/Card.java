package arraylistexamples;

@SuppressWarnings("javadoc")
public class Card {
	
	final public String cardName;
	
	final public Suit suit;
	
	final public int number;
	
	
	
	public Card (int number, Suit suit) {
		
		// Initializes fields
		this.number = number;
		switch (number) {
		
			case 1:
				this.cardName = "A";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				this.cardName = Integer.toString(number);
				break;
			case 11:
				this.cardName = "J";
				break;
			case 12:
				this.cardName = "Q";
				break;
			case 13:
				this.cardName = "K";
				break;
			default:
				this.cardName = "";
				
		}
		this.suit = suit;
		
	}
	
}

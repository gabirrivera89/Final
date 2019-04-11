
package CardGame;

import java.awt.Color;

import plumb.PCard;

public class Card extends PCard{
	private Rank rank;
	private Suite suite;
	private boolean faceCard = false;

	Card(Rank rank, Suite suite){
		this.rank = rank;
		this.suite = suite;
	}
	

	public String getRank() {
		return this.rank.getRepresentation();	
	}
	public Integer getValue() {
		return this.rank.getValue();	
	}
	public String getSuite() {
		return this.suite.getValue();	
	}
	
	

	public String getText()
	{
		return getRank() + getSuite();
	}


	public void showCard() {
		this.faceCard = false;
	}


	public void hideCard() {
		this.faceCard = true;
	}
	
	public boolean isHidden() {
		return this.faceCard;
	}


	public enum Suite{
		CLUBS("\u2663"),
		DIAMONDS("\u2666"),
		HEARTS("\u2665"),
		SPADES("\u2660");
		
		private String value;
		
		Suite(String value){
			this.value = value;
		}
		
		public String getValue() {
			return this.value;
		}
			
	}
	

	public Color getFontColor() {
     Color color = new Color(202, 57, 204);
	return color;
	}
	

	public Color getFaceColor() {
        Color color = new Color(196, 204, 122);
        return color;
        //	return Color.DARK_GRAY;
	}
	

	public Color getBackColor() {
        Color color = new Color(196, 204, 122);
        return color;
        //	return Color.DARK_GRAY;
	}


	public Color getBorderColor() {
		Color color = new Color(202, 57, 204);
		return color;
	}


	public Color getStripeColor() {
        Color color = new Color(202, 57, 204);
		return color;
	}

	public enum Rank{
		
		
		ACE("A", 1),
		TWO("2", 2),
		THREE("3", 3),
		FOUR("4", 4),
		FIVE("5", 5),
		SIX("6", 6),
		SEVEN("7", 7),
		EIGHT("8", 8),
		NINE("9", 9),
		TEN("10", 10),
		JACK("J", 10),
		QUEEN("Q", 10),
		//KNIGHT("C", 10),
		KING("K", 10);
		
		private String representation;
		private Integer value;
	
		Rank(String representation, Integer value) {
			this.representation = representation;
			this.value = value;
		}
		
		public Integer getValue() {
			return this.value;
		}
		
		public String getRepresentation() {
			return this.representation ;
		}
	}
	

}

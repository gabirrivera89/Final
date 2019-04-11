
package CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import plumb.PCard;
import plumb.PDeck;

public class Deck implements PDeck {

	List <PCard> myDeck = new ArrayList<PCard>();
	
	
	public Deck() {
		
			for(Card.Suite suite: Card.Suite.values()) {
				for(Card.Rank rank: Card.Rank.values()) {
				myDeck.add(new Card(rank, suite));
			
			}
		}
	}
	

	@Override
	public void shuffle() {
		
		Collections.shuffle(myDeck);
		System.out.println(" ");
	}

	@Override
	public void addCard(PCard card) {
		myDeck.add(card);
	}

	@Override
	public PCard dealCard() {
		
	PCard dealtCard;
	int index = myDeck.size()-1;
	
	//if(!myDeck.isEmpty()) {
		dealtCard = myDeck.get(index);
		myDeck.remove(dealtCard);
		return dealtCard;	
		
		
	}

    @Override
	public PCard dealHiddenCard() {
		PCard dealtCard;
		int index = myDeck.size()-1;
		
		//if(!myDeck.isEmpty()) {
			// = myDeck.get(index);
			dealtCard=myDeck.remove(index);
			dealtCard.hideCard();
			return dealtCard;
	}

	@Override
	public int cardCount() {
		return myDeck.size();
	}

}

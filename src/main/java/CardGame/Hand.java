
package CardGame;

import java.util.ArrayList;
import java.util.List;

import plumb.PCard;
import plumb.PHand;

public class Hand implements PHand {

	List <PCard> myHand = new ArrayList<PCard>();
	
	
	
	@Override
	public int getSize() {

		return myHand.size();
	}

	@Override
	public void addCard(PCard card) {

		myHand.add(card);
	}


	@Override
	public PCard getCard(int index) {

		PCard getHandsCard;
		getHandsCard = myHand.get(index);
		
		return getHandsCard;
	}


	@Override
	public PCard removeCard(int index) {

		PCard removedCard = getCard(index);
		myHand.remove(removedCard);
		return removedCard;
	}

	@Override
	public int getValue() {

		Integer sumValue = 0;
		Integer qtdAce = 0;

		
	for(PCard pcard: myHand) {
			Card card = (Card)pcard;
			
			if(card.getRank().equals("A"))
				qtdAce += 1;
			
			sumValue += card.getValue();
		}
		
		if(qtdAce >0) {
			sumValue += 10;
		}
		
		if(sumValue >21 && qtdAce >0) {
			sumValue-=10;
		}
		
		return sumValue;
	}
	

}

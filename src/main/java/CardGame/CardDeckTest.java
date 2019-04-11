package CardGame;
import test.DeckTest;

public class CardDeckTest {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
        DeckTest.run(deck);

    }

}

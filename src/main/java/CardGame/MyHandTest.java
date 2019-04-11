package CardGame;

import test.HandTest;

public class MyHandTest {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Hand hand = new Hand();
        HandTest.run(deck,hand);

    }
}

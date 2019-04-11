package plumb;

/**
 * Base interface used to manage a collection of cards.
 *
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2018-05-25
 */
public interface PDeck {

    /** Randomizes the deck. */
    public abstract void shuffle();

    /** Adds a card to the end of the deck. */
    public abstract void addCard(PCard card);

    /** Removes a card from the end of the deck. */
    public abstract PCard dealCard();

    /** Removes a card from the end of the deck and marks it as hidden. */
    public abstract PCard dealHiddenCard();

    /** Returns the number of cards in the deck. */
    public abstract int cardCount();
}

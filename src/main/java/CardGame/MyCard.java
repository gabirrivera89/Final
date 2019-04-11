package CardGame;

import plumb.PCard;

public class MyCard extends PCard {
    private Rank rank;
    private Suite suite;

    MyCard(Rank rank, Suite suite){
        this.rank = rank;
        this.suite =suite;

    }

    public String getRank(){
        return this.rank.getValue();
    }

    public String getSuite(){
        return this.suite.getValue();
    }

    public String getText()
    {
        return getRank() + getSuite();

    }


    public enum Rank{
        ACE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("11"),
        QUEEN("12"),
        KING("13"),
        KNIGHT("14");


        private String value;

        Rank(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }

    }

    public enum Suite {
        CLUBS("\u2663"),
        DIAMONDS("\u2666"),
        HEARTS("\u2665"),
        SPADES("\u2660");

        private String value;

        Suite(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
}




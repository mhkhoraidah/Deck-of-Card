

public class Card {
    private Suit suit;
    private Rank rank;

    public Card() {
        this.suit = null;
        this.rank = null;
    }

    public Card(Rank r, Suit s) {
        this.suit = s;
        this.rank = r;
    }

    public int value() {
        return this.rank.value();
    }

    public void print() {
        System.out.println(this.rank.toString() + " of " + this.suit.toString());
    }
}

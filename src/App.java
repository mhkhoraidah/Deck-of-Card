
public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();

        System.out.println( deck.size() + " cards in a deck.");
        
        System.out.println("\nShuffled Deck:");
        deck.shuffle();
        deck.print();

        System.out.println("\nSorted by Rank:");
        deck.sortByRank();
        deck.print();

        System.out.println("\nSorted by Suit and Rank:");
        deck.sortBySuitThenRank();
        deck.print();
    }
}

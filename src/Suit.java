
//clubs (♣), diamonds (♦), hearts (♥), and spades (♠).
public enum Suit {
    CLUBS("CLUBS"),
    DIAMONDS("DIAMONDS"),
    HEARTS("HEARTS"),
    SPADES("SPADES");

    private final String name;

    private Suit() {
        this.name = null;
    }

    private Suit(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
     }
    
};
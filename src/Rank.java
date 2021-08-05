
public enum Rank {
    TWO("TWO"),
    THREE("THREE"),
    FOUR("FOUR"),
    FIVE("FIVE"),
    SIX("SIX"),
    SEVEN("SEVEN"),
    EIGHT("EIGHT"),
    NINE("NINE"),
    TEN("TEN"),
    JACK("JACK"),
    QUEEN("QUEEN"),
    KING("KING"),
    ACE("ACE");

    private final String name;
    
    private Rank() {
        this.name = null;
    }

    private Rank(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
     }

     public int value() {
        switch(this.name) {
            case "TWO":
                return 2;
            case "THREE":
                return 3;
            case "FOUR":
                return 4;
            case "FIVE":
                return 5;
            case "SIX":
                return 6;
            case "SEVEN":
                return 7;
            case "EIGHT":
                return 8;
            case "NINE":
                return 9;
            case "TEN":
                return 10;
            case "JACK":
                return 11;
            case "QUEEN":
                return 12;   
            case "KING":
                return 13;   
            case "ACE":
                return 14;
            default:
                return 0;
        }
     }
}

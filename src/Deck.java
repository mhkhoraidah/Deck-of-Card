import java.util.*;

public class Deck{
    private List<Card> cards;

    Deck() {

        this.cards = new ArrayList<Card>();

        // loop through each suit 
        for (Suit suit : Suit.values()) {
            // loop through each rank and add card the cards list
            for (Rank rank : Rank.values()) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    public void print() {
        for(Card card : this.cards) {
            card.print();
        }
    }

    public int size() {
        return this.cards.size();
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    // Bubble Sort by Rank
    public void sortByRank() {
        
        int size = this.cards.size();  
        Card temp = null;  

        for(int i=0; i < size; i++){  
            
            for(int j=1; j < (size-i); j++){  

                if(this.cards.get(j-1).value() > this.cards.get(j).value()){  
                    temp = this.cards.get(j-1);  
                    Collections.swap(this.cards, j-1, j);
                    this.cards.get(j).assign(temp);  
                } 

            }  
        }  
    }

    // Bubble Sort by Suit
    public void sortBySuit() {

        int size = this.cards.size();  
        Card temp = null;  

        for(int i=0; i < size; i++){  
            
            for(int j=1; j < (size-i); j++){  

                if(this.cards.get(j-1).getSuit() > this.cards.get(j).getSuit()){  
                    temp = this.cards.get(j-1);  
                    Collections.swap(this.cards, j-1, j);
                    this.cards.get(j).assign(temp);  
                } 

            }  
        }  
    }

    // Bubble Sort by Suit Then Rank
    public void sortBySuitThenRank() { 
        this.sortByRank();
        this.sortBySuit();
    }
}

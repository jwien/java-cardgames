import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> cards;

    public Deck(int shoeSize) {
        this.cards = new LinkedList<>();
        fillDeck();
    }

    public void fillDeck() {
        for (byte suit = 0; suit < 3; suit++) {
            for (byte val = 1; val < 14; val++) {
                this.cards.add(new Card(suit, val));
            }
        }
    }

    public LinkedList<Card> getCards() {
        return this.cards;
    }
}
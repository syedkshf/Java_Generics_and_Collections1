import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    private Object[] values = {"Ace",2,3,4,5,6,7,8,9,10,"Jack","Queen", "King"};
    public Deck() {
/* TODO
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/
        deck = new LinkedList<>();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck.add(new Card(values[i], suits[j]));
            }
        }

    }


    public Card dealCard(){
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
        int randomIdx = new Random().nextInt(deck.size());
        Card card = deck.get(randomIdx);
        deck.remove(randomIdx);
        return card;
    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return this.deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
       /* TODO
Return a new DeckIterator with this instance in the constructor.*/
        return (Iterator<Card>) new DeckIterator<Card>(this);
    }
}
import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card card: hand) {
            System.out.println(card);
        }/* TODO
Compete a for loop that prints every card
in the deck d */


    }

    public static int addCards(ArrayList<Card> hand){
 /* TODO
This should compute the sum of values of the cards in an ArrayList of cards.*/
        int sum = 0;
        for (Card card: hand) {
            if (card.getValue() instanceof Integer) {
                sum += (Integer) card.getValue();
            } else {
                switch ((String) card.getValue()) {
                    case "Ace": sum += 1; break;
                    case "Queen": sum += 12; break;
                    case "King": sum += 13; break;
                    case "Jack": sum += 11; break;
                }
            }
        }
        return sum;
    }
}
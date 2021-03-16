import java.util.HashMap;
import java.util.Set;

public class Counter<E> {
    private E mostFrequentElem;
    private int mostFrequent;
    private HashMap<E, Integer>/* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/ counts;

    public Counter(E[] things){
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
        counts = new HashMap<>();
        for (E elem : things) {
            int currCount = counts.getOrDefault(elem, 0);
            counts.put(elem, currCount + 1);
            if (currCount > mostFrequent) {
                mostFrequent = currCount;
                mostFrequentElem = elem;
            }
        }
    }

    public Integer getCount(E element){
        /* TODO
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
        return counts.getOrDefault(element, 0);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){
/* TODO
Returns the most frequent key in the HashMap*/
        return mostFrequentElem;
    }
}
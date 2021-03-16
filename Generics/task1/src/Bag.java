import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    ArrayList<T> objects;
    Random random;
    public Bag(){
        /* TODO Initialize the objects variable*/
        objects = new ArrayList<>();
        random = new Random();
    }
    /* TODO
code the add method described. It should be public and not
return anything. Just take in a parameter and  throw an
exception. Read the documentation for this.*/
    public void add(T elem) throws BagException {
        if (elem == null) {
            throw new BagException("Cannot add null to a Bag");
        }
        objects.add(elem);
    }


    /* TODO
   Code the drawOne method here. It should not take any
   parameters. It should return a generic object. More on the
   task description.*/
    public T drawOne() {
        int randomIdx = random.nextInt(objects.size());
        return objects.get(randomIdx);
    }
    public ArrayList<T> drawMany(int howMany){
/* TODO
howMany is the number of elements to draw.
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */
        ArrayList<T> list = new ArrayList<>(howMany);
        for (int i = 1; i <= howMany; i++) {
            list.add(drawOne());
        }
        return list;
    }

    public void add(T element,double prob) throws BagException{
        /* TODO
Check that the probability is between 0 and 1. Otherwise
throw an exception. */        // This is a way to add elements in a given proportion.
        if (prob < 0 || prob > 1) {
            throw new BagException("Probability should be between 0 and 1");
        }
        int tot = (int) Math.round(objects.size() * prob);
        for(int i = 0; i < tot; i++){
            System.out.println("Adding " + i);
            objects.add(element);
        }
    }
}
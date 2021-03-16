/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java
*/
public class BingoChip<T, U> {
    T col;
    U location;

    public BingoChip(T col, U location) {
        this.col = col;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Chip:" + this.col + "-" + this.location;
    }
}
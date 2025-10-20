/**
 * Purpose: Calculating Powers
 *
 * @author Phillip Lord
 * @author Jordan Barnes
 */
public class Power {
    public static void main(String[] args) {
        Power p = new Power();
        int length = 6;
        System.out.println("The hypercube of " + length + " is:"
                + (length * length));
        System.out.println("The cube of " + length + " is:"
                + (length * length* length));
        System.out.println("The square of " + length + " is:"
                + (length * length* length* length));
    }

}
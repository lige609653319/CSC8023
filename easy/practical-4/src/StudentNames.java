import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * Purpose: Introduction to data structures
 * @author Phillip Lord
 * @author Jordan Barnes
 *
 */
public class StudentNames {
    public static void main(String[] args) {
//        String[] names = new  String[8];
//        Scanner s = new Scanner(System.in);
//        for (int i = 0; i < 8; i++) {
//            System.out.println("Enter student name:");
//            names[i] = s.next();
//        }
//        System.out.println(Arrays.toString(names));
//        System.out.println("the " + 1 + " student name is " + names[0]);
//        System.out.println("the " + 3 + " student name is " + names[2]);
//        System.out.println("the " + 8 + " student name is " + names[7]);
//        for (int i = 0; i < 8; i++) {
//            System.out.println("the " + (i+1) + " student name is " + names[i]);
//        }
        int[] ints = new int[8];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Enter number:");
            ints[i] = s.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("number: " + ints[i]);
        }
    }
}

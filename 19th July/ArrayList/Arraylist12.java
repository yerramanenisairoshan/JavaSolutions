package ArrayList;
import java.util.*;
public class Arraylist12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        if (numbers.isEmpty()) {
            System.out.println("The array list is empty");
        } else {
            System.out.println("The array list is not empty");
        }

        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        if (numbers.isEmpty()) {
            System.out.println("The array list is empty");
        } else {
            System.out.println("The array list is not empty");
        }
    }
}

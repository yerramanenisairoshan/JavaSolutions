package ArrayList;
import java.util.*;
public class Arraylist11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        numbers.clear();

        System.out.println("The empty array list is:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

}

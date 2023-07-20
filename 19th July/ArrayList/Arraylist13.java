package ArrayList;
import java.util.*;
public class Arraylist13 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        int secondElementIndex = 1;

        Integer elementToReplaceWith = 11;

        numbers.set(secondElementIndex, elementToReplaceWith);

        System.out.println("The modified array list is:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

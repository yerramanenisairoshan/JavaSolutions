package ArrayList;
import java.util.*;
public class Arraylist7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        Collections.sort(numbers);

        System.out.println("The sorted array list is:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

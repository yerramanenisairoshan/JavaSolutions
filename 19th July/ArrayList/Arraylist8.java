package ArrayList;
import java.util.*;
public class Arraylist8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        ArrayList<Integer> copiedNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            copiedNumbers.add(number);
        }

        System.out.println("The copied array list is:");
        for (Integer number : copiedNumbers) {
            System.out.println(number);
        }
    }
}

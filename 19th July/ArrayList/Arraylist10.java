package ArrayList;
import java.util.*;
public class Arraylist10 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        int lastIndex = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(lastIndex - i));
            numbers.set(lastIndex - i, temp);
        }

        System.out.println("The reversed array list is:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

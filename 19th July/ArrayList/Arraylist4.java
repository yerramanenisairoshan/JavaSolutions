package ArrayList;
import java.util.*;
public class Arraylist4 {
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int index = 2;
    int newElement = 10;

    array[index] = newElement;

    System.out.println("The updated array is: ");
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}
}

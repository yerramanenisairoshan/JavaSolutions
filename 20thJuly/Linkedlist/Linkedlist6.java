package Linkedlist;
import java.util.*;
public class Linkedlist6 {public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Red");
    list.add("Green");
    list.add("Blue");

    int index = 1;
    for (String element : list) {
        System.out.println("Element {index}: {element}");
        index += 1;
    }
}

}

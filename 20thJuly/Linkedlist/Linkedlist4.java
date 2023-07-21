package Linkedlist;
import java.util.*;

public class Linkedlist4 {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.add(1, "Yellow");

        System.out.println(list);
}
}

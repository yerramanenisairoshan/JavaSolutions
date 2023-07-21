package Linkedlist;
import java.util.*;
public class Linkedlist5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.addFirst("Yellow");

        list.addLast("Purple");

        System.out.println(list);
    }
}

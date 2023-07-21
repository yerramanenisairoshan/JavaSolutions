package Linkedlist;
import java.util.*;
public class Linkedlist7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.removeFirst();

        list.removeLast();

        System.out.println(list);
    }
}

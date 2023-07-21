package Linkedlist;
import java.util.*;
public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.addLast("Yellow");

        System.out.println(list);
    }
}

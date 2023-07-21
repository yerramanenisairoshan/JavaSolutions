package Hashset;
import java.util.*;
public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        appendElementToHashSet(set, "Yellow");

        System.out.println(set);
    }

    private static void appendElementToHashSet(HashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }
}

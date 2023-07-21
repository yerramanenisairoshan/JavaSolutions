package Hashset;
import java.util.*;

public class Hashset4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        emptyHashSet(set);

        System.out.println(set);
    }

    private static void emptyHashSet(HashSet<String> set) {
        set.clear();
    }
}

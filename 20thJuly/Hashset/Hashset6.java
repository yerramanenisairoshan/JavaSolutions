package Hashset;
import java.util.*;

public class Hashset6 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");

        HashSet<String> set2 = cloneHashSet(set1);

        System.out.println(set2);
    }
    private static HashSet<String> cloneHashSet(HashSet<String> set1) {
        HashSet<String> set2 = new HashSet<>();

        for (String element : set1) {
            set2.add(element);
        }
        return set2;
    }
}

package Hashset;
import java.util.*;

public class Hashset9 { public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    set.add("Red");
    set.add("Green");
    set.add("Blue");
    removeAllElementsFromHashSet(set);
    System.out.println(set);
}
    private static void removeAllElementsFromHashSet(HashSet<String> set) {
        set.clear();
    }

}

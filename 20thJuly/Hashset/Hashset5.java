package Hashset;
import java.util.*;

public class Hashset5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        boolean isEmpty = isHashSetEmpty(set);

        System.out.println(isEmpty);
    }

    private static boolean isHashSetEmpty(HashSet<String> set) {
        return set.isEmpty();
    }
}

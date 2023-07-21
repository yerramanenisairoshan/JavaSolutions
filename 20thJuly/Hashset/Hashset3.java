package Hashset;
import java.util.*;

public class Hashset3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        int numberOfElements = getNumberOfElementsInHashSet(set);

        System.out.println(numberOfElements);
    }

    private static int getNumberOfElementsInHashSet(HashSet<String> set) {
        int numberOfElements = set.size();

        return numberOfElements;
    }
}

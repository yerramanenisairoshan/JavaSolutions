package Hashset;
import java.util.*;
public class Hashset8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        TreeSet<String> treeSet = convertHashSetToTreeSet(set);
        System.out.println(treeSet);
    }
    private static TreeSet<String> convertHashSetToTreeSet(HashSet<String> set) {
        TreeSet<String> treeSet = new TreeSet<>();

        for (String element : set) {
            treeSet.add(element);
        }
        return treeSet;
    }
}

package Hashset;
import java.util.*;

public class Hashset7 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        String[] array = convertHashSetToArray(set);
        System.out.println(Arrays.toString(array));
    }
    private static String[] convertHashSetToArray(HashSet<String> set) {
        String[] array = new String[set.size()];
        int i = 0;
        for (String element : set) {
            array[i++] = element;
        }
        return array;
    }
}

package ArrayList;
import java.util.*;
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }

}

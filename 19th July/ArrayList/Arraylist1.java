package ArrayList;
import java.util.*;
public class Arraylist1 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("The colors in the array list are:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

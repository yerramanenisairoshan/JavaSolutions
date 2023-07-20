package ArrayList;
import java.util.*;
public class Arraylist6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");

        String elementToSearch = "green";

        int index = colors.indexOf(elementToSearch);

        if (index != -1) {
            System.out.println("The element " + elementToSearch + " was found at index " + index);
        } else {
            System.out.println("The element " + elementToSearch + " was not found");
        }
    }
}

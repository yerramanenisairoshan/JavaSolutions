package Strings;

public class String14 {
    public static String getColorString(String str) {
        String color = "";
        if (str.startsWith("red")) {
            color = "red";
        } else if (str.startsWith("black")) {
            color = "black";
        }
        return color;
    }

    public static void main(String[] args) {
        String str = "red car";
        String color = getColorString(str);
        System.out.println("The color string is: " + color);
    }
}

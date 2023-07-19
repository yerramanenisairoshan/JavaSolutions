package Strings;

public class String3 {
    public static void main(String[] args) {
        String string1 = "Hello, World!";
        String string2 = "hello, universe!";

        int result = string1.compareToIgnoreCase(string2);

        if (result < 0) {
            System.out.println(string1 + " is less than " + string2);
        } else if (result > 0) {
            System.out.println(string1 + " is greater than " + string2);
        } else {
            System.out.println(string1 + " is equal to " + string2);
        }
    }
}

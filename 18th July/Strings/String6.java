package Strings;

public class String6 {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog.";
        String prefix = "The";

        boolean startsWith = string.startsWith(prefix);

        System.out.println(startsWith);
    }
}


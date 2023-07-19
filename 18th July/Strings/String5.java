package Strings;

public class String5 {

    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog.";
        String regex = "fox";
        String replacement = "cat";

        String replacedString = string.replaceAll(regex, replacement);

        System.out.println(replacedString);
    }
}


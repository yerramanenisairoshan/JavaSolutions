package Strings;

public class String7 {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog.";
        int startPosition = 20;
        int endPosition = 40;

        String substring = string.substring(startPosition, endPosition);

        System.out.println(substring);
    }
}

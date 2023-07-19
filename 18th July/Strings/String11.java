package Strings;

public class String11 {
    public static void main(String[] args) {
        String str = "   This is a string with leading and trailing whitespace.   ";

        // Trim leading whitespace
        String trimmedStr = str.trim();
        System.out.println("Trimmed string with leading whitespace: " + trimmedStr);

        // Trim trailing whitespace
        trimmedStr = trimmedStr.trim();
        System.out.println("Trimmed string with trailing whitespace: " + trimmedStr);
    }
}

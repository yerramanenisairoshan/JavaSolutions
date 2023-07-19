package Strings;

public class String13 {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversedWords = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords += words[i] + " ";
        }
        return reversedWords.trim();
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseWords(str));
    }
}

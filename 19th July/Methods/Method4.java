package Methods;

public class Method4 {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+|\\p{Punct}");

        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String text = "Hello, World! This is a sample string.";
        int numberOfWords = countWords(text);
        System.out.println("The number of words in the string is: " + numberOfWords);
    }
}


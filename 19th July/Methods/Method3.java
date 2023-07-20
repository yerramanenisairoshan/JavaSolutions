package Methods;

public class Method3 {
    public static int countVowels(String input) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.contains(Character.toString(currentChar))) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        int numberOfVowels = countVowels(text);
        System.out.println("The number of vowels in the string is: " + numberOfVowels);
    }
}

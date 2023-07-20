package Methods;

public class Method9 {
    public static boolean allCharactersAreVowels(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Convert the input string to lowercase to simplify the vowel check
        String lowercaseInput = input.toLowerCase();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' &&
                    currentChar != 'o' && currentChar != 'u') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String text = "aeiou";
        boolean allVowels = allCharactersAreVowels(text);

        if (allVowels) {
            System.out.println("All characters in the string are vowels.");
        } else {
            System.out.println("Not all characters in the string are vowels.");
        }
    }
}

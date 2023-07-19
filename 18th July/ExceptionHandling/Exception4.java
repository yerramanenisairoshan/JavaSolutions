package ExceptionHandling;
import java.util.*;
class NoVowelsException extends Exception {

    public NoVowelsException(String message) {
        super(message);
    }
}

public class Exception4 {

    public static void main(String[] args) throws NoVowelsException {
        String string = "bcdfghjklmnpqrstvwxyz";
        checkForVowels(string);
    }

    public static void checkForVowels(String string) throws NoVowelsException {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (char c : string.toCharArray()) {
            if (vowels.contains(c)) {
                return;
            }
        }

        throw new NoVowelsException("The string does not contain any vowels");
    }
}


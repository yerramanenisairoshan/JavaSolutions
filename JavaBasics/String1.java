package JavaBasics;

public class String1 {
    public static void main(String[] args) {
        String sentence = "hello world";

        String capitalizedSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (i == 0 || sentence.charAt(i - 1) == ' ') {
                ch = Character.toUpperCase(ch);
            }
            capitalizedSentence += ch;
        }

        System.out.println("The capitalized sentence is: " + capitalizedSentence);
    }
}


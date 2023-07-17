package JavaBasics;

public class Controlstatements8 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Error: Please provide a single character.");
        } else {
            String input = args[0];

            if (input.length() != 1) {
                System.out.println("Error: Please provide a single character.");
            } else {
                char ch = input.charAt(0);

                if (!Character.isLetter(ch)) {
                    System.out.println("Error: Please provide a letter from the alphabet.");
                } else {
                    ch = Character.toLowerCase(ch);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println("Vowel");
                    } else {
                        System.out.println("Consonant");
                    }
                }
            }
        }
    }
}



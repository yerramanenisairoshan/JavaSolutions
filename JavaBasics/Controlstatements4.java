package JavaBasics;
import java.util.*;

public class Controlstatements4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int fc = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                fc++;
            }
        }

        System.out.println("The number of factors of " + number + " is " + fc);
    }
}
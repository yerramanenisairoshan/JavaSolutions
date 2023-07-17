package JavaBasics;
import java.util.Scanner;
public class Datatype4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a non-negative integer: ");
            int number = scanner.nextInt();

            System.out.println("Digits in the number:");

            String numberString = String.valueOf(number);

            for (int i = 0; i < numberString.length(); i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                System.out.print(digit + " ");
            }
        }
}

package JavaBasics;
import java.util.*;
public class Controlstatements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int num = 0;
        if (number % 2 == 0) {
            num = 1;
        }

        System.out.println("The number is " + num);
    }
}



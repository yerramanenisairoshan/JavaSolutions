package JavaBasics;
import java.util.Scanner;

public class Controlstatements13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int number = 1;

        while (count < n) {
            sum += number;
            number += 2;
            count++;
        }

        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);
    }
}
package JavaBasics;

public class Controlstatements11 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int number = (int) (Math.random() * 100);
            numbers[i] = number;
            sum += number;
        }

        int average = sum / 5;

        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + average);
    }
}

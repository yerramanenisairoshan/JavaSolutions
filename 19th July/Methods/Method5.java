package Methods;

public class Method5 {
    public static int computeSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12345;
        int sumOfDigits = computeSumOfDigits(num);
        System.out.println("The sum of digits in the number is: " + sumOfDigits);
    }
}

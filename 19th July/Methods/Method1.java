package Methods;

public class Method1 {
    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 7;

        int smallestNumber = findSmallestNumber(num1, num2, num3);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}

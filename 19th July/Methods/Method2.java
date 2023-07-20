package Methods;

public class Method2 {
    public static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;
        double num3 = 7.8;

        double average = computeAverage(num1, num2, num3);
        System.out.println("The average is: " + average);
    }
}

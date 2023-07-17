package JavaBasics;
import java.text.DecimalFormat;
public class Controlstatements14 {
    public static void main(String[] args) {
        double number1 = 2.1415;
        double number2 = 4.14159;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedNumber1 = decimalFormat.format(number1);
        String formattedNumber2 = decimalFormat.format(number2);

        boolean areEqual = formattedNumber1.equals(formattedNumber2);

        if (areEqual) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
    }
}



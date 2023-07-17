package JavaBasics;

public class Datatype5 {
    public static void main(String[] args) {
        double number = 4.5;

        if (Double.isFinite(number)) {
            System.out.println("The number is a finite floating-point value.");
        } else {
            System.out.println("The number is not a finite floating-point value.");
        }
    }
}


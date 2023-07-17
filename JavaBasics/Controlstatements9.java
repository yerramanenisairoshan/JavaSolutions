package JavaBasics;

public class Controlstatements9 {
    public static void main(String[] args) {
        int year = 4000;

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
        }
        if (year % 100 == 0) {
            isLeapYear = false;
        }
        if (year % 400 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}



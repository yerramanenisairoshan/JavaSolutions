package ExceptionHandling;

public class Exception2 {
    public static void checkEvenNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("Number is odd!");
        }
    }

    public static void main(String[] args) {
        int number = 7;

        try {
            Exception2.checkEvenNumber(number);
            System.out.println(number + " is an even number.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

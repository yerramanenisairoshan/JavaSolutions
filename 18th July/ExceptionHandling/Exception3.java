package ExceptionHandling;

class DuplicateNumberException extends Exception {

        public DuplicateNumberException(String message) {
            super(message);
        }
    }

    public class Exception3 {

        public static void main(String[] args) throws DuplicateNumberException {
            int[] numbers = new int[5];
            System.out.println("Enter a list of integers: ");
            for (int i = 0; i < numbers.length; i++) {
                try {
                    int number = Integer.parseInt(System.console().readLine());
                    if (i > 0 && numbers[i - 1] == number) {
                        throw new DuplicateNumberException("Duplicate number found: " + number);
                    }
                    numbers[i] = number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                    i--;
                }
            }

            System.out.println("The list of integers does not contain any duplicates");
        }
    }

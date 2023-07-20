package Methods;

public class Method7 {
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 10) {
            return false;
        }

        int digitCount = 0;
        int letterCount = 0;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            } else {
                return false;
            }
        }

        return (digitCount >= 2) && (letterCount >= 1);
    }

    public static void main(String[] args) {
        String password = "Passw0rd123";
        boolean isValid = isValidPassword(password);

        if (isValid) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }
}

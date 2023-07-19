package Arrays;

public class Array12 {
    public static void main(String[] args) {
        String []str={"apple","banana","apple","grape","apple"};
        boolean[] duplicate = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i] == str[j] && i != j) {
                    duplicate[i] = true;
                }
            }
        }
        System.out.println("The duplicate values are:");
        for (int i = 0; i < str.length; i++) {
            if (duplicate[i]) {
                System.out.print(str[i] + " ");
            }
        }
    }
}


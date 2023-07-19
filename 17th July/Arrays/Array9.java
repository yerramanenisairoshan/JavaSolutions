package Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            } else if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }
}


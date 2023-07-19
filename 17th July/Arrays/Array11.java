package Arrays;

public class Array11 {
    public static void main(String[] args) {
        int []num={1,2,2,3,4,5,5,6,4,6};
        boolean[] duplicate = new boolean[num.length];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    duplicate[i] = true;
                }
            }
        }
        System.out.println("The duplicate values are:");
        for (int i = 0; i < num.length; i++) {
            if (duplicate[i]) {
                System.out.print(num[i] + " ");
            }
        }
    }
}

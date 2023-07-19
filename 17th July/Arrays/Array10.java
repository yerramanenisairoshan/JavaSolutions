package Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        System.out.println("The reversed array is:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}


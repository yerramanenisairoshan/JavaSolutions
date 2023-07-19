package Arrays;

public class Array8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 8;
        int position = 3;
        for (int i = array.length - 1; i >= position; i--) {
            array[i + 1] = array[i];
        }
        array[position] = element;
        System.out.println("The new array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


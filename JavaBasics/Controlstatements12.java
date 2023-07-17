package JavaBasics;

public class Controlstatements12 {
    public static void main(String[] args) {
        int limit = 10;

        System.out.println("Cube of the numbers up to " + limit + ":");

        for (int i = 1; i <= limit; i++) {
            int cube = i * i * i;
            System.out.println(i + " ^ 3 = " + cube);
        }
    }
}


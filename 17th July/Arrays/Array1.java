package Arrays;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Arrays.sort(num);
        {
            System.out.println("The sorted numeric array is:");
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]+" ");
            }
        }
        String[] str={"apple","banana","mango","grape"};
        Arrays.sort(str);
        {
            System.out.println("The sorted string array is:");
            for(int i=0;i<str.length;i++){
                System.out.print(str[i]+" ");
            }
        }

    }

    }


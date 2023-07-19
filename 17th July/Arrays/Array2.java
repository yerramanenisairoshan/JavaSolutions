package Arrays;
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int sum=0;

            for(int i=0;i<num1.length;i++){
                sum+=num1[i];
            }
        System.out.println(sum);
    }
}

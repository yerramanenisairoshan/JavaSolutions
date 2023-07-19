package Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,};
        int value=2;
        boolean found=false;
        for(int i=0;i<num.length;i++) {
            if (num[i] == value) {
                found = true;
                break;
            }
        }
            if(found) {
                System.out.println(value + ":is found in array");
            }
            else{
                System.out.println(value+":is not found in array");
            }
        }
    }


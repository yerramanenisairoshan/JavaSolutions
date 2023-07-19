package Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,};
        int index=-1;
        int value=4;
        for(int i=0;i<num.length;i++) {
            if (num[i] ==value) {
                index=i;
                break;
            }
        }
        if(index!= -1) {
            System.out.println( "The value" +value+ ":is found in index"+index);
        }
        else{
            System.out.println( "The value" +value+ ":is found in index"+index);
        }
    }
}


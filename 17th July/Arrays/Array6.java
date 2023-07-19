package Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int value=3;
        int[] newnum=new int[num.length -1];
        int index=0;
        for(int i=0;i<num.length;i++) {
            if (num[i] != value) {
                newnum[index++] = num[i];
            }
        }
            System.out.println("The new array is:");
            for(int i=0;i<newnum.length;i++){
                System.out.println(newnum[i]+" ");
            }


    }

}

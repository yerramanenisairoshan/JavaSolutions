package JavaBasics;

public class Controlstatements6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=30;
        int num3=60;
        int greatestnumber=num1;
        if(num2>num1){
            greatestnumber=num2;
        }
        if(num3>num2){
            greatestnumber=num3;
        }
        System.out.println("The greatest number is:"+greatestnumber);
    }
}

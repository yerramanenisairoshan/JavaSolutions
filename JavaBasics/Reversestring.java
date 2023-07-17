package JavaBasics;

public class Reversestring {
    public static void main(String[] args) {
        String s="Sairoshan";
        char[] charArray = s.toCharArray();

        int start=0;
        int end=charArray.length-1;

        while(start<end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversestring = new String(charArray);
        System.out.println(reversestring);
    }
}


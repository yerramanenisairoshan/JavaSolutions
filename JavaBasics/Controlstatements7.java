package JavaBasics;

public class Controlstatements7 {
    public static void main(String[] args) {
        int num=5;
        String weekdayname="";
        switch (num) {
            case 1:
                weekdayname = "Sunday";
                break;
            case 2:
                weekdayname = "Monday";
                break;
            case 3:
                weekdayname = "Tuesday";
                break;
            case 4:
                weekdayname = "Wednesday";
                break;
            case 5:
                weekdayname = "Thursday";
                break;
            case 6:
                weekdayname = "Friday";
                break;
            case 7:
                weekdayname = "Saturday";
                break;
            default:
                weekdayname = "invalid num";
        }
        System.out.println("The weekdayname is:"+weekdayname);
    }
}

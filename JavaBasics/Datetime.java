package JavaBasics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = formatter.format(now);
        System.out.println("The current system time is: " + formattedTime);
    }
}


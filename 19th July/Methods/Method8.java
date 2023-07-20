package Methods;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Method8 {


        public static void displayCurrentDateTime() {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            System.out.println("Current Date and Time: " + formattedDateTime);
        }

        public static void main(String[] args) {
            displayCurrentDateTime();
        }
    }


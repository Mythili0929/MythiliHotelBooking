import java.time.*;
import java.time.format.DateTimeFormatter;

class TimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = now.format(dtf);

        System.out.println("Current Date & Time: " + formatted);
    }
}
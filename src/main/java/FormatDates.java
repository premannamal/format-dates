import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        // 1. Slash-separated (e.g., 10/28/2026)
        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatted2 = today.format(pattern2);
        System.out.println(formatted2);

        // 2. Dash-separated (e.g., 28-10-2026)
        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted1 = today.format(pattern1);
        System.out.println(formatted1);

        LocalDateTime today1 = LocalDateTime.now();
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
        String formattedDate = today1.format(fmt);
        System.out.println(formattedDate);
    }
}
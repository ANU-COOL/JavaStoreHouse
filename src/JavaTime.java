import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTime {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        LocalDate d = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-uu-yyyy");
        String time = t.format(dtf);
        String date = d.format(dtf1);
        System.out.println(date);
        System.out.println(time);
    }
}

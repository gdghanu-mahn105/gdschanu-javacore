import java.time.*;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        LocalDate toDate = dateTime.toLocalDate();
        System.out.println(toDate);
        LocalTime toTime = dateTime.toLocalTime();
        System.out.println(toTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        LocalDateTime local_DFromZoned = zonedDateTime.toLocalDateTime();
        System.out.println(local_DFromZoned);
        // định dạng LocalDateTime thành chuỗi
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("formatted DateTime: " + formattedDateTime);

        // phân tích chuỗi thành LocalDatetime
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, dateTimeFormatter);
        System.out.println(parsedDateTime);

        // period thời gian giữa các ngày
        LocalDate fivedate = date.plusDays(30);
        Period btw5day = Period.between(date, fivedate);
        System.out.println("Khoảng cách ngày: " + btw5day.getDays() + " khoảng cách năm: " + btw5day.getYears() + " khoảng cách tháng: " + btw5day.getMonths());
    }
}
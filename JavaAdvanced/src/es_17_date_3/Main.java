package es_17_date_3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dateFormat = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        System.out.println("Anno "+dateTime.getYear());
        System.out.println("Mese "+dateTime.getMonth());
        System.out.println("Giorno "+dateTime.getDayOfMonth());
        System.out.println("Giorno della settimana "+dateTime.getDayOfWeek());
    }
}

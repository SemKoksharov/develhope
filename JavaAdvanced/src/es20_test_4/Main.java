package es20_test_4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Creazione di oggetto
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Formattazione
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        String formattedDate = formatter.format(dateTime);

        // Stampa
        System.out.println(formattedDate);
    }
}

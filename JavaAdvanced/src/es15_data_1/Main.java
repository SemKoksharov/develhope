package es15_data_1;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        //Bisogna creare ZonedDateTime per aver possibilita di ottenere formato FULL o LONG
        ZonedDateTime dateTimeZoned = dateTime.toZonedDateTime();
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        String formatShort = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        String formatMedium = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String formatFull = dateTimeZoned.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        //Stampa le varie versioni
        System.out.println("Short:  " + formatShort);
        System.out.println("Medium:  " + formatMedium);
        System.out.println("Full:  " + formatFull);



    }
}

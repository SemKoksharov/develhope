package es19_date_5;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static java.util.Locale.ITALY;

/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z




 */
public class Main {
    public static void main(String[] args) {

        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateTime1 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //Verificare che la prima data è precedente alla seconda
        //Stampa il risultato
        if (dateTime.isBefore(dateTime1)) {
            System.out.println("la prima data è precedente alla seconda\n");
        }

        //Verificare che la seconda data è successiva alla prima
        //Stampa il risultato
        if (dateTime1.isAfter(dateTime)) {
            System.out.println("la seconda data è successiva alla prima\n");
        }

        //Verificare che le due date sono uguali ad ora
        //Stampa il risultato
        if (dateTime.getHour() == dateTime1.getHour()) {
            System.out.println("le due date sono uguali ad ora\n");
        }
        System.out.println("Data");
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", ITALY)));
        System.out.println("\nData 1");
        System.out.println(dateTime1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", ITALY)));
    }
}

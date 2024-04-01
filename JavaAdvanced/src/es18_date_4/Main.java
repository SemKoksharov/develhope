package es18_date_4;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static java.util.Locale.ITALY;

/*





 */
public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //aggiungi un anno
        dateTime = dateTime.plusYears(1);
        //sottrai un mese
        dateTime = dateTime.minusMonths(1);
        //aggiungi 7 giorni
        dateTime = dateTime.plusDays(7);

        //Stampa il risultato localizzata per l'Italia
        System.out.println("dateTime format italy:\n");
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", ITALY)));
    }
}

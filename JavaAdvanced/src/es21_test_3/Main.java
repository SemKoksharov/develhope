package es21_test_3;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*





Stampa i risultati sulla console -Crea dei test per questo esercizio
 */
public class Main  {
    public static void main(String[] args) {


        OffsetDateTime newDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE", Locale.ITALY);
        String formattedDate = formatter.format(newDate);
        System.out.println(formattedDate);

        //Ottieni l'anno
        Year anno = Year.of(newDate.getYear());

        //Ottieni il mese
        Month mese = newDate.getMonth();

        //Ottieni il giorno
        int giornoDiMese = newDate.getDayOfMonth();

        //Ottieni il giorno della settimana
        DayOfWeek giornoDiSett =  newDate.getDayOfWeek();


        //Stampa i risultati sulla console -Crea dei test per questo esercizio
        System.out.println(giornoDiSett);
        System.out.println(giornoDiMese);
        System.out.println(mese);
        System.out.println(anno);
    }
}
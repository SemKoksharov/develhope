package es21_test_3;

import es20_test_4.Main;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDiFormatoEVariabili() {
        OffsetDateTime newDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, EEEE", Locale.ITALY);
        String formattedDate = formatter.format(newDate);
        System.out.println(formattedDate);
        assertEquals("1 marzo 2023, mercoledì", formattedDate);
        //Ottieni l'anno
        Year anno = Year.of(newDate.getYear());
        assertEquals(Year.of(2023), anno);
        //Ottieni il mese
        Month mese = newDate.getMonth();
        assertEquals(Month.MARCH, mese);
        //Ottieni il giorno
        int giorno = newDate.getDayOfYear();
        assertEquals(60, giorno);

        //Ottieni il giorno della settimana
        DayOfWeek giornoDiSett =  newDate.getDayOfWeek();
        assertEquals(DayOfWeek.WEDNESDAY, giornoDiSett);
    }
}
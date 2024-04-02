package es20_test_4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class Es20MainTest {

    @org.junit.jupiter.api.Test

    void testDateFormatting() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Formattazione
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        String formattedDate = formatter.format(dateTime);

        assertEquals("01 marzo 2023", formattedDate);
    }
}
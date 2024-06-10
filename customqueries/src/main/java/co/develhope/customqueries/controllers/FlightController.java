package co.develhope.customqueries.controllers;

import co.develhope.customqueries.entities.Flight;
import co.develhope.customqueries.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
//----------------------------------[CUSTOM Q. EX 1 , EX 2]------------------------------------------------------------

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    // genera 50 voli con status ONTIME
    @PostMapping("/generate50")
    public ResponseEntity<List<Flight>> generate50OnTimeFlights() {

        var flightsList = flightService.saveFlights();

        return ResponseEntity.ok(flightsList);
    }

    //genera "n" voli con random status
    @PostMapping("/generate")
    public ResponseEntity<List<Flight>> generateNFlightsRandomStatus(@RequestParam(defaultValue = "100") Integer n) {

        var flightsList = flightService.saveFlights(n);

        return ResponseEntity.ok(flightsList);
    }

    @GetMapping
    public ResponseEntity<Page<Flight>> getAllFlightsWithPagination(
            @RequestParam(defaultValue = "0") Optional<Integer> page,
            @RequestParam(defaultValue = "100") Optional<Integer> size
    ){

        var flightsList = flightService.getAllFlightsWithPagination(page, size);
        return ResponseEntity.ok(flightsList);
    }

    // All ONTIME
    @GetMapping("/onTime")
    public ResponseEntity<List<Flight>> getAllOnTimeFlights() {
        var flightsList = flightService.getAllOnTime();

        return ResponseEntity.ok(flightsList);
    }


    // se ci sono i parametri restituisce List<Flight> con tutti i voli che corrispondono a s1/s2/s1+s2/
    // la ricerca senza parametri restituisce tutti i voli presenti in DB
    @GetMapping("/status")
    public ResponseEntity<List<Flight>> getAllByStatus(
            @RequestParam(required = false) Optional<Flight.Status> s1,
            @RequestParam(required = false) Optional<Flight.Status> s2
    ) {

        var flightsList = flightService.getAllByStatus(s1, s2);

        return ResponseEntity.ok(flightsList);
    }
}

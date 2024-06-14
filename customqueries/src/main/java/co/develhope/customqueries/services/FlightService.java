package co.develhope.customqueries.services;

import co.develhope.customqueries.entities.Flight;
import co.develhope.customqueries.entities.Status;
import co.develhope.customqueries.exceptions.EmptyResultException;
import co.develhope.customqueries.repositotries.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.IntStream;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    public List<Flight> saveFlights(Optional<Integer> n) {
        return flightRepository.saveAllAndFlush(generateFlights(n));
    }

    public Page<Flight> getAllFlightsWithPagination(Optional<Integer> page, Optional<Integer> size) {

        if (page.isPresent() && size.isPresent()) {

            Sort sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "fromAirport"));
            Pageable pageable = PageRequest.of(page.get(), size.get(), sort);

            return flightRepository.findAll(pageable);

        }

        return Page.empty();
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getAllOnTime() {
        return flightRepository.findAll()
                .stream()
                .filter(flight -> flight.getStatus() == Status.ONTIME)
                .toList();
    }

    //Set x evitare duplicati
    public List<Flight> getAllByStatusIn(Status[] statuses) throws Exception {

        Set<Flight> flightsFound = new HashSet<>(flightRepository.findByStatusIn(statuses));
        if (flightsFound.isEmpty()){
            throw new EmptyResultException("Flights with statuses: " + Arrays.toString(statuses) + " not found in the DB");
        }
        return flightsFound.stream().toList();
    }

    //lasciato per memoria))))
    public List<Flight> getAllByStatus(Optional<Status> s1, Optional<Status> s2) {

        Set<Flight> foundFlights = new HashSet<>();

        if (s1.isPresent() && s2.isPresent()) {

            var flightsByStatus1 = flightRepository.findByStatus(s1.get());
            var flightsByStatus2 = flightRepository.findByStatus(s2.get());

            foundFlights.addAll(flightsByStatus1);
            foundFlights.addAll(flightsByStatus2);

        } else if (s1.isPresent()) {

            var flightsByStatus1 = flightRepository.findByStatus(s1.get());
            foundFlights.addAll(flightsByStatus1);

        } else if (s2.isPresent()) {

            var flightsByStatus2 = flightRepository.findByStatus(s2.get());
            foundFlights.addAll(flightsByStatus2);

        } else {

            foundFlights = new HashSet<>(getAllFlights());
            var flightsList = foundFlights.stream().toList();

            foundFlights.addAll(flightsList);
        }

        return foundFlights.stream().toList();
    }

    // A posto di usare due metodi ho fatto solo uno che gestisce 2 casi
    // (se presente n mi genera n Flights con random status, altrimenti solo 50 con status ONTIME)
    // COSI MEGLIO? =)
    private List<Flight> generateFlights(Optional<Integer> n) {
        Random random = new Random();

        if (n. isPresent() && n.get() < 1) {
            throw new IllegalArgumentException("Error, ID must be a positive number. Now: " + n + ".");
        }

        // QUANTITA DI VOLI SE NON C`E 'N'  = 50, SE PRESENTE = 'N'
        int rangeEnd = n.orElse(50);

        return IntStream.range(0, rangeEnd).mapToObj(i -> {

            // QUA OGNI GIRO SE NON C`E 'N' METTE STATUS 'ONLINE', ALTRIMENTI
            // OGNI GIRO STATUS = RANDOM
            Status status = n.isPresent() ? Status.values()[random.nextInt(3)] : Status.ONTIME;
            Flight flight = new Flight();

            flight.setDescription("Flight " + (i + 1));
            flight.setFromAirport(random.ints(3, 'A', 'Z' + 1)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
            flight.setToAirport(random.ints(3, 'A', 'Z' + 1)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());

            flight.setStatus(status);
            return flight;
        }).toList();

    }
}





package co.develhope.customqueries.services;

import co.develhope.customqueries.entities.Flight;
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

    public List<Flight> saveFlights() {
        return flightRepository.saveAllAndFlush(generateFlights());
    }

    public List<Flight> saveFlights(Integer n) {

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
                .filter(flight -> flight.getStatus() == Flight.Status.ONTIME)
                .toList();
    }

    public List<Flight> getAllByStatus(Optional<Flight.Status> s1, Optional<Flight.Status> s2) {

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


    private List<Flight> generateFlights() {
        Random random = new Random();

        return IntStream.range(0, 50).mapToObj(i -> {
            Flight flight = new Flight();
            flight.setDescription("Flight " + (i + 1));
            flight.setFromAirport(random.ints(3, 'A', 'Z' + 1)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
            flight.setToAirport(random.ints(3, 'A', 'Z' + 1)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
            flight.setStatus(Flight.Status.ONTIME);
            return flight;
        }).toList();


    }

    private List<Flight> generateFlights(Integer n) {

        if (n < 1) {
            throw new IllegalArgumentException("Error, ID must be a positive number. Now: " + n + ".");
        }

        Random random = new Random();

        return IntStream.range(0, n).mapToObj(i -> {
            Flight flight = new Flight();
            flight.setDescription("Flight " + (i + 1));
            flight.setFromAirport(random.ints(3, 'A', 'Z' + 1)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
            flight.setToAirport(random.ints(3, 'A', 'Z' + 1)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());

            flight.setStatus(Flight.Status.values()[random.nextInt(3)]);
            return flight;
        }).toList();


    }
}

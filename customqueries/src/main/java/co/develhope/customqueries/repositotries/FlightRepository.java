package co.develhope.customqueries.repositotries;

import co.develhope.customqueries.entities.Flight;
import co.develhope.customqueries.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByStatus(Status status);

    List<Flight> findByStatusIn(Status[] statuses);
}

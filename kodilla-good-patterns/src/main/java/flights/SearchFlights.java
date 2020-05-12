package flights;

import java.util.Set;
import java.util.stream.Collectors;

public class SearchFlights {
    public String flightsTo(String arrivalAirport) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> flights = flightsList.getFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

        return (flights.toString());
    }

    public String flightsFrom(String departureAirport) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> flights = flightsList.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());

        return (flights.toString());
    }

    public String flightsVia(String intermediateAirport) {
        SearchFlights searchFlights = new SearchFlights();
        return searchFlights.flightsTo(intermediateAirport) + searchFlights.flightsFrom(intermediateAirport);
    }
}


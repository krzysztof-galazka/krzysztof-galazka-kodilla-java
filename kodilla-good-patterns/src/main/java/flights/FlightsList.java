package flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {

    private Set<Flight> flights = new HashSet<>();

    public FlightsList(){
        flights.add(new Flight("WARSZAWA", "WROCŁAW"));
        flights.add(new Flight("WARSZAWA", "KATOWICE"));
        flights.add(new Flight("WARSZAWA", "GDAŃSK"));
        flights.add(new Flight("GDAŃSK", "WROCŁAW"));
        flights.add(new Flight("GDAŃSK", "WARSZAWA"));
        flights.add(new Flight("GDAŃSK", "KATOWICE"));
        flights.add(new Flight("KATOWICE", "GDAŃSK"));
        flights.add(new Flight("WROCŁAW", "WARSZAWA"));
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }
}

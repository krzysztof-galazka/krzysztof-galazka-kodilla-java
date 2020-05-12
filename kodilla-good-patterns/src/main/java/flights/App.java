package flights;

public class App {
    public static void main(String[] args) {

        SearchFlights searchFlights = new SearchFlights();
        String flightFrom = searchFlights.flightsFrom("WARSZAWA");
        System.out.printf("FLIGHT FROM WARSZAWA: ");
        System.out.printf(flightFrom);

        String flightsVia = searchFlights.flightsVia("WROCŁAW");
        System.out.println("Flights via WROCŁAW: ");
        System.out.println(flightsVia);
    }
}

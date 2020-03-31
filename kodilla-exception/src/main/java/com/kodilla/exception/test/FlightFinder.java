package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public static void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("WAW", true);
        airports.put("CDG", false);
        airports.put("JFK", true);

        if (airports.containsKey(flight.getArrivalAirport())) {
            if (airports.get(flight.getArrivalAirport())) {
                System.out.println("Fly from: " + flight.getDepartureAirport() + ", to: " + flight.getArrivalAirport());
            } else {
                System.out.println("You can't flight");
                throw new RouteNotFoundException(flight.getDepartureAirport() + " to:" + flight.getArrivalAirport());
            }
        } else {
            System.out.println("There is no flight!");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("WAW", "CDG");
        Flight flight2 = new Flight("JFK", "WAW");
        Flight flight3 = new Flight("JFK", "CDG");
        Flight fly = flight3;
        try {
            findFlight(fly);
        } catch (RouteNotFoundException e) {
            System.out.println("From: " + fly.getArrivalAirport() + " airport is no fly.");
        }
    }
}


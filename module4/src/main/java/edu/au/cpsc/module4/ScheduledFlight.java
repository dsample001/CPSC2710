package edu.au.cpsc.module4;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ScheduledFlight {

    private String flightDesignator;
    private String departureAirportIdent;
    private java.time.LocalTime departureTime;
    private String arrivalAirportIdent;
    private java.time.LocalTime arrivalTime;
    private HashSet<String> daysOfWeek;

    public static List<ScheduledFlight> demoScheduledFlights() {
        HashSet<String> daysOfWeekSet1 = new HashSet<>() {{add("M"); add("T"); add("S"); }};
        return List.of(new ScheduledFlight("DL1133", "ATL", LocalTime.NOON,
                "LAX", LocalTime.NOON, daysOfWeekSet1));
    }

    public ScheduledFlight(String flightDesignator, String departureAirportIdent, LocalTime departureTime,
                           String arrivalAirportIdent, LocalTime arrivalTime, HashSet<String> daysOfWeek) {
        this.flightDesignator = flightDesignator;
        this.departureAirportIdent = departureAirportIdent;
        this.departureTime = departureTime;
        this.arrivalAirportIdent = arrivalAirportIdent;
        this.arrivalTime = arrivalTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getFlightDesignator() {
        return flightDesignator;
    }

    public void setFlightDesignator(String flightDesignator) {
        if (flightDesignator == null) {
            throw new IllegalArgumentException("flightDesignator is null");
        }
        this.flightDesignator = flightDesignator;
    }

    public String getDepartureAirportIdent() {
        return departureAirportIdent;
    }

    public void setDepartureAirportIdent(String departureAirportIdent) {
        if (departureAirportIdent == null) {
            throw new IllegalArgumentException("departureAirportIdent is null");
        }
        this.departureAirportIdent = departureAirportIdent;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        if (departureTime == null) {
            throw new IllegalArgumentException("departureTime is null");
        }
        this.departureTime = departureTime;
    }

    public String getArrivalAirportIdent() {
        return arrivalAirportIdent;
    }

    public void setArrivalAirportIdent(String arrivalAirportIdent) {
        if (arrivalAirportIdent == null) {
            throw new IllegalArgumentException("arrivalAirportIdent is null");
        }
        this.arrivalAirportIdent = arrivalAirportIdent;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        if (arrivalTime == null) {
            throw new IllegalArgumentException("arrivalTime is null");
        }
        this.arrivalTime = arrivalTime;
    }

    public Set<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(HashSet<String> daysOfWeek) {
        if (daysOfWeek == null) {
            throw new IllegalArgumentException("daysOfWeek is null");
        }
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "ScheduledFlight{" +
                "flightDesignator='" + flightDesignator + '\'' +
                ", departureAirportIdent='" + departureAirportIdent + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalAirportIdent='" + arrivalAirportIdent + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledFlight scheduledFlight)) {
            return false;
        }
        if (!Objects.equals(flightDesignator, scheduledFlight.flightDesignator)) {
            return false;
        }
        if (!Objects.equals(departureAirportIdent, scheduledFlight.departureAirportIdent)) {
            return false;
        }
        if (!Objects.equals(departureTime, scheduledFlight.departureTime)) {
            return false;
        }
        if (!Objects.equals(arrivalAirportIdent, scheduledFlight.arrivalAirportIdent)) {
            return false;
        }
        if (!Objects.equals(arrivalTime, scheduledFlight.arrivalTime)) {
            return false;
        }
        return !Objects.equals(daysOfWeek, scheduledFlight.daysOfWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightDesignator, departureAirportIdent, departureTime, arrivalAirportIdent, arrivalTime, daysOfWeek);
    }
}

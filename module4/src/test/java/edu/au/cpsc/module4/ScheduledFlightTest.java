package edu.au.cpsc.module4;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.*;

class ScheduledFlightTest {

    @Test
    void givenNewScheduledFlightThenGettersReturnConstructorArgument() {
       HashSet<String> daysOfWeekSet = new HashSet<>() {{add("M"); add("T"); add("S"); }};

        ScheduledFlight sf1 = new ScheduledFlight("DL1133", "ATL", LocalTime.NOON,
                "LAX", LocalTime.NOON, daysOfWeekSet);

        assertEquals("DL1133", sf1.getFlightDesignator());
        assertEquals("ATL", sf1.getDepartureAirportIdent());
        assertEquals(LocalTime.NOON, sf1.getDepartureTime() );
        assertEquals("LAX", sf1.getArrivalAirportIdent());
        assertEquals(LocalTime.NOON, sf1.getArrivalTime());
        assertEquals(daysOfWeekSet, sf1.getDaysOfWeek());
    }







}
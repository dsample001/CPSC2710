package edu.au.cpsc.module4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AirlineDatabase implements Serializable {

    private List<ScheduledFlight> scheduledFlightList;

    public AirlineDatabase() {
        scheduledFlightList = new ArrayList<>();
    }

    public List<ScheduledFlight> getScheduledFlights() {
        return scheduledFlightList;
    }

    public void addScheduledFlight(ScheduledFlight sf) {
        scheduledFlightList.add(sf);
    }

    public void removeScheduledFlight(ScheduledFlight sf) {
        scheduledFlightList.remove(sf);
    }

    public void updateScheduledFlight(ScheduledFlight sf) {
        // nothing to do
        // we already reference the updated object
        //
        // if this was a relational database, we'd execute a SQL  UPDATE
    }
}

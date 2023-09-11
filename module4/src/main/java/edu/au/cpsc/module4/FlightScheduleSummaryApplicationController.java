package edu.au.cpsc.module4;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class FlightScheduleSummaryApplicationController {

    @FXML
    private TableView<ScheduledFlight> flightScheduleTable;

    @FXML
    private FlightScheduleTableViewController flightScheduleTableViewController;

    @FXML
    private FlightScheduleDetailViewController flightScheduleDetailViewController;

    public void initialize() {
        flightScheduleTableViewController.showFlightSchedule(ScheduledFlight.demoScheduledFlights());

        flightScheduleTableViewController.setFlightScheduleDetailViewController(flightScheduleDetailViewController);
        flightScheduleTable.addEventHandler(FlightScheduleTableViewController.FlightScheduleEvent.FLIGHT_SCHEDULE_SELECTED,
                event -> flightScheduleDetailViewController.showScheduledFlight(event.getSelectedFlightSchedule()));
    }
}
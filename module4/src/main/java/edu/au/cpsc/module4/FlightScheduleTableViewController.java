package edu.au.cpsc.module4;

import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class FlightScheduleTableViewController {


    private FlightScheduleDetailViewController flightScheduleDetailViewController;

    @FXML
    private TableView<ScheduledFlight> flightScheduleTableView;

    @FXML
    private TableColumn<ScheduledFlight, String> flightDesignatorColumn, departureAirportColumn, arrivalAirportColumn,
    daysOfWeekColumn;

    //@FXML
    //private TableColumn<ScheduledFlight, HashSet<String>> daysOfWeekColumn;

    //@FXML
    //private TextField flightDesignatorTextField, departureAirportTextField, departureTimeTextField,
    //  arrivalAirportTextField, arrivalTimeTextField;

    @FXML
    private TextField flightDesignatorTextField1, departureAirportTextField1, departureTimeTextField1,
            arrivalAirportTextField1, arrivalTimeTextField1, daysOfWeekTextField1;


    public void initialize() {
        flightDesignatorColumn.setCellValueFactory(
                new PropertyValueFactory<ScheduledFlight, String>("flightDesignator"));
        departureAirportColumn.setCellValueFactory(
                new PropertyValueFactory<ScheduledFlight, String>("departureAirportIdent"));
        arrivalAirportColumn.setCellValueFactory(
                new PropertyValueFactory<ScheduledFlight, String>("arrivalAirportIdent"));
        daysOfWeekColumn.setCellValueFactory(new PropertyValueFactory<ScheduledFlight, String>("daysOfWeek"));


        flightScheduleTableView.getSelectionModel().selectedIndexProperty().addListener(event -> tableSelectionChanged());
    }

    public void showFlightSchedule(List<ScheduledFlight> flightSchedule) {
        SortedList<ScheduledFlight> sortedList = new SortedList<>(FXCollections.observableList(flightSchedule));
        flightScheduleTableView.setItems(sortedList);
        sortedList.comparatorProperty().bind(flightScheduleTableView.comparatorProperty());
        flightScheduleTableView.refresh();
    }

    private void tableSelectionChanged() {
        ScheduledFlight selectedFlightSchedule = flightScheduleTableView.getSelectionModel().getSelectedItem();
        FlightScheduleEvent event = new FlightScheduleEvent(FlightScheduleEvent.FLIGHT_SCHEDULE_SELECTED,
                selectedFlightSchedule);
        // View had to fire event.
        flightScheduleTableView.fireEvent(event);

        // Commented out because I get a null pointer exception when.
        // Finally got this working at 10PM....Ugh
        //flightScheduleDetailViewController.showScheduledFlight(selectedFlightSchedule);


        /*
        // Remove this section after debugging.
        // I think I have an issue with controller id, but cant find it...
        // It will look like crap but I will try to complete some more of the assignment in this view/controller.
        if (selectedFlightSchedule == null) {
            flightDesignatorTextField1.clear();
            departureAirportTextField1.clear();
            departureTimeTextField1.clear();
            arrivalAirportTextField1.clear();
            arrivalTimeTextField1.clear();
            daysOfWeekTextField1.clear();
        }

        flightDesignatorTextField1.setText(selectedFlightSchedule.getFlightDesignator());
        departureAirportTextField1.setText(selectedFlightSchedule.getDepartureAirportIdent());
        departureTimeTextField1.setText(selectedFlightSchedule.getDepartureTime().toString());
        arrivalAirportTextField1.setText(selectedFlightSchedule.getArrivalAirportIdent());
        arrivalTimeTextField1.setText(selectedFlightSchedule.getArrivalTime().toString());
        daysOfWeekTextField1.setText(selectedFlightSchedule.getDaysOfWeek().toString());

         */
     }

    public void setFlightScheduleDetailViewController(
            FlightScheduleDetailViewController flightScheduleDetailViewController) {
        this.flightScheduleDetailViewController = flightScheduleDetailViewController;
    }

    /*
    public void showFlightSchedule(List<ScheduledFlight> scheduledFlights) {
        SortedList<ScheduledFlight> sortedList = new SortedList<>(FXCollections.observableList(scheduledFlights));
        flightScheduleTableView.setItems(sortedList);
        sortedList.comparatorProperty().bind(flightScheduleTableView.comparatorProperty());
        flightScheduleTableView.refresh();
    }
*/

     public static class FlightScheduleEvent extends Event {

        public static final EventType<FlightScheduleEvent> ANY = new EventType<>(Event.ANY, "ANY");

        public static final EventType<FlightScheduleEvent> FLIGHT_SCHEDULE_SELECTED = new EventType<>(ANY, "FLIGHT_SCHEDULE_SELECTED");

        private ScheduledFlight selectedFlightSchedule;

        public FlightScheduleEvent(EventType<? extends Event> eventType, ScheduledFlight selectedFlightSchedule) {
            super(eventType);
            this.selectedFlightSchedule = selectedFlightSchedule;
        }

        public ScheduledFlight getSelectedFlightSchedule() {
            return selectedFlightSchedule;
        }

     }







}

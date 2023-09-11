package edu.au.cpsc.module4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.time.LocalTime;

public class FlightScheduleDetailViewController {


    @FXML
    private TextField flightDesignatorTextField, departureAirportTextField, departureTimeTextField,
            arrivalAirportTextField, arrivalTimeTextField;

    public void showScheduledFlight(ScheduledFlight scheduledFlight) {

        if (scheduledFlight == null) {
            flightDesignatorTextField.clear();
            departureAirportTextField.clear();
            departureTimeTextField.clear();
            arrivalAirportTextField.clear();
            arrivalTimeTextField.clear();
        }

        flightDesignatorTextField.setText(scheduledFlight.getFlightDesignator());
        departureAirportTextField.setText(scheduledFlight.getDepartureAirportIdent());
        departureTimeTextField.setText(scheduledFlight.getDepartureTime().toString());
        arrivalAirportTextField.setText(scheduledFlight.getArrivalAirportIdent());
        arrivalTimeTextField.setText(scheduledFlight.getArrivalTime().toString());
    }

    public void updateFlightSchedule(ScheduledFlight scheduledFlight) {
        scheduledFlight.setFlightDesignator(flightDesignatorTextField.getText());
        scheduledFlight.setDepartureAirportIdent(departureAirportTextField.getText());
        scheduledFlight.setDepartureTime(LocalTime.parse(departureTimeTextField.getText()));
        scheduledFlight.setArrivalAirportIdent(arrivalAirportTextField.getText());
        scheduledFlight.setArrivalTime(LocalTime.parse(arrivalTimeTextField.getText()));
    }
}







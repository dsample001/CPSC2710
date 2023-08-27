package edu.au.cpsc.module2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;


public class SeatReservationApplication extends Application {

    TextField flightDesignatorTextField = new TextField();
    DatePicker flightDateDatePicker = new DatePicker();
    TextField firstNameTextField = new TextField();
    TextField lastNameTextField = new TextField();
    TextField numberOfBagsTextField = new TextField();
    CheckBox flyingWithInfantCheckBox = new CheckBox();
    TextField numberOfPassengersTextField = new TextField();
    SeatReservation seatReservation = new SeatReservation();

    @Override
    public void start(Stage stage) {

        //Initialize seatReservation variables.
        seatReservation.setFlightDesignator("DL1331");
        seatReservation.setFlightDate(LocalDate.now());
        seatReservation.setFirstName("Daniel");
        seatReservation.setLastName("Sample");
        seatReservation.setNumberOfBags(2);
        seatReservation.makeNotFlyingWithInfant();

        GridPane centerPane = createCenterPane();
        HBox bottomButtons = createBottomButtons();

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(centerPane);
        borderPane.setBottom(bottomButtons);
        borderPane.setPadding(new Insets(10, 10, 10, 10));

        updateUI();

        Scene scene = new Scene(borderPane, 325, 260);
        stage.setTitle("Make Reservation");
        stage.setScene(scene);
        stage.show();
    }

    private HBox createBottomButtons() {

        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        HBox bottomButtons = new HBox(saveButton, cancelButton);
        bottomButtons.setAlignment(Pos.TOP_RIGHT);
        bottomButtons.setSpacing(10);

        // Button click events.
        saveButton.setOnAction(event -> saveClicked());
        cancelButton.setOnAction(event -> cancelClicked());

        return bottomButtons;
    }

    private static void cancelClicked() {
        System.out.println("Cancel Clicked");
        Platform.exit();
    }

    private void saveClicked() {
        //variable to flag if illegal argument exception is caught.
        boolean errorCaught = false;

        System.out.println("Save Clicked");

        // try catch illegal argument for flightDesignator.
        try {
            seatReservation.setFlightDesignator(flightDesignatorTextField.getText());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Flight Designator.  Please enter a valid Flight in the "
                    + "format of 'DL1313'");
            errorCaught = true;
        }

        // Check if illegal argument is caught then skip rest of method.
        if (!errorCaught) {
            seatReservation.setFlightDate(flightDateDatePicker.getValue());
            seatReservation.setFirstName(firstNameTextField.getText());
            seatReservation.setLastName(lastNameTextField.getText());
            seatReservation.setNumberOfBags(Integer.parseInt(numberOfBagsTextField.getText()));

            if (flyingWithInfantCheckBox.isSelected()) {
                seatReservation.makeFlyingWithInfant();
            } else {
                seatReservation.makeNotFlyingWithInfant();
            }

            // No action on number of passengers?
            //TextField numberOfPassengersTextField = new
            System.out.println(seatReservation.toString());

            // Save complete, exit application.
            Platform.exit();
        }
    }

    private GridPane createCenterPane() {

        GridPane centerGridPane = new GridPane();

        // Flight designator label and textBox.
        Label flightDesignatorLabel = new Label("Flight Designator:");
        centerGridPane.add(flightDesignatorLabel, 0, 0);
        centerGridPane.add(flightDesignatorTextField, 1, 0);

        // Flight Date label and date picker.
        Label flightDateLabel = new Label("Flight Date:");
        centerGridPane.add(flightDateLabel, 0, 1);
        centerGridPane.add(flightDateDatePicker, 1, 1);

        // First name label and textBox.
        Label firstNameLabel = new Label("First Name:");
        centerGridPane.add(firstNameLabel, 0, 2);
        centerGridPane.add(firstNameTextField, 1, 2);

        // Last name label and textBox.
        Label lastNameLabel = new Label("Last Name:");
        centerGridPane.add(lastNameLabel, 0, 3);
        centerGridPane.add(lastNameTextField, 1, 3);

        // Number of bags label and textBox.
        Label numberOfBagsLabel = new Label("Number of Bags:");
        centerGridPane.add(numberOfBagsLabel, 0, 4);
        centerGridPane.add(numberOfBagsTextField, 1, 4);

        // Flying with child label and checkbox.
        Label flyingWithInfantLabel = new Label("Flying with Infant:");
        centerGridPane.add(flyingWithInfantLabel, 0, 5);
        centerGridPane.add(flyingWithInfantCheckBox, 1, 5);

        // Number of passengers label and textBox.
        Label numberOfPassengersLabel = new Label("Number of Passengers:");
        centerGridPane.add(numberOfPassengersLabel, 0, 6);
        centerGridPane.add(numberOfPassengersTextField, 1, 6);
        numberOfPassengersTextField.setText("1");
        numberOfPassengersTextField.setEditable(false);

        centerGridPane.setVgap(5);
        centerGridPane.setHgap(5);

        // Flying with child checkbox event.
        flyingWithInfantCheckBox.setOnAction(event -> infantClicked());

        return centerGridPane;
    }

    private void infantClicked() {
        if (flyingWithInfantCheckBox.isSelected()) {
            numberOfPassengersTextField.setText("2");
        } else {
            numberOfPassengersTextField.setText("1");
        }
    }

    private void updateUI() {
        flightDesignatorTextField.setText(seatReservation.getFlightDesignator());
        flightDateDatePicker.setValue(LocalDate.now());
        firstNameTextField.setText(seatReservation.getFirstName());
        lastNameTextField.setText(seatReservation.getLastName());
        numberOfBagsTextField.setText(Integer.toString(seatReservation.getNumberOfBags()));
        flyingWithInfantCheckBox.setSelected(seatReservation.isFlyingWithInfant());
    }

    public static void main(String[] args) {
        launch();
    }
}
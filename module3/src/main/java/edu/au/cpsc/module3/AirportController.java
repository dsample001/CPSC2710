package edu.au.cpsc.module3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AirportController implements Initializable {


    @FXML
    private Label returnLabel;

    @FXML
    private TextField identSearchTextField;

    @FXML
    private TextField iataSearchTextField;

    @FXML
    private TextField localSearchTextField;

    @FXML
    private TextField identTextField;

    @FXML
    private TextField iataTextField;

    @FXML
    private TextField localTextField;

    @FXML
    private TextField typeTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField elevationTextField;

    @FXML
    private TextField countryTextField;

    @FXML
    private TextField regionTextField;

    @FXML
    private TextField municipalityTextField;

    @FXML
    private WebView webView;

    @FXML
    protected void identAction() {

        String searchString = identSearchTextField.getText();

        Airport newAirport;
        newAirport = Airport.findAirportIdent(airports, searchString);

        if (newAirport == null) {
            returnLabel.setText("Airport Not Found.");
            clearTextFields();
        }
        else {
            returnLabel.setText("Airport Found.");

            identTextField.setText(newAirport.getIdent());
            iataTextField.setText(newAirport.getIataCode());
            localTextField.setText(newAirport.getLocalCode());
            typeTextField.setText(newAirport.getType());
            nameTextField.setText(newAirport.getName());
            elevationTextField.setText(newAirport.getElevationFeet().toString());
            countryTextField.setText(newAirport.getIsoCountry());
            regionTextField.setText(newAirport.getIsoRegion());
            municipalityTextField.setText(newAirport.getMunicipality());

            // Load WebView.
            String url = "https://www.windy.com/?" + newAirport.getCoordinatesLatitude() + ","
                    + newAirport.getCoordinatesLongitude() + ",8";
            webView.getEngine().load(url);
        }
    }



    @FXML
    protected void iataAction() {

        String searchString = iataSearchTextField.getText();

        Airport newAirport;
        newAirport = Airport.findAirportIata(airports, searchString);

        if (newAirport == null) {
            returnLabel.setText("Airport Not Found.");
            clearTextFields();
        }
        else {
            returnLabel.setText("Airport Found.");
            identTextField.setText(newAirport.getIdent());
            iataTextField.setText(newAirport.getIataCode());
            localTextField.setText(newAirport.getLocalCode());
            typeTextField.setText(newAirport.getType());
            nameTextField.setText(newAirport.getName());
            elevationTextField.setText(newAirport.getElevationFeet().toString());
            countryTextField.setText(newAirport.getIsoCountry());
            regionTextField.setText(newAirport.getIsoRegion());
            municipalityTextField.setText(newAirport.getMunicipality());

            // Load WebView.
            String url = "https://www.windy.com/?" + newAirport.getCoordinatesLatitude() + ","
                    + newAirport.getCoordinatesLongitude() + ",8";
            webView.getEngine().load(url);
        }
    }

    @FXML
    protected void localCodeAction() {
        System.out.println("Local Code Field Action");
        System.out.println(localSearchTextField.getText());

        String searchString = localSearchTextField.getText();

        Airport newAirport;
        newAirport = Airport.findAirportLocalCode(airports, searchString);


        if (newAirport == null) {
            returnLabel.setText("Airport Not Found.");
            clearTextFields();
        }
        else {
            returnLabel.setText("Airport Found.");
            identTextField.setText(newAirport.getIdent());
            iataTextField.setText(newAirport.getIataCode());
            localTextField.setText(newAirport.getLocalCode());
            typeTextField.setText(newAirport.getType());
            nameTextField.setText(newAirport.getName());
            elevationTextField.setText(newAirport.getElevationFeet().toString());
            countryTextField.setText(newAirport.getIsoCountry());
            regionTextField.setText(newAirport.getIsoRegion());
            municipalityTextField.setText(newAirport.getMunicipality());

            // Load WebView.
            String url = "https://www.windy.com/?" + newAirport.getCoordinatesLatitude() + ","
                    + newAirport.getCoordinatesLongitude() + ",8";
            webView.getEngine().load(url);
        }
    }

    @FXML
    protected void searchButtonClick() {
        if (!identSearchTextField.getText().isEmpty()) {
            identAction();
        }

        else if (!iataSearchTextField.getText().isEmpty()) {
            iataAction();
        }

        else if (!localSearchTextField.getText().isEmpty()) {
            localCodeAction();
        }
        }

    @FXML void clearTextFields() {
        identTextField.setText("");
        iataTextField.setText("");
        localTextField.setText("");
        typeTextField.setText("");
        nameTextField.setText("");
        elevationTextField.setText("");
        countryTextField.setText("");
        regionTextField.setText("");
        municipalityTextField.setText("");
    }
    List<Airport> airports;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            airports = Airport.readAll();
        } catch (IOException e) {
            System.out.println("Can not find file.");
            throw new RuntimeException(e);
        }
    }
}
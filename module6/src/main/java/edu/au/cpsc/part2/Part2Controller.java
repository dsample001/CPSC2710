package edu.au.cpsc.part2;

import edu.au.cpsc.part2.uimodel.Part2Model;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Part2Controller {

    @FXML
    private Label nameLabel, orderLabel, partOrderedLabel, partDescriptionLabel, backOrderedLabel, messageLabel;

    @FXML
    private TextField nameTextField, orderTextField, partOrderedTextField, partDescriptionTextField;

    @FXML
    private CheckBox backOrderedCheckBox;

    @FXML
    private Button addButton, newButton, deleteButton;

    @FXML
    private MenuItem addMenuItem, newMenuItem, deleteMenuItem;

    private Part2Model model;

    public void initialize() {
        model = new Part2Model();
        nameTextField.textProperty().bindBidirectional(model.nameProperty());
        orderTextField.textProperty().bindBidirectional(model.orderProperty());
        partOrderedTextField.textProperty().bindBidirectional(model.partOrderedProperty());
        partDescriptionTextField.textProperty().bindBidirectional(model.partDescriptionProperty());
        //backOrderedCheckBox.selectedProperty().bindBidirectional(model.backorderSelectedProperty());


        // Name field is valid as long as not empty.
        BooleanBinding nameValidProperty = model.nameProperty().isEmpty();
        //model.nameValidProperty().bind(model.nameProperty().isEmpty());

        // orderNumber field is valid as long as not empty and not longer than 5 characters.
        BooleanBinding orderValid = model.orderProperty().isEmpty().or(
                orderTextField.textProperty().length().greaterThan(5));

        // orderNumber field is valid as long as not empty and not longer than 10 characters.
        BooleanBinding partOrderedValid = model.partOrderedProperty().isEmpty().or(
                partOrderedTextField.textProperty().length().greaterThan(10));

        // partDescription field is valid as long as not empty.
        BooleanBinding partDescriptionValid = model.partDescriptionProperty().isEmpty();

        /* Cant get anything to work
        // This was supposed to change the message to indicate what field is not valid.
        messageLabel.textProperty().bind(Bindings.when(nameValid.not()).then("Enter valid Name."));
        messageLabel.textProperty().bind((ObservableValue<? extends String>) Bindings.when(nameValidProperty));
        */

        //nameTextField.backgroundProperty().bind((Bindings.when(model.isNameValidProperty())).then(Color.RED));

        // Disable add Button and MenuItem
        // I wanted to have all fields valid before add is enabled.
        addButton.disableProperty().bind(nameValidProperty.or(orderValid.or(partOrderedValid.or(partDescriptionValid))));
        addMenuItem.disableProperty().bind(nameValidProperty.or(orderValid.or(partOrderedValid.or(partDescriptionValid))));

        // Disable new Button and MenuItem, the or doesnt work well since the application class isnt complete.
        newButton.disableProperty().bind(model.modifiedProperty().or(model.newProperty()));
        newMenuItem.disableProperty().bind(model.newProperty().or(model.newProperty()));

        // Disable Delete Button and MenuItem.
        deleteButton.disableProperty().bind(model.modifiedProperty().or(model.newProperty()));
        deleteMenuItem.disableProperty().bind(model.modifiedProperty().or(model.newProperty()));


        //I wanted to change the messageLabel if backOrdered was checked.  Kept getting null pointer exc.
/*
        messageLabel.textProperty().bind(Bindings.when(
                backOrderedCheckBox.selectedProperty()).then(
                "Order is backordered.").otherwise(
                "not backordered."));
 */


    }
}

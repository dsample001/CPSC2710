package edu.au.cpsc.part1;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Part1Controller {

  @FXML
  private TextField messageTextField, echoTextField, firstBidirectionalTextField, secondBidirectionalTextField;

  @FXML
  private ImageView secretOverlayImageView;

  @FXML
  private Slider secretSlider;

  @FXML
  private CheckBox selectMeCheckBox;

  @FXML
  private Label selectMeLabel;

  @FXML
  private TextField tweetTextField;

  @FXML
  private Label numberOfCharactersLabel, validityLabel;

  public void initialize() {
    // your bindings go here

    /*
    1. Create a property binding so that whatever is typed in messageTextField also shows in echoTextField.
    */
    echoTextField.textProperty().bind(messageTextField.textProperty());

    /*
    2. Create a bi-directional property binding so that whatever is typed in firstBidirectionalTextField shows in
       secondBidirectionalTextField and vise versa.
    */
    firstBidirectionalTextField.textProperty().bindBidirectional(secondBidirectionalTextField.textProperty());

    /*
    3. Create a binding so that the opacity of the secretOverlapImageView is set by the value of the secretSlider.
    */
    secretOverlayImageView.opacityProperty().bind(secretSlider.valueProperty());

    /*
    4. Create a binding so that the selectMeLabel will display true/false depending on the state of selectMeCheckBox.
       Hints: CheckBox has a selectedProperty that is a Boolean property.  Labels have a textProperty but this must be
       some kind of string-like property (not a String!).  Most properties in JavaFX have an asString() method that
       returns a string-like property of some type.  The difference between asString() and toString() is that the
       former returns a property while the latter returns a String (which cannot be used for binding).
    */
    selectMeLabel.textProperty().bind(selectMeCheckBox.selectedProperty().asString());

    /*
    5. Create a binding so that numberOfCharactersLabel displays the number of letters in the tweetTextField.
       You will need length() and asString().
    */
    numberOfCharactersLabel.textProperty().bind(tweetTextField.textProperty().length().asString());

    /*
    6. Create a binding so that validityLabel displays "Valid" if there are 10 characters or fewer in tweetTextField
       and "Invalid" otherwise.  Hint: Use Bindings.when().
    */
    //validityLabel.textFillProperty().bind(Bindings.when(tweetTextField.textProperty().length().lessThanOrEqualTo(10)).then("Valid").otherwise("Invalid");
    validityLabel.textProperty().bind(
            Bindings.when(tweetTextField.textProperty().length().lessThanOrEqualTo(10)).
                    then("Valid").otherwise("Invalid"));
  }
}
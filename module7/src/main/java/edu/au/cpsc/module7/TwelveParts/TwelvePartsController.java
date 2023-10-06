package edu.au.cpsc.module7.TwelveParts;

import edu.au.cpsc.module7.FanucComment.FanucComment;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class TwelvePartsController {

    @FXML
    private AnchorPane baseAnchorPane;

    @FXML
    private Button fileToOpenButton, createFilesButton, cancelButton;

    @FXML
    private TextArea infoTextArea;

    @FXML
    private TextField fileToOpenTextField;

    FileChooser fileChooser = new FileChooser();

    @FXML
    protected void onFileOpenClick() {

        fileChooser.setTitle("Select Fanuc .ls file to copy to other 11 parts.");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Fanuc Ls File", "*.ls"),
                new FileChooser.ExtensionFilter("All Files", "*.*"));
        File fileOpen = fileChooser.showOpenDialog(new Stage());

        if (fileOpen.isFile()) {
            fileToOpenTextField.textProperty().set(fileOpen.getPath());
        }

        fileToOpenTextField.textProperty().set(fileOpen.getPath());
        infoTextArea.textProperty().set("Select create file to create programs for other parts.");
        createFilesButton.disableProperty().set(false);
    }

    @FXML
    protected void onCreateFilesClick() {
        TwelveParts tp = new TwelveParts();
        String fileOpenPath = fileToOpenTextField.textProperty().get();
        tp.createFiles(fileOpenPath);
        infoTextArea.textProperty().set("Files created!");
    }

    @FXML
    protected void onCancelClick() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void initialize() {
        fileToOpenButton.disableProperty().set(false);
        createFilesButton.disableProperty().set(true);
        cancelButton.disableProperty().set(false);

        // Fanuc Yellow.
        baseAnchorPane.setBackground(Background.fill(Color.web("#f3da0b")));

        // Set initial message for text area.
        String message = "Select Fanuc .ls file to create programs for the other 11 parts on this project.";
        message += "\n\nThe following will be modified in each new program:";
        message += "\n 1. Each program will have an _ and number corresponding to the part #.";
        message += "\n 2. The argument passed to LOAD_USER_FRAME(#) will be incremented based on part #";
        message += "\n 3. The argument passed to ERROR_CHECK(#) and FLOW_CHECK(#) will be incremented based on part#";
        message += "\n 4. The move to position register PR[##] will be modified based on the part #.";
        infoTextArea.textProperty().set(message);
    }
}

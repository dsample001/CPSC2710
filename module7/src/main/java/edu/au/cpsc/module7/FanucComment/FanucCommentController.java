package edu.au.cpsc.module7.FanucComment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;

/**
 * Program creates a Fanuc .ls program with all non motion statements commented out.  This makes import into Delmia
 * simulation software easier.
 *
 * Module 07
 * @author Daniel Sample - CPSC 2710
 * @version 2023.10.04
*/
public class FanucCommentController {

    @FXML
    private Button cancelButton, createFileButton, fileOpenButton, fileToCreateButton;

    @FXML
    private TextArea infoTextArea;

    @FXML
    private TextField fileToOpenTextField, fileToCreateTextField;

    @FXML
    private AnchorPane baseAnchorPane;

    FileChooser fileChooser = new FileChooser();

    @FXML
    protected void onFileOpenClick() {

        fileChooser.setTitle("Select Fanuc .ls file to comment out");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Fanuc Ls File", "*.ls"),
                new FileChooser.ExtensionFilter("All Files", "*.*"));
        File fileOpen = fileChooser.showOpenDialog(new Stage());

        if (fileOpen.isFile()) {
            fileToOpenTextField.textProperty().set(fileOpen.getPath());
        }

        fileToOpenTextField.textProperty().set(fileOpen.getPath());
        infoTextArea.textProperty().set("Choose the file name to save the commented .ls file.");
        fileToCreateButton.disableProperty().set(false);
    }

    @FXML
    protected void onFileToCreateClick() {

        fileChooser.setTitle("Name The Fanuc .LS File To Output");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Fanuc Ls File", "*.ls"),
                new FileChooser.ExtensionFilter("All Files", "*.*"));
        File fileToSave = fileChooser.showSaveDialog(new Stage());
        fileToCreateTextField.textProperty().set(fileToSave.getPath());

        infoTextArea.textProperty().set("Select the Create File button to create the commented .ls file.");
        createFileButton.disableProperty().set(false);
    }

    @FXML
    protected void onCreateFileClick() {
    FanucComment fc = new FanucComment();
    String fileToOpenPath = fileToOpenTextField.textProperty().get();
    String fileToCreatePath = fileToCreateTextField.textProperty().get();
    fc.createFile(fileToOpenPath, fileToCreatePath);
    infoTextArea.textProperty().set("File created!");
    }

    @FXML
    protected void onCancelClick() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void initialize() {
        fileOpenButton.disableProperty().set(false);
        fileToCreateButton.disableProperty().set(true);
        cancelButton.disableProperty().set(false);
        createFileButton.disableProperty().set(true);

        // Fanuc Yellow.
        baseAnchorPane.setBackground(Background.fill(Color.web("#f3da0b")));

        // Set initial message for text area.
        infoTextArea.textProperty().set("Select Fanuc .ls file to comment out all non motion statements.");
    }
}

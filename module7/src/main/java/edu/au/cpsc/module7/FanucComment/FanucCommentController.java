package edu.au.cpsc.module7.FanucComment;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;


public class FanucCommentController {


    @FXML
    private Button cancelButton, createFileButton, fileOpenButton, fileToCreateButton;

    @FXML
    private TextArea infoTextArea;

    @FXML
    private TextField fileToOpenTextField, fileToCreateTextField;


    FileChooser fileChooser = new FileChooser();
    //File openFile, fileToSave;

    @FXML
    protected void onFileOpenClick() throws IOException {

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
    protected void onFileToCreateClick() throws IOException {

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
    protected void onCreateFileClick() throws IOException {
    FanucComment fc = new FanucComment();
    String fileToOpenPath = fileToOpenTextField.textProperty().get();
    String fileToCreatePath = fileToCreateTextField.textProperty().get();
    fc.createFile(fileToOpenPath, fileToCreatePath);

        //FanucCommentController.generateCommentFile(openFile, fileToSave);


    }

    @FXML
    protected void onCancelClick() throws IOException {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        //System.exit(-1);

    }


    public void initialize() {
        fileOpenButton.disableProperty().set(false);
        fileToCreateButton.disableProperty().set(true);
        cancelButton.disableProperty().set(false);
        createFileButton.disableProperty().set(true);

        infoTextArea.textProperty().set("Select Fanuc .ls file to comment out all non motion statements.");


    }
}

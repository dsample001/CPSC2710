package edu.au.cpsc.module7.FanucComment;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;


public class FanucCommentController {


    @FXML
    private Button fileOpenButton, fileToCreateButton;

    @FXML
    private TextField fileToOpenTextField, fileToCreateTextField;


    FileChooser fileChooser = new FileChooser();

    @FXML
    protected void onFileOpenClick() throws IOException {
        File fileOpen = fileChooser.showOpenDialog(new Stage());
        fileToOpenTextField.textProperty().set(fileOpen.getPath());
    }

    @FXML
    protected void onFileToCreateClick() throws IOException {
    File fileToSave = fileChooser.showSaveDialog(new Stage());
        fileToCreateTextField.textProperty().set(fileToSave.getPath());
        }




}

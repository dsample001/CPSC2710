package edu.au.cpsc.module7;

import edu.au.cpsc.module7.TwelveParts.TwelvePartsController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;


    /*
    @FXML
    protected void onCommentClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
     */

    @FXML
    protected void onCommentClick() throws IOException {

        System.out.println("button clicked");

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fanuc-comment-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Fanuc Comment Tool");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onTwelvePartsClick() throws IOException {

        System.out.println("Twelve Parts button clicked");

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("twelve-parts-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Populate Twelve Parts");
        stage.setScene(scene);
        stage.show();

    }
}
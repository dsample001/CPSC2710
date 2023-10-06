package edu.au.cpsc.module7;

import edu.au.cpsc.module7.TwelveParts.TwelvePartsController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;



public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    private VBox baseVBox;

    @FXML
    protected void onCommentClick() throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fanuc-comment-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Fanuc Comment Tool");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onTwelvePartsClick() throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("twelve-parts-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Populate Twelve Parts");
        stage.setScene(scene);
        stage.show();
    }

    public void initialize() {
        // Fanuc Yellow.
        baseVBox.setBackground(Background.fill(Color.web("#f3da0b")));
    }
}
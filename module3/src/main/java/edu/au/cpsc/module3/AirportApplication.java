package edu.au.cpsc.module3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AirportApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AirportApplication.class.getResource("Airport-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 480);
        stage.setTitle("Airport Info & Weather.");
        stage.setScene(scene);
        stage.setMinWidth(700);
        stage.setMinHeight(480);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
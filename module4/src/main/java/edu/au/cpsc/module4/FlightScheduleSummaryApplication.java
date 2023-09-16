package edu.au.cpsc.module4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FlightScheduleSummaryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FlightScheduleSummaryApplication.class.getResource("flight-schedule-summary-app.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 480);
        stage.setTitle("Flight Information Editor");
        stage.setScene(scene);
        stage.setMinWidth(650);
        stage.setMinHeight(480);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
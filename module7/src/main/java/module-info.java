module edu.au.cpsc.module7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.au.cpsc.module7 to javafx.fxml;
    exports edu.au.cpsc.module7;

    exports edu.au.cpsc.module7.FanucComment;
    opens edu.au.cpsc.module7.FanucComment to javafx.fxml;

    exports edu.au.cpsc.module7.TwelveParts;
    opens edu.au.cpsc.module7.TwelveParts to javafx.fxml;
}
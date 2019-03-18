package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    public void Submit(ActionEvent actionEvent) {
    }

    @FXML private Label labelica;

    public void sayHelloWorld(ActionEvent actionEvent) {
        labelica.setText("Hello Wolrd!");
    }
}

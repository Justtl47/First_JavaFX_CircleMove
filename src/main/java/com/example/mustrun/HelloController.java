package com.example.mustrun;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void down(javafx.event.ActionEvent actionEvent) {
        myCircle.setCenterY(y = y + 10);
    }

    public void up(ActionEvent actionEvent) {
        myCircle.setCenterY(y = y - 10);
    }

    public void left(ActionEvent actionEvent) {
        myCircle.setCenterX(x = x - 10);
    }

    public void right(ActionEvent actionEvent) {
        myCircle.setCenterX(x = x + 10);
    }
}
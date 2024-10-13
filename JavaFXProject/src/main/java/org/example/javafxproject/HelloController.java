package org.example.javafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML

    private Circle mycircle;
    private double x;
    private double y;



    public void up(ActionEvent u){
        System.out.println("UP");
//        mycircle.setCenterX(x=x);
        mycircle.setCenterY(y-=5);

        mycircle.setFill(Color.RED);
    }
    public void down(ActionEvent u){
        System.out.println("down");
        mycircle.setCenterY(y+=5);

        mycircle.setFill(Color.GREEN);

    }
    public void right(ActionEvent u){
        System.out.println("right");
        mycircle.setCenterX(x+=5);

        mycircle.setFill(Color.AQUA);

    }
    public void left(ActionEvent u){
        System.out.println("left");
        mycircle.setCenterX(x-=5);

        mycircle.setFill(Color.BLUE);
    }

}
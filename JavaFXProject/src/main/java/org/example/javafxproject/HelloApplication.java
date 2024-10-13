package org.example.javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {




    public static void main(String[] args) {
launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
//System.out.println("hello");
//creating a scene
//        Group root=new Group();

//            Scene scene=new Scene(root,800,800,Color.RED);


Parent root =FXMLLoader.load(getClass().getResource("hello-view.fxml"));
stage.setTitle("Shivkant Pandey");
stage.setScene(new Scene(root));


        Text text=new Text();
        text.setText("Shivkant Pandey");
        text.setX(200);
        text.setY(50);

//        text.caretShape(6,true);
//        text.getEffect();
//        text.setFont(Font.font("Verdana",45));
//        text.setFill(Color.WHITE);

//        text

//        Line line=new Line();
//        line.setStartX(100);
//        line.setStartY(100);
//        line.setEndX(700);
//        line.setEndY(100);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.BEIGE);
//        line.setOpacity(0.7);
//        line.setRotate(45);
//        line.setFill(Color.WHITE);
//        Rectangle rectangle=new Rectangle();
//        rectangle.setHeight(200);
//        rectangle.setWidth(200);
//        rectangle.setX(250);
//        rectangle.setY(130);
//        rectangle.setStrokeWidth(5);
//        rectangle.setStroke(Color.BLACK);
//        rectangle.setFill(Color.GREEN);
//
//        Polygon triangle=new Polygon();
//        triangle.getPoints().setAll(
//            100.0,100.0,
//                200.0,200.0,
//                100.0,300.0
//        );
//        triangle.setLayoutY(20);
//        triangle.setStroke(Color.GREEN);
//        triangle.setStrokeWidth(4);
//        triangle.setFill(Color.YELLOW);
//        Circle circle=new Circle();
//        circle.setRadius(50);
//        circle.setCenterY(400);
//        circle.setCenterX(120);
//        circle.setStroke(Color.BLUE);
//        circle.setStrokeWidth(3);
//        circle.setFill(Color.BEIGE);
//        Image img=new Image("l1.jpg");
//        ImageView imgview=new ImageView(img);
//        imgview.setX(250);
//        imgview.setY(350);
//
//        imgview.setFitHeight(200);
//        imgview.setFitWidth(200);
//        root.getChildren().add(imgview);
//        root.getChildren().add(circle);
//        root.getChildren().add(triangle);
//        root.getChildren().add(rectangle);
//        root.getChildren().add(line);
//        root.getChildren().add(text);
        Image icon=new Image("l4.jpg");
        stage.getIcons().add(icon);
//        stage.setTitle("New Project");
//        stage.setWidth(500);
//        stage.setHeight(500);
//        stage.setResizable(true);
//        stage.setScene(scene);
//        stage.setX(550);
//        stage.setY(100);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("press / to exit full screen");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("/"));
        stage.show();
    }
}
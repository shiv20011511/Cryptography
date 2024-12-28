package org.example.cryptography;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class homeController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void CE1(ActionEvent e)throws IOException {
        root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage =(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
//        String css=this.getClass().getResource("login.css").toExternalForm();
//        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }


    public void leave(){
        System.exit(0);
    }




}

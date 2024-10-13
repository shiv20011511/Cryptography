package org.example.cssinjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class scene2Controller {

    @FXML
    Label namelabel;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void display(String username){
        namelabel.setText("Hey "+username);
    }

    public void SwitchToScene1(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        String css=this.getClass().getResource("scene1.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }


}

package org.example.newjavafx;

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
    Label l;

    private Stage stage;
    private Scene scene;
    private Parent root;

        public void display(String username){
        l.setText(username);
    }

    public void Switch1(ActionEvent e)throws IOException {
//        (getClass().getResource("scene1.fxml"));
        root=FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}

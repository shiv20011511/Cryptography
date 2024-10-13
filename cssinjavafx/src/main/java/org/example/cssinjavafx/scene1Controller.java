package org.example.cssinjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class scene1Controller {


    @FXML
    TextField t1;


    @FXML
    Label warn;
    private Stage stage;
    private Scene scene;
    private Parent root;
//    private EventObject e vent;






    public void SwitchToScene2(ActionEvent event) throws IOException {

String username=t1.getText();

if(username.isEmpty()){
    warn.setText("Enter Name To Continue Further");
}else {

//System.out.println(user);
    FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
    root = loader.load();

    scene2Controller scene2Controller = loader.getController();
    scene2Controller.display(username);

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    String css = this.getClass().getResource("scene1.css").toExternalForm();
    scene.getStylesheets().add(css);
    stage.setScene(scene);

    stage.show();


}
    }



}

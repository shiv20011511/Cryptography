package org.example.newjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class scene1Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField t1;
    public void login(ActionEvent e) throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("scene2.fxml"));
        String username=t1.getText();
        root=loader.load();

        scene2Controller sc2=loader.getController();
        sc2.display(username);

        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

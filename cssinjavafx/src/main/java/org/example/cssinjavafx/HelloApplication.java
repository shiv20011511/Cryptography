package org.example.cssinjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        try{
//            Parent root=FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//            Scene scene=new Scene(root);
//            //scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
//            //to aply css more than one scene
//            String css=this.getClass().getResource("app.css").toExternalForm();
//            scene.getStylesheets().add(css);
//            stage.setScene(scene);
//            stage.setResizable(false);
//            stage.show();
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//the above code is to demonstrate how we can manuall add css Style in our javafx app

        //the below code is to swtich scenes

        try{
            Parent root=FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Scene scene=new Scene(root);
            String css=this.getClass().getResource("scene1.css").toExternalForm();
            scene.getStylesheets().add(css);
            stage.setScene(scene);

//            stage.setResizable(false);
            stage.show();

//
        }catch(Exception e){
            e.printStackTrace();
        }





    }

    public static void main(String[] args) {
        launch(args);
    }
}
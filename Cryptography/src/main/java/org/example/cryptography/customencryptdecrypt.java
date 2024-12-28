package org.example.cryptography;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class customencryptdecrypt {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button b1,b2,clear,leav;

    @FXML
    private TextArea ta1;

    @FXML
    private TextArea ta2;


    public void clear1(){

        ta2.setText("");
        ta1.setText("");
    }


    public void Encrypted(){

        String res=ta2.getText();

        try {
            String coded = Encrypt(res);

            ta1.setText(coded);
        }catch (Exception e){
            ta1.setText("Something Wrong");
        }
    }



    public void Decrypted(){
        String res=ta2.getText();
        try {
            String coded = Decrypt(res);

            if(coded.isEmpty()){
                ta1.setText("Please Provide valid Encrypted Text!");
            }else {
                ta1.setText(coded);
            }
        }catch (Exception e){
            ta1.setText("Please Provide valid Encrypted Text!");
        }
    }


    public String Encrypt(String p){

        int length=p.length();
        String[] plaintextarray =new String[length];
        for(int i=0;i<length;i++){
            plaintextarray[i]=Character.toString(p.charAt(i));
        }


        String coded="";
        int c=10;
        int count=0;
        String[] alpha={"("," ",".","%","[","!",";","S","]","T","a","E","U","b",")","V","c","W","d","Y","@","e","f","X","g","-","h","A","i",",","#","K","B","Z","j","C","k","l","!","D","J","m","$","F","n","^","I","o","H","p","G","q","*","r","s","t","0",">","<","?","1","2","3","u","-","|","&","v","+","w","{","x","/","}","y","z","N","4","M","5","L","6","7","P","8","\\","O","=","9","Q","R","//","_","\"",":","'","\n"};



        for(int i=0;i<length;i++){

            for(int j=0;j<alpha.length;j++){

                if(plaintextarray[i].equals(alpha[j])){
                    String d=Integer.toString(j);

                    String fg="200";
                    coded+=fg+d;
                    break;

                }

            }
            count++;
        }

        return coded;
    }

    public String Decrypt(String encrypted){
        String decoded="";



        String[] alpha={"("," ",".","%","[","!",";","S","]","T","a","E","U","b",")","V","c","W","d","Y","@","e","f","X","g","-","h","A","i",",","#","K","B","Z","j","C","k","l","!","D","J","m","$","F","n","^","I","o","H","p","G","q","*","r","s","t","0",">","<","?","1","2","3","u","-","|","&","v","+","w","{","x","/","}","y","z","N","4","M","5","L","6","7","P","8","\\","O","=","9","Q","R","//","_","\"",":","'","\n"};
        String s=encrypted.replace("200"," ");



        String[] numbers = s.trim().split("\\s+");

        long[] d=new long[numbers.length];
        for(int i=0;i<numbers.length;i++){


            d[i]=Integer.parseInt(numbers[i]);

        }
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<alpha.length;j++){
                if (d[i]==j){
                    decoded+=alpha[j];
                }
            }
        }
        return decoded;
    }

    public void leave(){
        System.exit(0);
    }


public void home(ActionEvent e)throws Exception{
    root= FXMLLoader.load(getClass().getResource("home.fxml"));
    stage =(Stage)((Node)e.getSource()).getScene().getWindow();
    scene=new Scene(root);
//        String css=this.getClass().getResource("login.css").toExternalForm();
//        scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();

}





}
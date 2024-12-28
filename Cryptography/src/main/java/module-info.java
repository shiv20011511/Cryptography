module org.example.cryptography {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cryptography to javafx.fxml;
    exports org.example.cryptography;
}
module org.example.cssinjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cssinjavafx to javafx.fxml;
    exports org.example.cssinjavafx;
}
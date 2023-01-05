module com.example.chat1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chat1 to javafx.fxml;
    exports com.example.chat1;
}
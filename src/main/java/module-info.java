module com.example.json {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens com.example.json to javafx.fxml;
    exports com.example.json;
}
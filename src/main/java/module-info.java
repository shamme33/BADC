module com.example.badc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.badc to javafx.fxml;
    exports com.example.badc;
}
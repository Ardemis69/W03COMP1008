module com.example.w03comp1008 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w03comp1008 to javafx.fxml;
    exports com.example.w03comp1008;
}
module com.example.essai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.essai to javafx.fxml;
    exports com.example.essai;
}
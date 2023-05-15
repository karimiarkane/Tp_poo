module com.example.essai {
    requires javafx.controls;
    requires javafx.fxml;


    opens tp_poo to javafx.fxml;
    exports tp_poo;
}
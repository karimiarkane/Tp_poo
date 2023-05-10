package com.example.essai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public void start(Stage stage) throws IOException {


        // Create a label for the text field
        Label label = new Label("Enter your pseudo code below:");

        // Create a text area for the user to enter their pseudo code
        TextArea textArea = new TextArea();

        // Create a VBox to hold the label and text area
        VBox vbox = new VBox();
        vbox.setSpacing(100);
        vbox.setPadding(new Insets(100));
        vbox.getChildren().addAll(label, textArea);
        stage.setTitle("hi!");

        Scene scene = new Scene( vbox,400, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
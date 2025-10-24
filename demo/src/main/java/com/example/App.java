package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        VBox mainLayout = new VBox(20);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setPadding(new Insets(40));
        mainLayout.setStyle("-fx-background: linear-gradient(to bottom, #cdbf60ff, #eeeeee);");

        VBox headerSection = createHeaderSection();
    }

    private VBox createHeaderSection()
    {
        VBox header = new VBox(10);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(20));

        Label titleLabel = new Label("Graduate Tracker");
        titleLabel.setFont(Font.font("Segoe UI", FontWeight.BOLD, 32));
    }
    public static void main(String[] args) {
        launch();
    }

}
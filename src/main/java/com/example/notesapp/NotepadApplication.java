package com.example.notesapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NotepadApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        NotepadApplication.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(NotepadApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
    public static Stage getStage(){
        return stage;
    }
}